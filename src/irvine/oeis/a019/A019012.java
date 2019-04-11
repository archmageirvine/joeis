package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019012 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite EDI = Edingtonite Ba2 [ Al4Si6O20 <code>] </code>. 8 H2O.
 * @author Sean A. Irvine
 */
public class A019012 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // EDI
    return "a-1: a-5(00-) a-4(000) a-3(0--) b-2(000)\n"
      + "b-2: a-5(000) a-4(-00) a-3(0-0)\n"
      + "a-3: a-5(000) a-4(-++)\n"
      + "a-4: a-5(+0-)\n";
  }
}

