package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053118 Triangle of coefficients of Chebyshev's U(n,x) polynomials (exponents in decreasing order).
 * a(n, m) = 2*a(n-1, m) - a(n-2, m-2).
 * @author Georg Fischer
 */
public class A053118 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k).multiply2().subtract(get(n - 2, k - 2));
  }
}
