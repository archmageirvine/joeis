package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019155 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite MEP = Melanophlogite [ Si46O92 <code>] .</code> q R.
 * @author Sean A. Irvine
 */
public class A019155 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MEP
    return "a-1: b-38(000) b-27(000) b-24(000) b-23(0-0)\n"
      + "b-23: c-42(000)\n"
      + "b-24: c-45(0-0) b-29(-00)\n"
      + "b-27: c-41(000) b-30(-00)\n"
      + "b-38: c-44(000)\n"
      + "b-2: c-43(-00) b-20(00-) a-18(000) c-3(000)\n"
      + "c-3: c-34(000) b-25(000) b-24(000)\n"
      + "a-18: b-33(000) b-32(-00)\n"
      + "b-20: c-41(000) a-22(000) c-21(-00)\n"
      + "b-25: c-41(00-) b-31(0-0)\n"
      + "c-34: b-38(000) b-36(000)\n"
      + "a-4: b-35(00-) b-31(000) b-26(000) b-16(000)\n"
      + "b-16: c-42(000) b-36(000) c-17(000)\n"
      + "b-26: c-39(00-) b-28(0+0)\n"
      + "b-31: c-45(000)\n"
      + "b-35: c-46(000)\n"
      + "b-5: c-44(000) b-33(000) a-22(000) c-6(000)\n"
      + "c-6: b-35(000) b-23(000) c-15(000)\n"
      + "b-33: c-42(000) c-34(000)\n"
      + "c-15: b-31(00+) b-27(0+0)\n"
      + "a-7: b-37(000) b-30(000) b-29(000) b-19(0-0)\n"
      + "b-19: c-46(000) b-23(000)\n"
      + "b-29: c-43(000)\n"
      + "b-30: c-39(0-0)\n"
      + "b-37: c-40(000) b-38(000)\n"
      + "b-8: c-45(000) a-18(000) b-14(00-) c-9(-00)\n"
      + "c-9: b-29(0+0) b-26(000) c-17(000)\n"
      + "b-14: c-39(-00) a-22(000) c-15(000)\n"
      + "c-17: b-32(000) b-19(000)\n"
      + "a-10: b-36(000) b-28(000) b-25(000) b-13(00-)\n"
      + "b-13: c-44(000) b-35(000)\n"
      + "b-28: c-43(000)\n"
      + "b-36: c-40(000)\n"
      + "b-11: c-46(000) b-32(000) a-22(+00) c-12(000)\n"
      + "c-12: b-37(000) c-21(000) b-13(000)\n"
      + "b-32: c-40(000)\n"
      + "c-21: b-30(000) b-28(00+)\n"
      + "c-39: c-46(000)\n"
      + "c-42: c-45(000)\n"
      + "c-41: c-44(000)\n"
      + "c-40: c-43(000)\n";
  }
}

