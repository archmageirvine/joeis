package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388257 Decimal expansion of (1/4) * exp(5*Pi/8) * 2^(1/8).
 * @author Sean A. Irvine
 */
public class A388257 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388257() {
    super(1, CR.PI.multiply(new Q(5, 8)).exp().divide(4).multiply(CR.TWO.pow(new Q(1, 8))));
  }
}
