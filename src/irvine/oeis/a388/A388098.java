package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388098 Decimal expansion of (1/8) * exp(5/8 * Pi) * 2^(1/2).
 * @author Sean A. Irvine
 */
public class A388098 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388098() {
    super(1, CR.PI.multiply(new Q(5, 8)).exp().divide(8).multiply(CR.SQRT2));
  }
}
