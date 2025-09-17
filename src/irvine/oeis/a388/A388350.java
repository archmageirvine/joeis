package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388350 Decimal expansion of 16 * exp(-4*Pi/3).
 * @author Sean A. Irvine
 */
public class A388350 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388350() {
    super(0, CR.PI.multiply(new Q(-4, 3)).exp().multiply(16));
  }
}
