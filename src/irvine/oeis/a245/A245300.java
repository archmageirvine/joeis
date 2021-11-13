package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A245300 Triangle T(n,k) = (n+k)*(n+k+1)/2 + k, 0 &lt;= k &lt;= n, read by rows.
 * @author Georg Fischer
 */
public class A245300 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n + k).multiply(n + k + 1).divide2().add(k);
  }
}
