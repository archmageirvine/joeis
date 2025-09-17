package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388311 Decimal expansion of (1/8) * exp(5*Pi/6) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388311 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388311() {
    super(1, CR.PI.multiply(new Q(5, 6)).exp().divide(8).multiply(CR.SQRT2));
  }
}
