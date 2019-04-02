package irvine.oeis.a018;

/**
 * A018960 Cycle class sequence c(2n) (the number of true cycles of length 2n in which a certain node is included) for zeolite AFR = SAPO-40 [ Si7Al29P28O128 ] . 4 TPA . OH.
 * @author Sean A. Irvine
 */
public class A018960 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AFR
    return "a-1: a-29(000) d-4(000) c-3(-00) b-2(000)\n"
      + "b-2: b-30(000) b-26(000) d-4(00-)\n"
      + "c-3: c-31(000) d-20(0-0) d-4(+0-)\n"
      + "d-4: c-19(0-0)\n"
      + "a-29: d-32(000) c-31(-00) b-30(000)\n"
      + "b-26: d-28(00-)\n"
      + "b-30: d-32(00-)\n"
      + "c-31: d-32(+0-)\n"
      + "c-19: d-20(-0+)\n"
      + "a-5: a-25(000) d-8(000) c-7(000) b-6(000)\n"
      + "b-6: b-30(000) b-26(000) d-8(00-)\n"
      + "c-7: c-27(000) d-24(000) d-8(00-)\n"
      + "d-8: c-23(000)\n"
      + "a-25: d-28(000) c-27(000) b-26(000)\n"
      + "c-27: d-28(00-)\n"
      + "c-23: d-24(00+)\n"
      + "a-9: a-21(000) d-12(000) c-11(000) b-10(000)\n"
      + "b-10: b-22(000) b-18(000) d-12(00+)\n"
      + "c-11: d-28(0+0) c-23(000) d-12(00+)\n"
      + "d-12: c-27(0+0)\n"
      + "a-21: d-24(000) c-23(000) b-22(000)\n"
      + "b-18: d-20(00+)\n"
      + "b-22: d-24(00+)\n"
      + "a-13: a-17(000) d-16(000) c-15(+00) b-14(000)\n"
      + "b-14: b-22(000) b-18(000) d-16(00+)\n"
      + "c-15: d-32(000) c-19(000) d-16(-0+)\n"
      + "d-16: c-31(000)\n"
      + "a-17: d-20(000) c-19(+00) b-18(000)\n";
  }

  @Override
  protected String startNode() {
    return "d-4";
  }
}

