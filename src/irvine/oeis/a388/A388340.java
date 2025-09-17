package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388340 Decimal expansion of 4 * exp(-7*Pi/8) * 2^(5/8).
 * @author Sean A. Irvine
 */
public class A388340 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388340() {
    super(0, CR.PI.multiply(new Q(-7, 8)).exp().multiply(CR.TWO.pow(new Q(21, 8))));
  }
}
