package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019022 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite JBW = NaJ (Barrer and White) Na3 [ Al3Si3O12 <code>]. 1.5</code> H2O.
 * @author Sean A. Irvine
 */
public class A019022 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // JBW
    return "a-1: a-4(000) a-4(-00) b-3(000) b-2(000)\n"
      + "b-2: b-6(00-) b-6(-0-) b-3(0-0)\n"
      + "b-3: b-5(00-) b-5(-0-)\n"
      + "a-4: b-6(000) b-5(000)\n"
      + "b-5: b-6(0+0)\n";
  }
}

