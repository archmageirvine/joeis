package irvine.oeis.a068;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;
import irvine.oeis.PrependSequence;

/**
 * A068201 One of a family of sequences that interpolates between the Bell numbers and the factorials.
 * @author Sean A. Irvine
 */
public class A068201 extends PrependSequence {

  private static final Q Q24 = new Q(24);

  /** Construct the sequence. */
  public A068201() {
    super(new ExponentialGeneratingFunction(0) {
      @Override
      public Polynomial<Q> compute(final int n) {
        return RING.multiply(RING.exp(RING.subtract(RING.multiply(RING.exp(RING.x(), n), Q.FIVE), RING.monomial(Q.FIVE, 0)), n), Q24);
      }
    }, 1, 2, 6);
  }
}
