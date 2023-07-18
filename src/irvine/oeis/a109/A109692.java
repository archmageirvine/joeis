package irvine.oeis.a109;
// manually 2021-10-20

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A109692 Triangle of coefficients in expansion of (1+x)*(1+3x)*(1+5x)*(1+7x)*...*(1+(2n-1)x).
 * @author Georg Fischer
 */
public class A109692 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return n <= 1 ? Z.ONE : get(n - 1, k).add(Z.valueOf(2 * n - 1).multiply(get(n - 1, k - 1)));
  }
}
