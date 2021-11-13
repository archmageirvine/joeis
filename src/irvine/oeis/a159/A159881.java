package irvine.oeis.a159;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A159881 Triangle read by rows : T(n,0) = n+1, T(n,k)=0 if k&lt;0 or if k&gt;n, T(n,k) = k*T(n-1,k) - T(n-1,k-1).
 * @author Georg Fischer
 */
public class A159881 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.valueOf(n + 1) : get(n - 1, k).multiply(k).subtract(get(n - 1, k - 1));
  }
}
