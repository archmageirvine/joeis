package irvine.oeis.a105;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A105797 "Stirling-Bernoulli transform" of Pell numbers.
 * E.g.f.: exp(x)*(1-exp(x))/(1-4*exp(x)+2*exp(2*x))
 * @author Georg Fischer
 */
public class A105797 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A105797() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.multiply(RING.exp(RING.x(), n), RING.subtract(RING.one(), RING.exp(RING.x(), n)), n), RING.add(RING.subtract(RING.one(), RING.multiply(RING.monomial(Q.FOUR, 0), RING.exp(RING.x(), n), n)), RING.multiply(RING.monomial(Q.TWO, 0), RING.exp(RING.monomial(Q.TWO, 1), n), n)), n);
  }
}
