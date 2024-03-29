package irvine.oeis.a206;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A206401 E.g.f. A(x) satisfies: exp(A(x)) = x + exp(3*A(x)^2/2), with A(0) = 0.
 * E.g.f.: reverse( exp(x) - exp(3*x^2/2) )
 * @author Georg Fischer
 */
public class A206401 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A206401() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.subtract(RING.exp(RING.x(), n), RING.exp(RING.series(RING.monomial(Q.THREE, 2), RING.monomial(Q.TWO, 0), n), n)), n);
  }
}
