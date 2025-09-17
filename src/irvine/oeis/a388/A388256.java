package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388256 Decimal expansion of (1/4) * exp(7*Pi/12) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388256 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388256() {
    super(1, CR.PI.multiply(new Q(7, 12)).exp().divide(4).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
