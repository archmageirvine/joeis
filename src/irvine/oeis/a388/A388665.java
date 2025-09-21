package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388665 Decimal expansion of 4 * exp(-Pi / 2) * 2^(3/4).
 * @author Sean A. Irvine
 */
public class A388665 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388665() {
    super(1, CR.HALF_PI.negate().exp().multiply(CR.TWO.pow(new Q(11, 4))));
  }
}
