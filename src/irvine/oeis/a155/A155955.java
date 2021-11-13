package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A155955 Triangle read by rows: T(n,k) = (k*n)^k, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A155955 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n * k).pow(k);
  }
}
