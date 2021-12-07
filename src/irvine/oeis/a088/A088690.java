package irvine.oeis.a088;
// manually egfu at 2021-12-07 17:24

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A088690 E.g.f.: A(x) = f(x*A(x)), where f(x) = (1+x)*exp(x).
 * E.g.f.: (1/x)*reverse(x*exp(-x)/(1+x))
 * @author Georg Fischer
 */
public class A088690 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A088690() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return n == 0 ? RING.one() : RING.divide(
      RING.reversion(RING.series(RING.multiply(RING.x(), RING.exp(RING.subtract(RING.zero(), RING.x()), n), n), RING.onePlusXToTheN(1), n), n), new Q(n));
  }
}
