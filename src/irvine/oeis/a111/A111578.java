package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A111578 Triangle T(n, m) = T(n-1, m-1) + (4m-3)*T(n-1, m) read by rows 1&lt;=m&lt;=n.
 * @author Georg Fischer
 */
public class A111578 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).add(get(n - 1, k).multiply(4 * k + 1));
  }
}
