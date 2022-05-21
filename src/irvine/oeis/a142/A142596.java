package irvine.oeis.a142;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A142596 Triangle T(n, k) = T(n-1, k-1) + 3*T(n-1, k) + 2*T(n-1, k-1), with T(n,1) = T(n, n) = 1, read by rows.
 * @author Georg Fischer
 */
public class A142596 extends Triangle {

  /** Construct the sequence. */
  public A142596() {
    hasRAM(false);
  }

  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 || k == n ? Z.ONE : (get(n - 2, k - 2).add(get(n - 2, k - 1))).multiply(3);
  }
}
