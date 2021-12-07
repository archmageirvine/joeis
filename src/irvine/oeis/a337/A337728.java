package irvine.oeis.a337;
// manually egfu at 2021-12-07 13:10

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A337728 a(n) = (4*n+1)! * Sum_{k=0..n} 1 / (4*k+1)!.
 * E.g.f.: (1/2) * (sin(x) + sinh(x)) / (1 - x^4)
 * @author Georg Fischer
 */
public class A337728 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A337728() {
    super(0, 1, 4);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.multiply(RING.series(RING.one(), RING.monomial(new Q(2), 0), n), RING.add(RING.sin(RING.x(), n), RING.sinh(RING.x(), n)), n), RING.oneMinusXToTheN(4), n);
  }
}
