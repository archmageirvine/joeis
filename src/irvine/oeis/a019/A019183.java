package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019183 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite MTN = ZSM-39 [ Si136O272 ] . q R.
 * @author Sean A. Irvine
 */
public class A019183 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MTN
    return "a-1: c-33(000) c-17(000) b-8(000) a-7(000)\n"
      + "a-7: a-18(00+) a-15(00+)\n"
      + "b-8: a-29(-00) a-28(0-0)\n"
      + "c-17: a-21(000)\n"
      + "b-2: a-26(0-0) a-25(-00) a-7(00-) c-3(000)\n"
      + "c-3: b-20(0-0) b-14(-00) b-8(00-)\n"
      + "a-25: a-34(+00)\n"
      + "a-26: b-32(0+0)\n"
      + "b-14: a-24(00-) a-22(000) a-19(0-0)\n"
      + "b-20: a-27(00-)\n"
      + "a-4: a-29(-00) a-25(-00) b-10(-00) a-9(000)\n"
      + "a-9: a-28(0-0) a-26(0-0)\n"
      + "b-10: c-33(000) a-18(00+)\n"
      + "b-5: c-17(000) a-15(00+) a-9(0+0) c-6(-00)\n"
      + "c-6: a-23(000) b-16(00+) b-10(0+0)\n"
      + "a-15: a-34(000) a-27(00-)\n"
      + "b-16: a-34(+00) b-32(0+0) a-31(000)\n"
      + "a-23: a-30(00+)\n"
      + "a-18: b-32(000) a-24(00-)\n"
      + "c-11: a-34(+00) a-21(+00) b-20(+00) a-19(000)\n"
      + "a-19: b-32(0+0)\n"
      + "a-21: a-29(-00) a-23(-00)\n"
      + "a-12: c-33(000) a-28(0-0) a-23(0-0) a-19(0-0)\n"
      + "a-13: a-31(000) a-26(000) b-20(000) c-17(000)\n"
      + "a-22: c-33(000) a-31(000) a-25(000)\n"
      + "a-24: a-30(00+) a-29(000)\n"
      + "a-27: a-30(00+) a-28(000)\n"
      + "a-30: a-31(000)\n";
  }
}

