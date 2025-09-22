package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388803 Decimal expansion of 8 * exp(-2*Pi/3) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388803 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388803() {
    super(1, CR.PI.multiply(new Q(-2, 3)).exp().multiply(8).multiply(CR.SQRT2));
  }
}
