package irvine.oeis.a226;
// manually egfu at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A226435 Number of permutations of 1..n with fewer than 2 interior elements having values lying between the values of their neighbors.
 * lying between the values of their neighbors.
 * E.g.f.: (sec(x) + tan(x)) - (sec(x) + tan(x))^2 + (sec(x) + tan(x))^3
 * @author Georg Fischer
 */
public class A226435 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A226435() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.add(RING.subtract(RING.add(RING.sec(RING.x(), mN), RING.tan(RING.x(), mN)), RING.pow(RING.add(RING.sec(RING.x(), mN), RING.tan(RING.x(), mN)), 2, mN)), RING.pow(RING.add(RING.sec(RING.x(), mN), RING.tan(RING.x(), mN)), 3, mN));
  }
}
