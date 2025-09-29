package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389056 Decimal expansion of exp(-Pi/24) / (12*2^(3/4)).
 * @author Sean A. Irvine
 */
public class A389056 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389056() {
    super(0, CR.PI.divide(-24).exp().divide(24).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
