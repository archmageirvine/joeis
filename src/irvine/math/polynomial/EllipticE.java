package irvine.math.polynomial;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Compute the elliptic E series expansion.
 * @author Sean A. Irvine
 */
public class EllipticE extends AbstractSeries1 {

  @Override
  protected Polynomial<Q> compute(final Polynomial<Q> current, final int minDegree) {
    Z f = Z.ONE;
    for (long k = 0; k <= minDegree / 2; ++k) {
      if (k > 0) {
        f = f.multiply(2 * k).multiply(2 * k - 1).divide(k * k);
      }
      if (2 * k > current.degree()) {
        current.add(new Q(f.square(), Z.valueOf(2 * k - 1).shiftLeft(4 * k)).negate());
        current.add(Q.ZERO); // odd terms are all 0
      }
    }
    return current;
  }
}
