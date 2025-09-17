package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388346 Decimal expansion of 8 * exp(-7*Pi/6) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388346 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388346() {
    super(0, CR.PI.multiply(new Q(-7, 6)).exp().multiply(8).multiply(CR.SQRT2));
  }
}
