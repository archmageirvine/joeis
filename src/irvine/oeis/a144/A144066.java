package irvine.oeis.a144;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A144066 T(n, k) is the number of order-preserving partial transformations (of an n-element chain) of height k (height(alpha) = |Im(alpha)|); triangle T read by rows.
 * @author Georg Fischer
 */
public class A144066 extends Triangle {

  /** Construct the sequence. */
  public A144066() {
    hasRAM(false);
  }

  /* T(n,k) = 2*n*T(n-1,k)/(n-k) + n*T(n-1,k-1)/k for 1 <= k <= n-1 with T(n, 0) = T(n,n) = 1 for n >= 0. */
  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 || k == n ? Z.ONE : get(n - 1, k - 1).multiply(n).divide(k).add(get(n - 1, k).multiply(2L * n).divide(n - k));
  }
}
