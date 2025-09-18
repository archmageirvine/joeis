package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388446 Decimal expansion of exp(-Pi / 2) * 2^(3/4) * (2+sqrt(2)).
 * @author Sean A. Irvine
 */
public class A388446 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388446() {
    super(1, CR.HALF_PI.negate().exp().multiply(CR.TWO.pow(new Q(3, 4))).multiply(CR.TWO.add(CR.SQRT2)));
  }
}
