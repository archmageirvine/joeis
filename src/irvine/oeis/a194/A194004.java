package irvine.oeis.a194;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A194004 E.g.f.: A(x) = -log(3-exp(x)-exp(x^2)).
 * E.g.f.: -log(3-exp(x)-exp(x^2))
 * @author Georg Fischer
 */
public class A194004 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A194004() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.negate(RING.log(RING.subtract(RING.subtract(RING.monomial(Q.THREE, 0), RING.exp(RING.x(), n)), RING.exp(RING.pow(RING.x(), 2, n), n)), n));
  }
}
