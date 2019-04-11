package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019010 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite EAB = TMA-E (Aiello and Barrer)(1) (Me4N)2Na7[ Al9Si27O7.
 * @author Sean A. Irvine
 */
public class A019010 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // EAB
    return "a-1: a-27(000) a-23(0-0) b-13(0--) b-2(000)\n"
      + "b-2: b-32(000) b-31(000) b-26(000)\n"
      + "b-13: b-35(000) b-24(000) b-20(000)\n"
      + "a-23: b-33(-00) b-24(00-)\n"
      + "a-27: b-32(000) b-28(00-)\n"
      + "a-3: a-29(000) a-25(000) b-18(000) b-4(000)\n"
      + "b-4: b-36(000) b-34(000) b-28(000)\n"
      + "b-18: b-32(000) b-26(000) b-22(000)\n"
      + "a-25: b-35(0-0) b-26(000)\n"
      + "a-29: b-34(000) b-30(-00)\n"
      + "a-5: a-27(000) a-19(-00) b-15(00-) b-6(-00)\n"
      + "b-6: b-33(000) b-31(000) b-30(000)\n"
      + "b-15: b-34(000) b-28(000) b-24(000)\n"
      + "a-19: b-31(000) b-20(0--)\n"
      + "a-7: a-29(+00) a-21(0-0) b-17(000) b-8(0-0)\n"
      + "b-8: b-36(000) b-35(000) b-20(000)\n"
      + "b-17: b-31(000) b-30(000) b-26(000)\n"
      + "a-21: b-36(000) b-22(000)\n"
      + "a-9: a-23(+00) a-19(0+0) b-14(00-) b-10(000)\n"
      + "b-10: b-33(000) b-32(000) b-22(000)\n"
      + "b-14: b-36(000) b-28(000) b-20(000)\n"
      + "a-11: a-25(0+0) a-21(-00) b-16(-00) b-12(000)\n"
      + "b-12: b-35(000) b-34(000) b-24(000)\n"
      + "b-16: b-33(000) b-30(000) b-22(000)\n";
  }
}

