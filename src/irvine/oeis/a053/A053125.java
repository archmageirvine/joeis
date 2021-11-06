package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053125 Triangle of coefficients of Chebyshev's U(n,2*x-1) polynomials (exponents of x in decreasing order).
 * a(n, m) := -2*a(n-1, m-1)+4*a(n-1, m)-a(n-2, m-2)
 * @author Georg Fischer
 */
public class A053125 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k).multiply(4).subtract(get(n - 1, k - 1).multiply2()).subtract(get(n - 2, k - 2));
  }
}
