package irvine.oeis.a214;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A214223 E.g.f. satisfies: A(x) = x/(1 - sinh(A(x))).
 * E.g.f.: reverse(x-x*sinh(x))
 * @author Georg Fischer
 */
public class A214223 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A214223() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.subtract(RING.x(), RING.multiply(RING.x(), RING.sinh(RING.x(), n), n)), n);
  }
}
