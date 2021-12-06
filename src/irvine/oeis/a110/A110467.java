package irvine.oeis.a110;
// manually egfu at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A110467 Convolution of 4^n*n! and n!.
 * E.g.f.: log((1-x)*(1-4*x))/(4*x-5)
 * @author Georg Fischer
 */
public class A110467 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A110467() {
    super(0);
    next();
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.series(RING.log(RING.multiply(RING.oneMinusXToTheN(1), RING.subtract(RING.one(), RING.monomial(new Q(4), 1)), mN), mN), RING.subtract(RING.monomial(new Q(4), 1), RING.monomial(new Q(5), 0)), mN);
  }
}
