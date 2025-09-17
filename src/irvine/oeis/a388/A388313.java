package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388313 Decimal expansion of (1/8) * exp(11*Pi/12) * 2^(1/4).
 * @author Sean A. Irvine
 */
public class A388313 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388313() {
    super(1, CR.PI.multiply(new Q(11, 12)).exp().divide(8).multiply(CR.TWO.pow(Q.ONE_QUARTER)));
  }
}
