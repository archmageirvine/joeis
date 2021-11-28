package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A061896 Triangle of coefficients of Lucas polynomials.
 * @author Georg Fischer
 */
public class A061896 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.TWO : (k == 0 ? Z.ONE : get(n - 1, k).add(get(n - 2, k - 1)));
  }
}
