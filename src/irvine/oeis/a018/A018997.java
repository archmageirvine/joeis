package irvine.oeis.a018;

/**
 * A018997 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite CAN = Cancrinite <code>Na6[ Al6Si6O24 ] . CaCO3 . 2 H2O</code>.
 * @author Sean A. Irvine
 */
public class A018997 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // CAN
    return "a-1: a-12(000) a-11(000) a-8(-0+) a-8(-00)\n"
      + "a-2: a-10(0-0) a-10(0--) a-9(000) a-8(000)\n"
      + "a-3: a-11(000) a-10(000) a-7(00+) a-7(000)\n"
      + "a-4: a-12(+00) a-12(+0-) a-8(000) a-7(000)\n"
      + "a-5: a-12(000) a-10(000) a-9(0++) a-9(0+0)\n"
      + "a-6: a-11(000) a-11(00-) a-9(000) a-7(000)\n";
  }
}

