package irvine.oeis.a344;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A344110 Triangle read by rows: T(n,k) = 2^(n*k), n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A344110 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.ONE.shiftLeft(n * k);
  }
}
