package irvine.math.polynomial;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * Compute various complete elliptic functions.
 *
 * @author Sean A. Irvine
 */
public final class Elliptic {

  private Elliptic() { }

  /**
   * Complete elliptic integral of the first kind.  Computes <code>(2/Pi)*EllipticK(z)</code>
   * to order <code>n</code>.
   * @param z argument
   * @param n maximum order of polynomial result
   * @return elliptic polynomial
   */
  public static Polynomial<Q> ellipticK(final Polynomial<Q> z, final int n) {
    final PolynomialRingField<Q> ring = new PolynomialRingField<>(Rationals.SINGLETON);
    Polynomial<Q> sum = ring.zero();
    Z f = Z.ONE;
    for (int k = 0; k <= n / 2; ++k) {
      if (k > 0) {
        f = f.multiply(2L * k).multiply(2L * k - 1).divide(k * (long) k);
      }
      final Polynomial<Q> zk = ring.multiply(ring.pow(z, 2 * k, n), new Q(f.square(), Z.ONE.shiftLeft(4 * k)));
      sum = ring.add(sum, zk);
    }
    return sum;
  }
}
