package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389056 Decimal expansion of (1/24) * exp(-Pi/24) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A389056 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389056() {
    super(0, CR.PI.divide(-24).exp().divide(24).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
