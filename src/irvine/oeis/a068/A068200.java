package irvine.oeis.a068;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;
import irvine.oeis.PrependSequence;

/**
 * A068200 One of a family of sequences that interpolates between the Bell numbers and the factorials.
 * @author Sean A. Irvine
 */
public class A068200 extends PrependSequence {

  /** Construct the sequence. */
  public A068200() {
    super(new ExponentialGeneratingFunction(0) {
      @Override
      public Polynomial<Q> compute(final int n) {
        return RING.multiply(RING.exp(RING.subtract(RING.multiply(RING.exp(RING.x(), n), Q.FOUR), RING.monomial(Q.FOUR, 0)), n), Q.SIX);
      }
    }, 1, 2);
  }
}
