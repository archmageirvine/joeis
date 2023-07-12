package irvine.oeis.a276;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A276472 Modified Pascal's triangle read by rows: T(n,k) = T(n-1,k) + T(n-1,k-1), 1&lt;k&lt;n. T(n,1) = T(n-1,1) + T(n,2), n&gt;2. T(n,n) = T(n,n-1) + T(n-1,n-1), n&gt;1. T(1,1) = 1, T(2,1) = 1. n&gt;=1.
 * T(n,k) = T(n-1,k) + T(n-1,k-1), 1&lt;k&lt;n.
 * T(n, 1) = T(n-1, 1) + T(n, 2), n&gt;2.
 * T(n,n) = T(n,n-1) + T(n-1,n-1), n&gt;1.
 * T(1, 1) = 1, T(2, 1) = 1. n&gt;=1.
 * @author Georg Fischer
 */
public class A276472 extends Triangle {

  /** Construct the sequence. */
  public A276472() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    if (k == 1) {
      if (n <= 2) {
        return Z.ONE;
      }
      return get(n - 2, k - 1).add(get(n - 1, k));
    }
    if (k == n) {
      return get(n - 1, k - 2).add(get(n - 2, k - 2));
    }
    return get(n - 2, k - 1).add(get(n - 2, k - 2));
  }
}
