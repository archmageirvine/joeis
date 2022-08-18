package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019668 Decimal expansion of sqrt(Pi*e)/24.
 * @author Sean A. Irvine
 */
public class A019668 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019668() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(24)));
  }
}
