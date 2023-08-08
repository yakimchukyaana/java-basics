public class JavaBasics {
    public static void main(String[] args) {

        //математические операторы
        int a = 20;
        int b = 10;
        int c = 30;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = " + (++a));
        System.out.println("b-- = " + (--b));

        //логические операторы
        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }

        if (a != b) {
            System.out.println("a != b");
        } else {
            System.out.println("a == b");
        }

        if (a > b) {
            System.out.println("a > b");
        }

        if (b < a) {
            System.out.println("b < a");
        }

        if (a > b && a > c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (a > b || a > c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //переполнение
        //byte
        byte varByte = 120;
        varByte += 10;
        System.out.println("varByte = " + varByte);

        //short
        short varShort = 32760;
        varShort += 10;
        System.out.println("varShort = " + varShort);

        //MAX_VALUE
        int varIntMaxValue = Integer.MAX_VALUE;
        System.out.println("varByteMaxValue + 1 = " + (varIntMaxValue + 1));

        //выражения с int и double
        int varInt = 1;
        double varDouble = 2.3;
        System.out.println("varInt1+varDouble1 = " + (varInt + varDouble));
        System.out.println("varInt1-varDouble1 = " + (varInt - varDouble));
        System.out.println("varInt1*varDouble1 = " + (varInt * varDouble));
        System.out.println("varInt1%varDouble1 = " + (varInt % varDouble));
        System.out.println("varInt1/varDouble1 = " + (varInt / varDouble));
    }
}
