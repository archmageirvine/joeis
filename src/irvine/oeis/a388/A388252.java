package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388252 Decimal expansion of (1/4) * exp(5*Pi/12) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388252 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388252() {
    super(1, CR.PI.multiply(new Q(5, 12)).exp().divide(4).multiply(CR.TWO.pow(new Q(3, 4))));
  }
}
