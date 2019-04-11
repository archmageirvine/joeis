package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019130 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite FER = Ferrierite Na2Mg2[ Al6Si30O72 <code>] . 18</code> H2O.
 * @author Sean A. Irvine
 */
public class A019130 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // FER
    return "a-1: b-15(000) a-12(0-0) b-6(0-0) d-4(000)\n"
      + "d-4: c-11(--0) a-9(-0-)\n"
      + "b-6: b-16(-+0) b-15(-00) c-7(0+0)\n"
      + "a-12: b-18(000)\n"
      + "b-2: b-16(-00) b-15(000) a-5(000) c-3(000)\n"
      + "c-3: b-18(000) c-11(000) d-4(000)\n"
      + "a-5: b-16(0+0) a-9(0+0) d-8(+00)\n"
      + "c-11: b-16(0+0)\n"
      + "a-9: b-17(0-0) b-13(000)\n"
      + "d-8: c-14(-00) a-12(00+)\n"
      + "c-7: b-17(0-0) c-14(000) d-8(0-0)\n"
      + "c-14: b-15(000)\n"
      + "b-13: b-18(+0+) b-17(+00) c-14(000)\n"
      + "b-10: b-18(+00) b-17(0--) a-12(0-0) c-11(0-0)\n";
  }
}

