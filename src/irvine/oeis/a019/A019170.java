package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019170 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite MFS = ZSM-57 H1.5[ Al1.5Si34.5O72 ].
 * @author Sean A. Irvine
 */
public class A019170 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MFS
    return "a-1: b-15(000) d-12(000) g-7(000) b-2(000)\n"
      + "b-2: c-18(000) b-15(0--) e-5(000)\n"
      + "g-7: f-14(000) a-9(000)\n"
      + "d-12: c-16(000)\n"
      + "e-5: b-17(-00) e-13(000) h-8(--0)\n"
      + "c-3: b-17(00+) c-16(00+) d-12(0-0) f-6(000)\n"
      + "f-6: c-18(000) f-14(00+) g-7(0-0)\n"
      + "d-4: c-18(0+0) c-11(000) a-9(000) h-8(-00)\n"
      + "h-8: e-13(+0-) d-12(00-)\n"
      + "a-9: b-17(-00) b-10(-00)\n"
      + "c-11: c-18(00-) b-15(00-) f-14(000)\n"
      + "e-13: b-15(000)\n"
      + "f-14: c-16(000)\n"
      + "b-10: b-17(0++) c-16(000) e-13(+00)\n";
  }
}

