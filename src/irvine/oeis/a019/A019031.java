package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019031 Cycle class sequence c(2n) (the number of true cycles of length 2n in which a certain node is included) for zeolite LOS = Losod Na12 [ Al12Si12O48 ] . 18 H2O.
 * @author Sean A. Irvine
 */
public class A019031 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // LOS
    return "a-1: b-22(000) a-18(000) a-17(000) b-2(000)\n"
      + "b-2: b-23(000) b-21(0-0) a-13(0--)\n"
      + "a-17: b-19(000)\n"
      + "a-18: b-23(000)\n"
      + "a-13: b-22(0+0)\n"
      + "a-3: b-23(00+) a-15(000) a-14(000) b-4(000)\n"
      + "b-4: b-24(000) b-22(000) a-18(000)\n"
      + "a-14: b-20(000)\n"
      + "a-15: b-24(000)\n"
      + "a-5: b-24(+00) a-17(000) a-16(000) b-6(+00)\n"
      + "b-6: b-23(000) b-19(-00) a-15(00-)\n"
      + "a-16: b-21(+00)\n"
      + "a-7: b-19(0++) a-14(000) a-13(000) b-8(0+0)\n"
      + "b-8: b-24(+00) b-20(0-0) a-17(000)\n"
      + "a-9: b-20(000) a-18(000) a-16(000) b-10(000)\n"
      + "b-10: b-21(+00) b-19(0+0) a-14(00-)\n"
      + "a-11: b-21(00+) a-15(000) a-13(000) b-12(000)\n"
      + "b-12: b-22(0+0) b-20(-00) a-16(-00)\n";
  }
}

