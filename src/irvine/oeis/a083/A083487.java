package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A083487 Triangle read by rows: T(r,c) = 2*r*c + l + c (1 &lt;= c &lt;= l).
 * @author Georg Fischer
 */
public class A083487 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(2 * (n + 1) * (k + 1) + n + 1 + k + 1);
  }
}
