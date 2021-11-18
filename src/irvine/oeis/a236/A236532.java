package irvine.oeis.a236;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A236532 Triangle T(n,k) read by rows: T(n,k) = floor(n*k/(n+k)), with 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A236532 extends Triangle {

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return Z.valueOf(n * (long) k / (n + k));
  }
}
