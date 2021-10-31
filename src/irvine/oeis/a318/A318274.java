package irvine.oeis.a318;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A318274 Triangle read by rows: T(n,k) = n for 0 &lt; k &lt; n and T(n,0) = T(n,n) = 1.
 * @author Georg Fischer
 */
public class A318274 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(k == 0 || k == n ? 1 : n);
  }
}
