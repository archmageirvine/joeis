package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019202 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite NES = NU-87 H4[ Al4Si64O136 <code>] . n</code> H2O.
 * @author Sean A. Irvine
 */
public class A019202 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // NES
    return "a-1: b-32(000) f-19(00-) e-18(00-) d-4(0-0)\n"
      + "d-4: a-33(000) c-10(000) g-7(000)\n"
      + "e-18: a-29(000)\n"
      + "f-19: a-31(0-0) g-20(000)\n"
      + "b-32: b-34(000)\n"
      + "b-2: a-31(000) c-16(0+0) b-15(000) b-9(000)\n"
      + "b-9: a-33(000) c-23(+00) b-22(000)\n"
      + "b-15: a-27(000) b-22(000)\n"
      + "c-16: b-34(000) d-24(000)\n"
      + "c-3: b-30(+00) c-23(+0-) b-15(00-) d-11(000)\n"
      + "d-11: a-31(00-)\n"
      + "c-23: b-32(00+)\n"
      + "b-30: b-34(000)\n"
      + "g-7: f-13(000) d-11(000)\n"
      + "c-10: b-28(0+0) b-22(000) c-16(0+0)\n"
      + "e-5: a-33(-00) e-25(000) e-18(-+-) a-14(0+0)\n"
      + "a-14: b-28(000) d-17(00-)\n"
      + "e-25: a-27(00-)\n"
      + "f-6: a-27(00-) f-19(0+-) a-14(0+0) g-7(000)\n"
      + "f-13: a-29(000) f-26(+00) a-21(+00)\n"
      + "a-8: b-34(000) f-26(000) e-25(000) d-11(-00)\n"
      + "f-26: a-33(-00)\n"
      + "b-22: a-29(000)\n"
      + "b-28: b-32(000) b-30(000)\n"
      + "e-12: a-31(0-0) e-25(+-+) a-21(+00) e-18(000)\n"
      + "a-21: b-30(000) d-24(000)\n"
      + "d-17: a-29(-00) c-23(000) g-20(000)\n"
      + "d-24: a-27(0-0)\n"
      + "g-20: f-26(000) d-24(000)\n";
  }
}

