package irvine.math.polynomial;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Compute the Bessel I series expansion without leading <code>(x/2)^n/n!</code> factor.
 * @author Sean A. Irvine
 */
public class BesselI extends AbstractSeries2 {

  @Override
  protected Polynomial<Q> compute(final Polynomial<Q> current, final long v, final int minDegree) {
    final Z nf = Functions.FACTORIAL.z(v);
    for (int k = current.degree() + 1; k <= minDegree; ++k) {
      if ((k & 1) == 0) {
        current.add(new Q(nf, Functions.FACTORIAL.z(k / 2).multiply(Functions.FACTORIAL.z(v + k / 2)).shiftLeft(k)));
      } else {
        current.add(Q.ZERO);
      }
    }
    return current;
  }
}
