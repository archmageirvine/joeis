package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A051162 Triangle T(n,k) = n+k, n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A051162 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ZERO : Z.valueOf(n + k);
  }
}
