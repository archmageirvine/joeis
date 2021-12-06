package irvine.oeis.a108;
// manually egfu at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A108953 Convolution of 3^n*n! and n!.
 * E.g.f.: log(1-4*x+3*x^2)/((3*x-4))
 * @author Georg Fischer
 */
public class A108953 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A108953() {
    super(0);
    next();
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.series(RING.log(RING.add(RING.subtract(RING.one(), RING.monomial(Q.FOUR, 1)), RING.monomial(Q.THREE, 2)), mN), RING.subtract(RING.monomial(Q.THREE, 1), RING.monomial(Q.FOUR, 0)), mN);
  }
}
