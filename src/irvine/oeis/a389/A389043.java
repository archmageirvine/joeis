package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389043 Decimal expansion of (1/16) * exp(3*Pi/4) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A389043 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389043() {
    super(0, CR.PI.multiply(new Q(3, 4)).exp().divide(16).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
