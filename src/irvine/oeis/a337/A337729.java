package irvine.oeis.a337;
// manually egfu at 2021-12-07 13:10

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A337729 a(n) = (4*n+2)! * Sum_{k=0..n} 1 / (4*k+2)!.
 * E.g.f.: (1/2) * (cosh(x) - cos(x)) / (1 - x^4)
 * @author Georg Fischer
 */
public class A337729 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A337729() {
    super(0, 2, 4);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.multiply(RING.series(RING.one(), RING.monomial(new Q(2), 0), n), RING.subtract(RING.cosh(RING.x(), n), RING.cos(RING.x(), n)), n), RING.oneMinusXToTheN(4), n);
  }
}
