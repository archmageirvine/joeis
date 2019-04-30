package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019014 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite ERI = Erionite (Na2,Ca..)3.5 K2 [ Al9Si27O72 <code>] . 27</code> H2O.
 * @author Sean A. Irvine
 */
public class A019014 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // ERI
    return "a-1: b-28(000) a-23(000) a-21(000) b-2(000)\n"
      + "b-2: b-33(--0) b-31(000) b-16(-0-)\n"
      + "a-21: b-31(000) b-22(000)\n"
      + "a-23: b-32(000) b-24(000)\n"
      + "b-28: b-36(-00)\n"
      + "b-16: b-29(000) b-27(+00)\n"
      + "a-3: b-29(000) a-17(000) a-15(000) b-4(000)\n"
      + "b-4: b-36(000) b-35(0-0) b-20(0-0)\n"
      + "a-15: b-36(000) b-16(000)\n"
      + "a-17: b-34(000) b-18(000)\n"
      + "b-29: b-33(0-+)\n"
      + "b-20: b-30(000) b-28(++0)\n"
      + "a-5: b-30(000) a-21(000) a-19(000) b-6(000)\n"
      + "b-6: b-33(000) b-32(+00) b-14(00-)\n"
      + "a-19: b-33(000) b-20(000)\n"
      + "b-30: b-35(000)\n"
      + "b-14: b-29(0+0) b-25(000)\n"
      + "a-7: b-25(000) a-15(000) a-13(000) b-8(000)\n"
      + "b-8: b-35(000) b-34(++0) b-24(+00)\n"
      + "a-13: b-35(000) b-14(000)\n"
      + "b-25: b-32(+0+)\n"
      + "b-24: b-30(-00) b-26(000)\n"
      + "a-9: b-26(000) a-23(000) a-19(000) b-10(000)\n"
      + "b-10: b-32(000) b-31(0+0) b-18(0+-)\n"
      + "b-26: b-34(0+0)\n"
      + "b-18: b-27(000) b-25(--0)\n"
      + "a-11: b-27(000) a-17(000) a-13(000) b-12(000)\n"
      + "b-12: b-36(-00) b-34(000) b-22(000)\n"
      + "b-27: b-31(00+)\n"
      + "b-22: b-28(000) b-26(0-0)\n";
  }
}

