package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019106 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite DDR = Deca-dodecasil 3R [ Si120O240 ]q R.
 * @author Sean A. Irvine
 */
public class A019106 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // DDR
    return "a-1: b-32(000) b-19(000) f-6(00+) d-4(000)\n"
      + "d-4: d-31(000) d-27(000)\n"
      + "f-6: a-13(0-0) a-8(-00) g-7(000)\n"
      + "b-19: b-36(0-+) e-33(00+) c-26(000)\n"
      + "b-2: b-40(+0-) e-33(000) a-18(000) c-10(000)\n"
      + "c-10: b-39(000) d-11(000)\n"
      + "a-18: b-38(000) f-22(00-) d-21(000)\n"
      + "c-3: b-40(000) b-14(000) g-7(00+) d-4(000)\n"
      + "g-7: c-15(0-0) c-10(-00)\n"
      + "b-14: b-38(0-+) e-37(000) a-24(000)\n"
      + "e-5: b-38(000) e-37(0+-) e-35(000) b-32(00-)\n"
      + "a-8: b-34(000) b-29(000) d-11(000)\n"
      + "a-13: b-36(000) b-25(000) d-16(000)\n"
      + "c-15: b-38(000) d-16(000)\n"
      + "d-11: d-27(000) d-21(000)\n"
      + "b-29: e-35(+00) b-32(+0-)\n"
      + "b-9: b-39(-+0) e-35(000) a-28(000) c-15(000)\n"
      + "a-28: b-40(000) d-31(000)\n"
      + "e-12: b-40(000) e-37(000) b-34(-00) e-33(-0+)\n"
      + "d-16: d-31(000) d-21(000)\n"
      + "b-25: e-37(0+0) b-34(-+0) c-30(000)\n"
      + "a-24: b-39(000) d-27(000)\n"
      + "e-17: b-39(000) b-36(0-0) e-35(+-0) e-33(000)\n"
      + "f-22: a-28(+00) a-24(0+0) g-23(000)\n"
      + "c-26: b-34(000) d-27(000)\n"
      + "c-20: b-36(000) b-29(000) g-23(00-) d-21(000)\n"
      + "g-23: c-30(+00) c-26(0+0)\n"
      + "c-30: b-32(000) d-31(000)\n";
  }
}

