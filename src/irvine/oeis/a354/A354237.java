package irvine.oeis.a354;
// Generated by gen_seq4.pl robots/egfu at 2023-05-07 23:33

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A354237 Expansion of e.g.f. 1 / (1 - log(1 + 2*x) / 2).
 * E.g.f.: 1 / (1 - log(1 + 2*x) / 2)
 * @author Georg Fischer
 */
public class A354237 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A354237() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.one(), RING.subtract(RING.one(), RING.series(RING.log(RING.add(RING.one(), RING.monomial(Q.TWO, 1)), mN), RING.monomial(Q.TWO, 0), mN)), mN);
  }
}
