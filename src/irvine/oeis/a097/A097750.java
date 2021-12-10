package irvine.oeis.a097;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A097750 Reversal of the binomial transform of the Whitney triangle A004070 (see A131250),
 * triangle read by rows, T(n,k) for 0 &lt;= k &lt;= n.
 * T(n, k) = T(n-1,k)+2*T(n-1,k-1)-T(n-2,k-2), T(0, 0)=1, T(1, 0)=1, T(1, 1)=2.
 * @author Georg Fischer
 */
public class A097750 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    } else if (n == 1) {
      return Z.valueOf(k + 1);
    } else if (n == k) {
      return Z.ONE.shiftLeft(n);
    }
    return get(n - 1, k).add(get(n - 1, k - 1).multiply2()).subtract(get(n - 2, k - 2));
  }
}
