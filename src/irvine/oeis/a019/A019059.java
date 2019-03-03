package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019057.
 * @author Sean A. Irvine
 */
public class A019057 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // PHI
    return "a-1: a-13(000) a-11(000) b-10(000) b-2(0++)\n"
      + "b-2: b-14(--0) a-9(000) b-6(00-)\n"
      + "b-10: b-14(00+)\n"
      + "a-11: b-12(0+0)\n"
      + "a-13: b-14(-0+)\n"
      + "b-6: a-13(000) b-10(--0)\n"
      + "a-9: b-10(0--)\n"
      + "a-3: a-15(000) b-12(000) a-9(000) b-4(0-0)\n"
      + "b-4: b-16(++0) a-11(000) b-8(000)\n"
      + "b-12: b-16(000)\n"
      + "a-15: b-16(+00)\n"
      + "b-8: a-15(000) b-12(++0)\n"
      + "a-5: a-15(000) b-14(000) a-9(000) b-6(+0-)\n"
      + "a-7: b-16(000) a-13(000) a-11(000) b-8(-00)\n";
  }
}

