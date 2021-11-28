package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A244422 Quasi-Riordan triangle ((2-z)/(1-z), -z^2/(1-z)). Row reversed monic Chebyshev T-polynomials without vanishing columns.
 * @author Georg Fischer
 */
public class A244422 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.TWO : (k == 0 ? Z.ONE : get(n - 1, k).subtract(get(n - 2, k - 1)));
  }
}
