package irvine.oeis.a233;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A233543 Table T(n,m) = m! read by rows.
 * @author Georg Fischer
 */
public class A233543 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : get(n, k - 1).multiply(k);
  }
}
