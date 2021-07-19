package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019707 Decimal expansion of sqrt(Pi)/5.
 * @author Sean A. Irvine
 */
public class A019707 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019707() {
    super(CR.SQRT_PI.divide(CR.FIVE));
  }
}
