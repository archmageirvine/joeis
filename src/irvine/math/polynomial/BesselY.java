package irvine.math.polynomial;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;

/**
 * Compute the Bessel Y series.
 * @author Sean A. Irvine
 */
public class BesselY extends AbstractSeries2 {

  @Override
  protected Polynomial<Q> compute(final Polynomial<Q> current, final long v, final int minDegree) {
    for (int k = current.degree()+ 1; k <= minDegree; ++k) {
      current.add(new Q(Binomial.binomial(v + k, 2L * k).multiply(Functions.FACTORIAL.z(2 * k)), Functions.FACTORIAL.z(k).shiftLeft(k)));
    }
    return current;
  }
}
