package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388100 Decimal expansion of 1/16 * exp(7/8 * Pi) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388100 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388100() {
    super(1, CR.PI.multiply(new Q(7, 8)).exp().divide(16).multiply(CR.SQRT2));
  }
}
