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
    return RING.series(RING.log(RING.add(RING.subtract(RING.one(), RING.monomial(new Q(4), 1)), RING.monomial(new Q(3), 2)), mN), RING.subtract(RING.monomial(new Q(3), 1), RING.monomial(new Q(4), 0)), mN);
  }
}
