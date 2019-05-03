package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019113 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite DOH = Dodecasil <code>1H [ Si34O68 ]</code> . q R.
 * @author Sean A. Irvine
 */
public class A019113 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // DOH
    return "a-1: b-33(00-) a-18(0-0) a-5(000) b-2(000)\n"
      + "b-2: d-8(000) c-7(000) c-3(000)\n"
      + "a-5: b-26(00-) a-9(-00) b-6(000)\n"
      + "a-18: b-21(00-) b-19(000)\n"
      + "b-33: c-34(000)\n"
      + "c-3: c-22(000) b-19(0-0) c-14(000)\n"
      + "c-7: c-34(000) c-17(000)\n"
      + "d-8: d-23(00-) b-16(000) b-10(000)\n"
      + "c-14: c-32(000)\n"
      + "b-19: c-20(000)\n"
      + "c-22: b-33(000) c-32(000)\n"
      + "d-4: d-30(00-) b-19(000) b-13(000) b-6(000)\n"
      + "b-6: c-11(000) c-7(000)\n"
      + "b-13: c-17(000) c-14(0+0)\n"
      + "a-9: b-31(00-) a-12(0-0) b-10(000)\n"
      + "b-26: c-34(000) d-30(000) c-27(000)\n"
      + "c-11: c-27(000) c-20(000)\n"
      + "c-17: c-25(000)\n"
      + "b-10: c-14(000) c-11(+00)\n"
      + "b-16: c-20(+00) c-17(000)\n"
      + "d-23: b-33(000) b-31(000) b-28(000)\n"
      + "a-12: b-24(00-) a-15(000) b-13(000)\n"
      + "b-31: c-32(000)\n"
      + "c-20: c-29(000)\n"
      + "c-27: b-31(-00) c-29(000)\n"
      + "a-15: b-28(00-) a-18(+00) b-16(000)\n"
      + "b-24: c-32(0+0) d-30(000) c-25(000)\n"
      + "b-28: c-29(+00)\n"
      + "c-25: c-34(000) b-28(000)\n"
      + "b-21: d-30(000) c-29(000) c-22(0+0)\n";
  }
}

