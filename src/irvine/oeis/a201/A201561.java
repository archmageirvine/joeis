package irvine.oeis.a201;
// Generated by gen_seq4.pl egfu at 2021-12-06 15:00

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A201561 E.g.f. satisfies: A(x) = x + tan( A(x) )^2 with A(0)=0.
 * E.g.f.: reverse( x - tan(x)^2 )
 * @author Georg Fischer
 */
public class A201561 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A201561() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.subtract(RING.x(), RING.pow(RING.tan(RING.x(), n), 2, n)), n);
  }
}
