package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019218 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite RSN = RUB-17 K4Na12 [ Zn8Si28O72 <code>] . 18</code> H2O.
 * @author Sean A. Irvine
 */
public class A019218 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // RSN
    return "a-1: a-10(0-0) b-7(0-0) a-6(000) b-2(0-0)\n"
      + "b-2: b-7(00+) a-6(-00) e-5(00+)\n"
      + "a-6: a-15(+00) b-7(+00)\n"
      + "a-10: b-16(0+0) a-15(000) b-11(0+0)\n"
      + "e-5: c-8(0+0) b-7(000)\n"
      + "c-3: d-9(000) c-8(++0) e-5(+00) d-4(00-)\n"
      + "d-4: d-18(000) d-9(000) c-8(00+)\n"
      + "c-8: d-9(000)\n"
      + "d-9: d-13(000)\n"
      + "a-15: b-16(-00)\n"
      + "d-13: d-18(000) c-17(000)\n"
      + "b-11: b-16(00-) a-15(+00) e-14(000)\n"
      + "e-14: c-17(0-0) b-16(00-)\n"
      + "c-12: d-18(00-) c-17(--0) e-14(-00) d-13(000)\n"
      + "c-17: d-18(00-)\n";
  }
}

