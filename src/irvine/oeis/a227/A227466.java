package irvine.oeis.a227;
// Generated by gen_seq4.pl egfu at 2021-12-05 23:06

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A227466 E.g.f. equals the series reversion of tanh(x) / exp(x).
 * E.g.f.: 0
 * @author Georg Fischer
 */
public class A227466 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A227466() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.series(RING.tanh(RING.x(), n), RING.exp(RING.x(), n), n), n);
  }
}
