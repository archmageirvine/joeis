package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A269948 Triangle read by rows, Stirling set numbers of order 3, T(n,n) = 1, T(n,k) = 0 if k&lt;0 or k&gt;n, otherwise T(n,k) = T(n-1,k-1)+k^3*T(n-1, k), for n&gt;=0 and 0&lt;=k&lt;=n.
 * otherwise T(n,k) = T(n-1,k-1)+k^3*T(n-1, k), for n&gt;=0 and 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A269948 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).multiply(1).add(get(n - 1, k).multiply(Z.valueOf(k).pow(3)));
  }
}
