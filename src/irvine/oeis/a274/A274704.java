package irvine.oeis.a274;
// manually egfu at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A274704 Exponential generating function 1/M_{4}(z^4) where M_{n}(z) is the n-th Mittag-Leffler function, nonzero coefficients only.
 * E.g.f.: 2*x/(cosh(x)+cos(x))
 * @author Georg Fischer
 */
public class A274704 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A274704() {
    super(0, 1, 4);
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.series(RING.monomial(Q.TWO, 1), RING.add(RING.cosh(RING.x(), mN), RING.cos(RING.x(), mN)), mN);
  }
}
