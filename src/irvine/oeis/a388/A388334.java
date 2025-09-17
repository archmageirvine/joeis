package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388334 Decimal expansion of 2 * exp(-5*Pi/8) * 2^(7/8).
 * @author Sean A. Irvine
 */
public class A388334 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388334() {
    super(0, CR.PI.multiply(new Q(-5, 8)).exp().multiply(CR.TWO.pow(new Q(15, 8))));
  }
}
