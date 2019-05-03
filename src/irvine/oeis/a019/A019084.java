package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019084 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite BRE = Brewsterite <code>(Sr,Ba)2 [ Al4Si12O32 ] . 10 H2O</code>.
 * @author Sean A. Irvine
 */
public class A019084 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // BRE
    return "a-1: a-13(000) d-4(000) c-3(000) b-2(000)\n"
      + "b-2: c-11(0-0) d-4(-00) c-3(00+)\n"
      + "c-3: d-12(0-0) b-10(0-0)\n"
      + "d-4: d-12(+-0) c-11(0-0)\n"
      + "a-13: d-16(000) c-15(000) b-14(000)\n"
      + "b-10: d-12(+00) c-11(00-)\n"
      + "a-5: a-9(000) d-8(000) c-7(000) b-6(000)\n"
      + "b-6: c-15(000) d-8(+00) c-7(00-)\n"
      + "c-7: d-16(000) b-14(000)\n"
      + "d-8: d-16(-00) c-15(000)\n"
      + "a-9: d-12(000) c-11(000) b-10(000)\n"
      + "b-14: d-16(-00) c-15(00+)\n";
  }
}

