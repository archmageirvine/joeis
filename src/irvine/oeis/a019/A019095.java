package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019095 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite CON = CIT-1 H2[ B2Si54O112 ].
 * @author Sean A. Irvine
 */
public class A019095 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // CON
    return "a-1: d-18(000) f-6(00-) e-5(0+0) c-3(000)\n"
      + "c-3: c-24(-+0) f-13(000) g-7(000)\n"
      + "e-5: e-26(000) b-16(000)\n"
      + "f-6: f-27(-+0) c-10(000)\n"
      + "d-18: e-19(00-)\n"
      + "b-2: e-19(000) g-7(000) f-6(000) d-4(0+0)\n"
      + "d-4: d-25(000) a-15(000) e-5(00+)\n"
      + "g-7: g-28(-+0) g-14(000)\n"
      + "f-13: f-20(-+0)\n"
      + "c-24: g-28(000)\n"
      + "a-15: f-20(00+) e-19(0-0) c-17(000)\n"
      + "d-25: e-26(00+)\n"
      + "b-16: g-21(000) f-20(000) d-18(0-0)\n"
      + "c-10: c-17(-+0) g-14(000)\n"
      + "g-14: g-21(-+0)\n"
      + "a-8: d-25(000) f-13(00+) e-12(-00) c-10(000)\n"
      + "e-12: b-23(000) e-19(000)\n"
      + "b-9: e-26(000) g-14(000) f-13(000) d-11(-00)\n"
      + "d-11: a-22(000) d-18(000) e-12(00-)\n"
      + "c-17: f-27(000) g-21(000)\n"
      + "a-22: f-27(00-) e-26(+00) c-24(000)\n"
      + "b-23: g-28(000) f-27(000) d-25(+00)\n"
      + "f-20: c-24(000)\n"
      + "g-21: g-28(000)\n";
  }
}

