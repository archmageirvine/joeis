package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388307 Decimal expansion of (1/4) * exp(2*Pi/3).
 * @author Sean A. Irvine
 */
public class A388307 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388307() {
    super(1, CR.PI.multiply(new Q(2, 3)).exp().divide(4));
  }
}
