package irvine.oeis.a185;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A185151 E.g.f. A(x) = Sum_{n&gt;=1} a(n)*x^n/n! is inverse function to exp(x) - x^2 - 1.
 * E.g.f.: reverse(exp(x)-x^2-1)
 * @author Georg Fischer
 */
public class A185151 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A185151() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.subtract(RING.subtract(RING.exp(RING.x(), n), RING.pow(RING.x(), 2, n)), RING.one()), n);
  }
}
