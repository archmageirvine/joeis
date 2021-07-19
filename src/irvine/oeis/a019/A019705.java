package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019705 Decimal expansion of sqrt(Pi)/3.
 * @author Sean A. Irvine
 */
public class A019705 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019705() {
    super(CR.SQRT_PI.divide(CR.THREE));
  }
}
