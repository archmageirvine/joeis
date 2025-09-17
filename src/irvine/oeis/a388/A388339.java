package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388339 Decimal expansion of 4 * exp(-5*Pi/6) * sqrt(2).
 * @author Sean A. Irvine
 */
public class A388339 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388339() {
    super(0, CR.PI.multiply(new Q(-5, 6)).exp().multiply(4).multiply(CR.SQRT2));
  }
}
