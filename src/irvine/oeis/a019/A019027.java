package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019027 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite LIO = Liottite (Ca,Na2,K2)9 [ Al18Si18O72 ].
 * @author Sean A. Irvine
 */
public class A019027 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // LIO
    return "a-1: a-27(000) a-23(000) c-14(0-0) c-3(0-0)\n"
      + "c-3: c-36(000) c-34(0+0)\n"
      + "c-14: c-29(0+0) c-21(000)\n"
      + "a-23: c-32(0-0) c-25(0-0)\n"
      + "a-27: c-34(000) c-29(000)\n"
      + "b-2: b-35(000) b-31(000) d-4(000) c-3(000)\n"
      + "d-4: d-30(0+0) d-22(000) b-13(00-)\n"
      + "b-31: c-32(000)\n"
      + "b-35: c-36(000)\n"
      + "b-13: b-24(000) b-20(000) c-14(000)\n"
      + "d-22: b-35(000)\n"
      + "d-30: b-33(000)\n"
      + "a-5: a-27(000) a-19(000) c-16(000) c-7(000)\n"
      + "c-7: c-25(000) c-21(+00)\n"
      + "c-16: c-36(+00) c-32(000)\n"
      + "a-19: c-36(+00) c-21(+00)\n"
      + "b-6: b-28(000) b-24(000) d-8(00+) c-7(000)\n"
      + "d-8: d-26(000) d-22(+00) b-15(000)\n"
      + "b-24: d-26(00+) c-25(000)\n"
      + "b-28: d-30(00+) c-29(000)\n"
      + "b-15: b-33(000) b-31(000) c-16(000)\n"
      + "d-26: b-31(000)\n"
      + "a-9: a-23(000) a-19(000) c-18(+00) c-11(+00)\n"
      + "c-11: c-34(000) c-32(--0)\n"
      + "c-18: c-29(000) c-25(--0)\n"
      + "b-10: b-35(000) b-33(000) d-12(000) c-11(000)\n"
      + "d-12: d-30(000) d-26(--0) b-17(00-)\n"
      + "b-33: c-34(000)\n"
      + "b-17: b-28(000) b-20(000) c-18(000)\n"
      + "b-20: d-22(00+) c-21(000)\n";
  }
}

