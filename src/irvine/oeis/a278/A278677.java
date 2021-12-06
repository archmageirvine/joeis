package irvine.oeis.a278;
// manually egfu at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A278677 Popularity of left children in treeshelves avoiding pattern T231.
 * E.g.f.: (x*exp(x) - exp(x) + 1)*exp(exp(z)-1).
 * @author Georg Fischer
 */
public class A278677 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A278677() {
    super(2);
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.multiply(RING.subtract(RING.one(), RING.multiply(RING.oneMinusXToTheN(1), RING.exp(RING.x(), mN), mN)),
      RING.exp(RING.subtract(RING.exp(RING.x(), mN), RING.one()), mN), mN);
  }
}
