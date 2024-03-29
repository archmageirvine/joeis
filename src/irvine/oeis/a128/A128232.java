package irvine.oeis.a128;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A128232 Expansion of exp(x)/(1 - x^4/4!), where a(n) = 1 + C(n,4)*a(n-4).
 * E.g.f.: exp(x)/(1 - x^4/24)
 * @author Georg Fischer
 */
public class A128232 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A128232() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.exp(RING.x(), n), RING.subtract(RING.one(), RING.series(RING.pow(RING.x(), 4, n), RING.monomial(new Q(24), 0), n)), n);
  }
}
