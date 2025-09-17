package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388322 Decimal expansion of (1/16) * exp(4*Pi/3).
 * @author Sean A. Irvine
 */
public class A388322 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388322() {
    super(1, CR.PI.multiply(new Q(4, 3)).exp().divide(16));
  }
}
