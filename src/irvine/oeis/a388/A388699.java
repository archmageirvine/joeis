package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388699 Decimal expansion of (1/4) * exp(3*Pi/8) * 2^(1/8).
 * @author Sean A. Irvine
 */
public class A388699 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388699() {
    super(0, CR.PI.multiply(new Q(3, 8)).exp().multiply(CR.TWO.pow(new Q(-15, 8))));
  }
}
