package irvine.oeis.a167;
// manually egfu at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A167029 Difference between the number of positive and negative terms in the expansion of a skew symmetric matrix of order n.
 * E.g.f.: sqrt(cosh(x))*exp(x^2/4)
 * @author Georg Fischer
 */
public class A167029 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A167029() {
    super(1);
    next();
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.multiply(RING.sqrt(RING.cosh(RING.x(), n), n), RING.exp(RING.series(RING.pow(RING.x(), 2, n), RING.monomial(Q.FOUR, 0), n), n), n);
  }
}
