package irvine.oeis.a151;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A151890 Triangle read by rows: T(l,c) = 2*l*c + l + c (0 &lt;= c &lt;= l).
 * @author Georg Fischer
 */
public class A151890 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(2L * n * k + n + k);
  }
}
