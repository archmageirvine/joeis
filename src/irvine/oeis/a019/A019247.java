package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019247 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite VET <code>= VPI-8 [ Si17O34 ]</code>.
 * @author Sean A. Irvine
 */
public class A019247 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // VET
    return "a-1: d-17(000) b-15(00+) b-15(000) c-3(000)\n"
      + "c-3: b-11(0-0) d-4(00+) d-4(000)\n"
      + "b-2: c-12(0-0) a-6(00+) a-6(000) e-5(000)\n"
      + "e-5: b-15(-00) b-11(--0) b-7(0-0)\n"
      + "a-6: c-8(000)\n"
      + "c-12: d-13(00+) d-13(000)\n"
      + "d-4: d-13(0-0) a-6(000)\n"
      + "b-11: a-14(00+) a-14(000)\n"
      + "d-13: a-14(000)\n"
      + "b-7: c-16(-00) a-10(000) a-10(00-)\n"
      + "c-8: b-15(-00) d-9(000) d-9(00-)\n"
      + "a-10: c-12(000)\n"
      + "c-16: d-17(000) d-17(00-)\n"
      + "d-9: d-17(-00) a-10(000)\n"
      + "a-14: c-16(000)\n";
  }
}

