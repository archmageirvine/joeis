package irvine.oeis.a326;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A326822 T(n, k) = k^0 if k = 1 else 0^n. Triangle read by rows, T(n, k) for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A326822 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n == 0 ? 1 : (k == 1 ? 1 : 0));
  }
}
