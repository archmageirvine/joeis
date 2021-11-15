package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A095886 Triangle read by rows: T(n,k) = (n-k)^n, n&gt;=1, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A095886 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n - k).pow(n + 1);
  }
}
