package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053120 Triangle of coefficients of Chebyshev's T(n,x) polynomials (powers of x in increasing order).
 * a(n, m) = 2*a(n-1, m-1) - a(n-2, m).
 * @author Georg Fischer
 */
public class A053120 extends Triangle {

  /** Construct the sequence. */
  public A053120() {
    super("1, 0, 1");
  }

  @Override
  public Z compute(final int n, final int k) {
    return n <= 1 ? super.compute(n, k) : get(n - 1, k - 1).multiply2().subtract(get(n - 2, k));
  }
}
