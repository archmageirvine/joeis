package irvine.oeis.a138;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A138860 E.g.f. satisfies: A(x) = exp( x*(A(x) + A(x)^2)/2 ).
 * E.g.f.: exp( reverse( 2*x/(exp(x) + exp(2*x)) ) )
 * @author Georg Fischer
 */
public class A138860 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A138860() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.exp(RING.reversion(RING.series(RING.monomial(Q.TWO, 1), RING.add(RING.exp(RING.x(), n), RING.exp(RING.monomial(Q.TWO, 1), n)), n), n), n);
  }
}
