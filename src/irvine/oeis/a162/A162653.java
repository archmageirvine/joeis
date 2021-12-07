package irvine.oeis.a162;
// manually egfu at 2021-12-07 17:24

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A162653 E.g.f. satisfies: A(x) = 1 + sinh(x*A(x)).
 * E.g.f.: (1/x)*reverse(x/(1 + sinh(x)))
 * @author Georg Fischer
 */
public class A162653 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A162653() {
    super(0);
    next();
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return n == 0 ? RING.one() : RING.divide(RING.reversion(RING.series(RING.x(), RING.add(RING.one(), RING.sinh(RING.x(), n)), n), n), new Q(n));
  }
}
