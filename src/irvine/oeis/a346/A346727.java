package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346727 Decimal expansion of 361 * Pi^6 / (245760 * sqrt(2)).
 * @author Sean A. Irvine
 */
public class A346727 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346727() {
    super(0, CR.PI.pow(6).multiply(361).divide(CR.SQRT2.multiply(245760)));
  }
}

