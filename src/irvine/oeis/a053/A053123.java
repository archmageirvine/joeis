package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053123 Triangle of coefficients of shifted Chebyshev's S(n,x-2)= U(n,x/2-1) polynomials (exponents of x in decreasing order).
 * T(n, m) = -2*T(n-1, m-1) + T(n-1, m) - T(n-2, m-2)
 * @author Georg Fischer
 */
public class A053123 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k).subtract(get(n - 1, k - 1).multiply2()).subtract(get(n - 2, k - 2));
  }
}
