package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388777 Decimal expansion of (1/4) * exp(5*Pi/12) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388777 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388777() {
    super(1, CR.PI.multiply(new Q(5, 12)).exp().divide(4).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
