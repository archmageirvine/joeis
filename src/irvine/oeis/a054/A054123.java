package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A054123 Right Fibonacci row-sum array T(n,k), n &gt;= 0, 0&lt;=k&lt;=n.
 * T(n, 0) = T(n, n) = 1 for n &gt;= 0; T(n, k) = T(n-1, k) + T(n-2, k-1) for k=1, 2, ..., n-1, n &gt;= 2.
 * @author Georg Fischer
 */
public class A054123 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || k == n - 1 || k == n ? Z.ONE : get(n - 1, k).add(get(n - 2, k - 1));
  }
}
