package irvine.oeis.a206;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A206404 E.g.f. A(x) satisfies: exp(-A(x)) = exp(-A(x)^2) - x, with A(0) = 0.
 * E.g.f.: reverse( exp(-x^2) - exp(-x) )
 * @author Georg Fischer
 */
public class A206404 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A206404() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.subtract(RING.exp(RING.negate(RING.pow(RING.x(), 2, n)), n), RING.exp(RING.negate(RING.x()), n)), n);
  }
}
