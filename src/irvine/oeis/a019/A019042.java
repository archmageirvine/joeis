package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019042.
 * @author Sean A. Irvine
 */
public class A019042 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // MER
    return "a-1: a-16(000) a-13(000) a-11(0-0) a-8(000)\n"
      + "a-8: a-15(+00) a-12(000) a-9(000)\n"
      + "a-11: a-15(000)\n"
      + "a-2: a-15(000) a-13(0++) a-12(-00) a-5(000)\n"
      + "a-5: a-14(0+0) a-10(0++) a-9(000)\n"
      + "a-12: a-14(000)\n"
      + "a-3: a-15(+-0) a-14(000) a-9(0-0) a-7(000)\n"
      + "a-7: a-16(+00) a-11(+-0) a-10(000)\n"
      + "a-9: a-16(000)\n"
      + "a-4: a-16(000) a-14(-0-) a-10(-00) a-6(000)\n"
      + "a-6: a-13(0+0) a-12(-0-) a-11(000)\n"
      + "a-10: a-13(000)\n";
  }
}

