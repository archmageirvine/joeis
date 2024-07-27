package irvine.oeis.a226;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;
import irvine.oeis.PrependSequence;

/**
 * A226435 Number of permutations of {1..n} with fewer than 2 interior elements having values lying between the values of their neighbors.
 * lying between the values of their neighbors.
 * E.g.f.: (sec(x) + tan(x)) - (sec(x) + tan(x))^2 + (sec(x) + tan(x))^3
 * @author Georg Fischer
 */
public class A226435 extends PrependSequence {

  /** Construct the sequence. */
  public A226435() {
    super(0, new ExponentialGeneratingFunction(0) {
      @Override
      public Polynomial<Q> compute(final int n) {
        return RING.add(RING.subtract(RING.add(RING.sec(RING.x(), n), RING.tan(RING.x(), n)), RING.pow(RING.add(RING.sec(RING.x(), n), RING.tan(RING.x(), n)), 2, n)), RING.pow(RING.add(RING.sec(RING.x(), n), RING.tan(RING.x(), n)), 3, n));
      }
    }, 1);
  }
}
