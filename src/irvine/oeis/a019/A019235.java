package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019235 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite SGT = Sigma-2 [ Si64O128 <code>] . 4</code> R.
 * @author Sean A. Irvine
 */
public class A019235 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // SGT
    return "a-1: d-31(000) a-9(0-0) d-4(000) b-2(000)\n"
      + "b-2: b-27(000) b-24(000) c-3(000)\n"
      + "d-4: c-25(-00) a-17(-0-) c-15(000)\n"
      + "a-9: d-29(00-) d-12(000) b-10(00-)\n"
      + "c-3: d-30(000) c-11(000) d-8(000)\n"
      + "b-24: c-25(-00)\n"
      + "b-27: c-28(00+)\n"
      + "d-8: a-23(000) c-22(000)\n"
      + "c-11: d-32(00-) d-16(000)\n"
      + "c-15: d-29(000)\n"
      + "a-17: d-31(000) a-20(0-0) b-18(00+)\n"
      + "c-25: d-29(+00) c-28(000)\n"
      + "a-5: d-32(000) a-13(-00) d-8(00+) b-6(00+)\n"
      + "b-6: b-21(000) b-18(000) c-7(00-)\n"
      + "a-13: d-30(000) d-16(000) b-14(000)\n"
      + "c-7: d-31(000) c-15(000) d-12(00+)\n"
      + "b-18: c-19(0--)\n"
      + "b-21: c-22(000)\n"
      + "d-12: c-28(000) a-20(000)\n"
      + "c-22: d-30(000)\n"
      + "a-23: d-32(0+0) a-26(-00) b-24(000)\n"
      + "b-10: b-27(000) b-24(000) c-11(0++)\n"
      + "d-16: a-26(0-0) c-19(0--)\n"
      + "a-20: d-29(+00) b-21(000)\n"
      + "c-28: d-31(00-)\n"
      + "b-14: b-21(000) b-18(000) c-15(+00)\n"
      + "c-19: d-32(0+0) c-22(000)\n"
      + "a-26: d-30(00-) b-27(00-)\n";
  }
}

