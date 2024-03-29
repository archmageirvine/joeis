package irvine.oeis.a215;
// Generated by gen_seq4.pl egfu at 2021-12-06 15:00

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A215638 E.g.f.: Series_Reversion( x/(cos(x) + sin(x)) ).
 * E.g.f.: reverse( x/(cos(x) + sin(x)) )
 * @author Georg Fischer
 */
public class A215638 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A215638() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.series(RING.x(), RING.add(RING.cos(RING.x(), n), RING.sin(RING.x(), n)), n), n);
  }
}
