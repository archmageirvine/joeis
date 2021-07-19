package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019610 Decimal expansion of Pi*e/2.
 * @author Sean A. Irvine
 */
public class A019610 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019610() {
    super(CR.HALF_PI.multiply(CR.E));
  }
}
