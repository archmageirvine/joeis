package irvine.oeis.a145;
// Generated by gen_seq4.pl egfu at 2021-12-06 15:00

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A145458 Exponential transform of C(n,8) = A000581.
 * E.g.f.: exp(exp(x)*x^8/40320)
 * @author Georg Fischer
 */
public class A145458 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A145458() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.exp(RING.series(RING.multiply(RING.exp(RING.x(), n), RING.pow(RING.x(), 8, n), n), RING.monomial(new Q(40320), 0), n), n);
  }
}
