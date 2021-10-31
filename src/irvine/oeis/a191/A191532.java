package irvine.oeis.a191;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A191532 Triangle T(n,k) read by rows: T(n,n) = 2n+1, T(n,k)=k for k&lt;n.
 * @author Georg Fischer
 */
public class A191532 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n == k ? 2L * n + 1 : k);
  }
}
