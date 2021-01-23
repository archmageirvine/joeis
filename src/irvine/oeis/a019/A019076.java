package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019076 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite BIK = Bikitaite Li2 [ Al2Si4O12 ] . 2 H2O.
 * @author Sean A. Irvine
 */
public class A019076 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // BIK
    return "a-1: b-6(000) a-3(00+) a-3(000) b-2(000)\n"
      + "b-2: b-6(--0) b-4(0-+) b-4(0-0)\n"
      + "a-3: b-5(000) b-4(000)\n"
      + "b-4: b-5(++0)\n"
      + "b-5: b-6(-00) b-6(-0-)\n";
  }
}

