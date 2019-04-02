package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019065 Cycle class sequence c(2n) (the number of true cycles of length 2n in which a certain node is included) for zeolite ZON = ZAPO-M1 R8 [ Zn8Al24P32O128 ].
 * @author Sean A. Irvine
 */
public class A019065 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // ZON
    return "a-1: a-21(000) d-12(000) c-3(-00) b-2(000)\n"
      + "b-2: c-27(0+0) c-11(-00) d-4(000)\n"
      + "c-3: b-26(000) d-12(000) b-10(+00)\n"
      + "a-21: d-32(000) c-23(-00) b-22(000)\n"
      + "d-4: d-12(000) c-11(000) a-9(000)\n"
      + "c-11: b-18(0+0)\n"
      + "b-10: c-19(000) d-12(000)\n"
      + "b-26: d-28(000)\n"
      + "a-9: a-29(000) c-11(-00) b-10(000)\n"
      + "a-5: a-17(000) d-16(000) c-7(+00) b-6(000)\n"
      + "b-6: c-31(0-0) c-15(+0+) d-8(00+)\n"
      + "c-7: b-30(000) d-16(000) b-14(-0+)\n"
      + "a-17: d-28(000) c-19(+00) b-18(000)\n"
      + "d-8: d-16(00-) c-15(000) a-13(000)\n"
      + "c-15: b-22(0-0)\n"
      + "b-14: c-23(000) d-16(00-)\n"
      + "b-30: d-32(00+)\n"
      + "a-13: a-25(000) c-15(+00) b-14(000)\n"
      + "a-29: c-31(-00) b-30(000)\n"
      + "c-19: d-28(000) b-26(-00)\n"
      + "b-18: c-27(+00) d-20(000)\n"
      + "a-25: c-27(+00) b-26(000)\n"
      + "c-23: d-32(000) b-30(+0-)\n"
      + "b-22: c-31(-0-) d-24(00-)\n"
      + "d-20: d-28(000) c-27(000) a-25(000)\n"
      + "d-24: d-32(00+) c-31(000) a-29(000)\n";
  }
}

