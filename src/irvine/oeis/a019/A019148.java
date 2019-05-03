package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019148 Cycle class sequence <code>c(n) (the</code> number of true cycles of length n in which a certain node is included) for zeolite MEL <code>= ZSM-11 Nan[ AlnSi96-nO192 ]</code>.
 * @author Sean A. Irvine
 */
public class A019148 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MEL
    return "a-1: a-44(-00) b-30(-00) e-19(-00) d-4(000)\n"
      + "d-4: d-37(000) g-21(000)\n"
      + "e-19: e-48(000) e-33(000)\n"
      + "b-30: d-32(+00) c-31(0-0)\n"
      + "a-44: d-47(000)\n"
      + "b-2: a-29(000) f-6(000) d-4(000) c-3(000)\n"
      + "c-3: c-41(000) g-7(000) e-5(000)\n"
      + "f-6: b-30(-00) f-27(0-0) f-13(-00)\n"
      + "a-29: e-38(000) d-32(000)\n"
      + "e-5: e-43(000) e-38(000) a-15(000)\n"
      + "g-7: d-37(000) c-31(000) d-18(000)\n"
      + "c-41: e-43(000)\n"
      + "g-21: c-36(000) d-32(000)\n"
      + "a-15: a-39(+00) b-35(000) d-18(000)\n"
      + "e-43: a-44(000)\n"
      + "f-13: b-45(00-) f-20(0--)\n"
      + "f-27: b-40(0+0)\n"
      + "d-18: d-32(++0)\n"
      + "c-31: e-33(0+0)\n"
      + "a-8: b-45(000) a-34(0-0) e-26(000) d-11(000)\n"
      + "d-11: d-42(0-0) g-28(00+)\n"
      + "e-26: e-48(000) e-38(000)\n"
      + "a-34: d-37(000)\n"
      + "b-45: d-47(00+) c-46(+00)\n"
      + "b-9: a-44(000) f-13(000) d-11(00-) c-10(0-0)\n"
      + "c-10: c-31(000) g-14(000) e-12(0+0)\n"
      + "e-12: e-43(000) e-33(000) a-22(0-0)\n"
      + "g-14: c-46(00-) d-42(00-) d-25(000)\n"
      + "g-28: d-47(000) c-41(000)\n"
      + "a-22: b-40(0+0) a-29(0+0) d-25(000)\n"
      + "e-33: a-34(0-0)\n"
      + "f-20: b-35(000) f-27(+0+)\n"
      + "d-25: d-47(-00)\n"
      + "c-46: e-48(-00)\n"
      + "b-35: d-37(000) c-36(000)\n"
      + "a-39: e-48(-00) d-42(000)\n"
      + "b-16: a-34(0-0) f-20(0-0) d-18(0-0) c-17(+00)\n"
      + "c-17: c-46(000) g-21(000) e-19(-00)\n"
      + "c-36: e-38(000)\n"
      + "b-40: d-42(0--) c-41(000)\n"
      + "b-23: a-39(+00) f-27(+0+) d-25(+0+) c-24(000)\n"
      + "c-24: c-36(000) g-28(00+) e-26(000)\n";
  }
}

