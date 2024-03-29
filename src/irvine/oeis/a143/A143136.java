package irvine.oeis.a143;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A143136 E.g.f. satisfies: A(x) = x + sinh( A(x) )^2.
 * E.g.f.: reverse( x - sinh(x)^2 )
 * @author Georg Fischer
 */
public class A143136 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A143136() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.subtract(RING.x(), RING.pow(RING.sinh(RING.x(), n), 2, n)), n);
  }
}
