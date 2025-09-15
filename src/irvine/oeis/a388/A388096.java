package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388096 Decimal expansion of 1/4 * exp(3/8 * Pi) * 2^(1/2).
 * @author Sean A. Irvine
 */
public class A388096 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388096() {
    super(1, CR.PI.multiply(new Q(3, 8)).exp().divide(4).multiply(CR.SQRT2));
  }
}
