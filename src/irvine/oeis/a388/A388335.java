package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388335 Decimal expansion of 4 * exp(-2*Pi/3).
 * @author Sean A. Irvine
 */
public class A388335 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388335() {
    super(0, CR.PI.multiply(new Q(-2, 3)).exp().multiply(4));
  }
}
