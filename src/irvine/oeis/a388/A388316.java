package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388316 Decimal expansion of (1/16) * exp(13*Pi/12) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388316 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388316() {
    super(1, CR.PI.multiply(new Q(13, 12)).exp().divide(16).multiply(CR.TWO.pow(new Q(3, 4))));
  }
}
