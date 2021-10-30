package irvine.oeis.a193;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A193592 Triangle read by rows having n-th row 1, n, n-1, n-2,..., 2, 1 for n&gt;=0.
 *
 * @author Georg Fischer
 */
public class A193592 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : Z.valueOf(n - k + 1);
  }
}
