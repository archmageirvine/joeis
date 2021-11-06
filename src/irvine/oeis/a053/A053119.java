package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053119 Triangle of coefficients of Chebyshev's S(n,x) polynomials (exponents in decreasing order).
 * a(n, m) = a(n-1, m) - a(n-2, m-2)
 * @author Georg Fischer
 */
public class A053119 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k).subtract(get(n - 2, k - 2));
  }
}
