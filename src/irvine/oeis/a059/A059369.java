package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A059369 Triangle of numbers T(n,k) = T(n-1,k-1) + ((n+k-1)/k)*T(n-1,k), n &gt;= 1, 1 &lt;= k &lt;= n, with T(n,1) = n!, T(n,n) = 1; read from right to left.
 * @author Georg Fischer
 */
public class A059369 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).multiply(2L * n - k + 1).divide(n - k + 1).add(get(n - 1, k));
  }
}
