package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019632 Decimal expansion of Pi*e/24.
 * @author Sean A. Irvine
 */
public class A019632 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019632() {
    super(0, CR.PI.multiply(CR.E).divide(CR.valueOf(24)));
  }
}
