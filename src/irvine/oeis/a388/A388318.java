package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388318 Decimal expansion of (1/16) * exp(7*Pi/6) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388318 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388318() {
    super(1, CR.PI.multiply(new Q(7, 6)).exp().divide(16).multiply(CR.SQRT2));
  }
}
