package irvine.math.polynomial;

import irvine.math.function.Functions;
import irvine.math.q.Q;

/**
 * Compute Legendre polynomials.
 * @author Sean A. Irvine
 */
public class LegendreP extends AbstractSeries2 {

  private static final Polynomial<Q> F = Polynomial.create(Q.NEG_ONE, Q.ZERO, Q.ONE);

  @Override
  protected Polynomial<Q> compute(final Polynomial<Q> current, final long v, final int minDegree) {
    if (v == 0) {
      return RING.one();
    }
    Polynomial<Q> f = RING.pow(F, v);
    for (long k = 0; k < v; ++k) {
      f = RING.diff(f);
    }
    return RING.divide(f, Q.valueOf(Functions.FACTORIAL.z(v).shiftLeft(v)));
  }
}
