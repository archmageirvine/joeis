package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A176270 Triangle T(n,m) = 1 + m*(m-n) read by rows, 0 &lt;= m &lt;= n.
 * @author Georg Fischer
 */
public class A176270 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(1 + k * (k - n));
  }
}
