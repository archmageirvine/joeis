package irvine.oeis.a107;
// manually egfu at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A107713 Convolution of 2^n*n! and n!.
 * E.g.f.: (log(1-x)+log(1-2*x))/(-3+2*x)
 * @author Georg Fischer
 */
public class A107713 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A107713() {
    super(0);
    next();
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.series(RING.add(RING.log(RING.oneMinusXToTheN(1), mN), RING.log(RING.subtract(RING.one(), RING.monomial(Q.TWO, 1)), mN)), RING.add(RING.subtract(RING.zero(), RING.monomial(Q.THREE, 0)), RING.monomial(Q.TWO, 1)), mN);
  }
}
