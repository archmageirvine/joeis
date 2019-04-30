package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019226 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite RTH = RUB-13 [ B2Si30O64 <code>] . 2</code> R.
 * @author Sean A. Irvine
 */
public class A019226 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // RTH
    return "a-1: c-15(-00) b-14(000) a-5(000) c-3(000)\n"
      + "c-3: a-13(0+0) d-12(00+) d-4(0+0)\n"
      + "a-5: c-11(0+0) b-10(000) c-7(000)\n"
      + "b-14: d-16(000)\n"
      + "c-15: d-16(+00)\n"
      + "b-2: b-14(000) a-13(000) b-6(00+) d-4(000)\n"
      + "d-4: c-11(00+) d-8(--+)\n"
      + "b-6: b-10(000) a-9(000) d-8(000)\n"
      + "a-13: c-15(000)\n"
      + "d-12: d-16(++-)\n"
      + "d-8: c-15(00-)\n"
      + "c-11: d-12(0-0)\n"
      + "c-7: d-16(00-) a-9(-00) d-8(-00)\n"
      + "b-10: b-14(00-) d-12(000)\n"
      + "a-9: a-13(000) c-11(000)\n";
  }
}

