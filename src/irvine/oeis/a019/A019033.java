package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019033 Cycle class sequence <code>c(2n) (the</code> number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite LTA = Linde Type A.
 * @author Sean A. Irvine
 */
public class A019033 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // LTA
    return "a-1: a-21(000) a-9(000) a-4(000) a-2(-00)\n"
      + "a-2: a-20(000) a-16(000) a-3(+-0)\n"
      + "a-4: a-19(000) a-11(000)\n"
      + "a-9: a-20(-00) a-19(000)\n"
      + "a-3: a-6(000) a-5(000) a-4(0+0)\n"
      + "a-16: a-24(0-0)\n"
      + "a-5: a-21(000) a-18(000) a-13(-00)\n"
      + "a-6: a-22(000) a-20(-+0) a-19(0+0)\n"
      + "a-11: a-23(0-0) a-16(000)\n"
      + "a-13: a-24(000) a-22(+0-) a-15(000)\n"
      + "a-18: a-23(000) a-22(00-)\n"
      + "a-7: a-22(000) a-15(-0+) a-12(00+) a-9(000)\n"
      + "a-12: a-21(000) a-18(000)\n"
      + "a-15: a-21(+00)\n"
      + "a-8: a-14(00-) a-12(000) a-11(000) a-10(000)\n"
      + "a-10: a-17(00-) a-16(000) a-15(000)\n"
      + "a-14: a-23(0-+) a-19(000) a-17(000)\n"
      + "a-17: a-24(0-+) a-20(000)\n"
      + "a-23: a-24(000)\n";
  }
}

