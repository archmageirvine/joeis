package irvine.oeis.a341;
// manually egfu at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A341769 Number of connected components of Euclidean n-space when the hyperplanes x_i+x_j=1, x_i=0, x_i=1 (1 &lt;= i &lt; j &lt;= n) are deleted.
 * E.g.f.: (1 - x) * e^(2*x) / (2 - e^x)^2
 * @author Georg Fischer
 */
public class A341769 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A341769() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.series(RING.multiply(RING.oneMinusXToTheN(1), RING.exp(RING.monomial(new Q(2), 1), mN), mN),
      RING.pow(RING.subtract(RING.monomial(new Q(2), 0), RING.exp(RING.x(), mN)), 2, mN), mN);
  }
}
