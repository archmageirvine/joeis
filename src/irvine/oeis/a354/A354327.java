package irvine.oeis.a354;
// Generated by gen_seq4.pl robots/egfu at 2023-05-07 23:33

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A354327 Expansion of e.g.f. 1/(1 + x/4 * log(1 - 2 * x)).
 * E.g.f.: 1/(1 + x/4 * log(1 - 2 * x))
 * @author Georg Fischer
 */
public class A354327 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A354327() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.one(), RING.add(RING.one(), RING.multiply(RING.series(RING.x(), RING.monomial(Q.FOUR, 0), mN), RING.log(RING.subtract(RING.one(), RING.monomial(Q.TWO, 1)), mN), mN)), mN);
  }
}
