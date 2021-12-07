package irvine.oeis.a062;
// manually egfu at 2021-12-03 10:28

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A062191 Row sums of signed triangle A062138 (generalized a=5 Laguerre).
 * E.g.f.: exp(-x/(1-x))/(1-x)^5
 * @author Georg Fischer
 */
public class A062191 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A062191() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.exp(RING.subtract(RING.zero(), RING.series(RING.x(), RING.oneMinusXToTheN(1), n)), n), RING.pow(RING.oneMinusXToTheN(1), 6, n), n);
  }
}
