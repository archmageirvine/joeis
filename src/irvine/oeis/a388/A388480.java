package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388480 Decimal expansion of 2 * exp(-Pi / 2) * 2^(1/4) * (2+sqrt(2))^(1/2).
 * @author Sean A. Irvine
 */
public class A388480 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388480() {
    super(0, CR.HALF_PI.negate().exp().multiply(2).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CR.TWO.add(CR.SQRT2).sqrt()));
  }
}
