package irvine.math.polynomial;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Compute the elliptic D series expansion.
 * @author Sean A. Irvine
 */
public class EllipticD extends AbstractSeries1 {

  @Override
  protected Polynomial<Q> compute(final Polynomial<Q> current, final int minDegree) {
    Z f = Z.ONE;
    for (long k = 1; k <= minDegree / 2; ++k) {
      f = f.multiply(2 * k).multiply(2 * k - 1).divide(k * k);
      if (2 * k > current.degree()) {
        current.add(new Q(f.square().multiply(k), Z.valueOf(2 * k - 1).shiftLeft(4 * k)));
        current.add(Q.ZERO); // odd terms are all 0
      }
    }
    return current;
  }
}
