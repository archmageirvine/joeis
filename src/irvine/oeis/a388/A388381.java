package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388381 Decimal expansion of 8 * exp(-5*Pi/8) * 2^(1/8).
 * @author Sean A. Irvine
 */
public class A388381 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388381() {
    super(1, CR.PI.multiply(new Q(-5, 8)).exp().multiply(CR.TWO.pow(new Q(25, 8))));
  }
}
