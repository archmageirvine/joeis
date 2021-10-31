package irvine.oeis.a336;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A336858 Triangle read by rows: T(n,k) = T(n,k-1) + T(n-1, k) + T(n-1,k-1) with T(n,0) = T(n, n) = 1 (n &gt;= 0, 0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A336858 extends Triangle {

  /** Construct the sequence. */
  public A336858() {
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || k == n ? Z.ONE : get(n, k - 1).add(get(n - 1, k)).add(get(n - 1, k - 1));
  }
}
