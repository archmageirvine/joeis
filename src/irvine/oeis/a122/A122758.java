package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A122758 Triangle read by rows: T(n,m) = 2*n^2*A084221(n) (n&gt;=0, 0 &lt;= m &lt;= n).
 * @author Georg Fischer
 */
public class A122758 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.TWO.multiply(n * (long) n) : (k == 1 ? Z.SIX.multiply(n * (long) n) : get(n, k - 2).multiply(4));
  }
}
