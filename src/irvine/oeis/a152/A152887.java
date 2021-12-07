package irvine.oeis.a152;
// manually egfu at 2021-12-07 13:47

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A152887 Number of descents beginning with an even number and ending with an odd number in all permutations of {1,2,...,n}.
 * E.g.f.: x/((1-x^2)^2*(1-x))
 * @author Georg Fischer
 */
public class A152887 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A152887() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.x(), RING.multiply(RING.pow(RING.oneMinusXToTheN(2), 2, n), RING.oneMinusXToTheN(1), n), n);
  }
}
