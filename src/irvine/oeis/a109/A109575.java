package irvine.oeis.a109;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A109575 E.g.f.: x/(1 + 12*x - 8*x^3) = x/[1-Hermite(3,x)].
 * E.g.f.: x/(1 + 12*x - 8*x^3)
 * @author Georg Fischer
 */
public class A109575 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A109575() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.x(), RING.subtract(RING.add(RING.one(), RING.monomial(new Q(12), 1)), RING.monomial(Q.EIGHT, 3)), n);
  }
}
