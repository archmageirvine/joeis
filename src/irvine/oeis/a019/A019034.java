package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019034 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite LTL = Linde Type L <code>K6Na3[ Al9Si27O72 ] . 21 H2O</code>.
 * @author Sean A. Irvine
 */
public class A019034 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // LTL
    return "a-1: b-28(000) a-21(000) a-15(-00) b-2(000)\n"
      + "b-2: b-32(000) b-31(000) b-28(00-)\n"
      + "a-15: b-36(000) b-16(000)\n"
      + "a-21: b-31(000) b-22(000)\n"
      + "a-3: b-29(000) a-19(0-0) a-15(000) b-4(000)\n"
      + "b-4: b-36(000) b-34(000) b-29(00-)\n"
      + "a-19: b-33(000) b-20(000)\n"
      + "a-5: b-30(000) a-19(000) a-13(000) b-6(000)\n"
      + "b-6: b-33(000) b-31(000) b-30(00-)\n"
      + "a-13: b-35(000) b-14(000)\n"
      + "a-7: b-25(000) a-23(+00) a-13(000) b-8(000)\n"
      + "b-8: b-36(000) b-35(000) b-25(00-)\n"
      + "a-23: b-32(000) b-24(000)\n"
      + "a-9: b-26(000) a-23(000) a-17(0+0) b-10(000)\n"
      + "b-10: b-33(000) b-32(000) b-26(00-)\n"
      + "a-17: b-34(000) b-18(000)\n"
      + "a-11: b-27(000) a-21(000) a-17(000) b-12(000)\n"
      + "b-12: b-35(000) b-34(000) b-27(00-)\n"
      + "b-14: b-35(00+) b-27(000) b-25(000)\n"
      + "b-16: b-36(00+) b-29(000) b-25(000)\n"
      + "b-18: b-34(00+) b-29(000) b-27(000)\n"
      + "b-20: b-33(00+) b-30(000) b-26(000)\n"
      + "b-22: b-31(00+) b-30(000) b-28(000)\n"
      + "b-24: b-32(00+) b-28(000) b-26(000)\n";
  }
}

