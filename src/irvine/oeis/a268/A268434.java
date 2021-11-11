package irvine.oeis.a268;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A268434 Triangle read by rows, Lah numbers of order 2, T(n,n) = 1, T(n,k) = 0 if k&lt;0 or k&gt;n,
 * otherwise T(n,k) = T(n-1,k-1)+((n-1)^2+k^2)*T(n-1,k), for n&gt;=0 and 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A268434 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).add(get(n - 1, k).multiply((n - 1) * (long) (n - 1) + k * (long) k));
  }
}
