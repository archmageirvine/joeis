package irvine.oeis.a214;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A214431 E.g.f. satisfies: A(x) = x + arcsin( A(x) )^2.
 * E.g.f.: reverse(x-arcsin(x)^2)
 * @author Georg Fischer
 */
public class A214431 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A214431() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.subtract(RING.x(), RING.pow(RING.asin(RING.x(), n), 2, n)), n);
  }
}
