package irvine.oeis.a343;
// Generated by gen_seq4.pl egfu at 2021-12-06 15:00

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A343668 Number of partitions of an n-set without blocks of size 8.
 * E.g.f.: exp(exp(x) - 1 - x^8/40320)
 * @author Georg Fischer
 */
public class A343668 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A343668() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.exp(RING.subtract(RING.subtract(RING.exp(RING.x(), n), RING.one()), RING.series(RING.pow(RING.x(), 8, n), RING.monomial(new Q(40320), 0), n)), n);
  }
}
