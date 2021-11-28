package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A127672 Monic integer version of Chebyshev T-polynomials (increasing powers).
 * @author Georg Fischer
 */
public class A127672 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    if (k == 0) {
      return ((n & 1) == 1) ? Z.ZERO : Z.valueOf(((n & 2) == 0) ? 2 : -2);
    } else if (k == 1) {
      return ((n & 1) == 0) ? Z.ZERO : Z.valueOf(((n & 2) == 0) ? n : -n);
    } else {
      return get(n - 1, k - 1).subtract(get(n - 2, k));
    }
  }
}
