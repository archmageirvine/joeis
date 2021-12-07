package irvine.oeis.a337;
// manually egfu at 2021-12-07 13:10

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A337730 a(n) = (4*n+3)! * Sum_{k=0..n} 1 / (4*k+3)!.
 * E.g.f.: (1/2) * (sinh(x) - sin(x)) / (1 - x^4)
 * @author Georg Fischer
 */
public class A337730 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A337730() {
    super(0, 3, 4);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.multiply(RING.series(RING.one(), RING.monomial(new Q(2), 0), n), RING.subtract(RING.sinh(RING.x(), n), RING.sin(RING.x(), n)), n), RING.oneMinusXToTheN(4), n);
  }
}
