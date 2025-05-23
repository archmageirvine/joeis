package irvine.oeis.a346;
// Generated by gen_seq4.pl egfu at 2021-12-06 15:00

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A346975 Expansion of e.g.f. log( 1 + (exp(x) - 1)^3 / 3! ).
 * E.g.f.: log( 1 + (exp(x) - 1)^3 / 6 )
 * @author Georg Fischer
 */
public class A346975 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A346975() {
    super(3);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.log(RING.add(RING.one(), RING.series(RING.pow(RING.subtract(RING.exp(RING.x(), n), RING.one()), 3, n), RING.monomial(Q.SIX, 0), n)), n);
  }
}
