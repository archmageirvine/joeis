package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019144 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite MEI = ZSM-18 Nan [ AlnSi34-nO68 <code>] </code>. 28 H2O <code>(n=2</code>.1-5.7).
 * @author Sean A. Irvine
 */
public class A019144 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MEI
    return "a-1: b-22(0-0) b-16(000) c-3(000) b-2(000)\n"
      + "b-2: a-21(0-0) a-9(000) d-4(000)\n"
      + "c-3: a-29(000) c-17(000) c-11(000)\n"
      + "b-16: a-31(000)\n"
      + "b-22: a-27(000) d-23(000)\n"
      + "d-4: d-26(000) b-16(000) b-10(000)\n"
      + "a-9: b-28(+00) c-11(000) b-10(000)\n"
      + "a-21: b-32(000) b-22(000)\n"
      + "c-11: a-33(000) c-17(000)\n"
      + "c-17: a-24(000)\n"
      + "a-29: b-30(00+)\n"
      + "b-10: a-27(+00) a-15(000)\n"
      + "d-26: b-34(000) b-30(000)\n"
      + "a-5: b-25(000) b-19(00-) c-7(000) b-6(00-)\n"
      + "b-6: a-24(000) a-12(00+) d-8(000)\n"
      + "c-7: a-31(000) c-20(000) c-14(000)\n"
      + "b-19: a-33(-00)\n"
      + "b-25: a-29(00-) d-26(000)\n"
      + "d-8: d-23(000) b-19(000) b-13(000)\n"
      + "a-12: b-30(0+0) c-14(000) b-13(00-)\n"
      + "a-24: b-34(00+) b-25(00+)\n"
      + "c-14: a-21(000) c-20(000)\n"
      + "c-20: a-27(000)\n"
      + "a-31: b-32(000)\n"
      + "b-13: a-29(0+0) a-18(00+)\n"
      + "d-23: b-32(000) b-28(000)\n"
      + "b-28: a-31(000)\n"
      + "a-15: b-32(000) c-17(000) b-16(000)\n"
      + "a-27: b-28(000)\n"
      + "a-33: b-34(00+)\n"
      + "b-30: a-33(00-)\n"
      + "a-18: b-34(-00) c-20(000) b-19(00-)\n";
  }
}

