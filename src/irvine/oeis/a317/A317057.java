package irvine.oeis.a317;
// Generated by gen_seq4.pl egfu at 2021-12-04 17:50

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A317057 a(n) is the number of time-dependent assembly trees satisfying the connected gluing rule for a cycle on n vertices.
 * E.g.f.: (x - x*exp(x) + exp(x) - 1)/(2 - exp(x))
 * @author Georg Fischer
 */
public class A317057 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A317057() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.subtract(RING.add(RING.subtract(RING.x(), RING.multiply(RING.x(), RING.exp(RING.x(), n), n)), RING.exp(RING.x(), n)), RING.one()), RING.subtract(RING.monomial(Q.TWO, 0), RING.exp(RING.x(), n)), n);
  }
}
