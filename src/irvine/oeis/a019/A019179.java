package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019179 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite MOR = Mordenite Na8[ Al8Si40O96 ] . 24 H2O.
 * @author Sean A. Irvine
 */
public class A019179 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MOR
    return "a-1: a-19(000) b-18(00+) a-9(00+) c-7(00+)\n"
      + "c-7: a-19(000) c-11(000) d-8(000)\n"
      + "a-9: a-23(000) b-22(00-) c-15(00-)\n"
      + "a-19: a-23(000)\n"
      + "b-2: b-20(000) b-18(0++) a-17(00+) d-8(0++)\n"
      + "d-8: b-20(0-0) d-12(000)\n"
      + "a-17: a-21(00-)\n"
      + "c-3: a-17(00+) c-15(000) a-5(000) d-4(000)\n"
      + "d-4: b-18(0++) d-16(000) b-6(0+0)\n"
      + "a-5: b-20(000) a-17(000) a-13(000)\n"
      + "c-15: a-23(000) d-16(000)\n"
      + "b-6: b-20(0-0) a-19(000) b-18(000)\n"
      + "d-16: b-24(-00)\n"
      + "a-13: b-24(000) a-21(000)\n"
      + "c-11: a-21(00-) a-13(000) d-12(000)\n"
      + "d-12: b-22(+0-) b-14(+00)\n"
      + "b-10: b-24(000) b-22(+0-) a-21(00-) d-16(+0-)\n"
      + "b-14: b-24(-00) a-23(000) b-22(000)\n";
  }
}

