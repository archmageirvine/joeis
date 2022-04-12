package irvine.oeis.a337;
// manually egfu at 2021-12-07 13:10

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A337727 a(n) = (4*n)! * Sum_{k=0..n} 1 / (4*k)!.
 * E.g.f.: (1/2) * (cos(x) + cosh(x)) / (1 - x^4)
 * @author Georg Fischer
 */
public class A337727 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A337727() {
    super(0, 0, 4);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.multiply(RING.series(RING.one(), RING.monomial(Q.TWO, 0), n), RING.add(RING.cos(RING.x(), n), RING.cosh(RING.x(), n)), n), RING.oneMinusXToTheN(4), n);
  }
}
