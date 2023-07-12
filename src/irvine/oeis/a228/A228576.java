package irvine.oeis.a228;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A228576 A triangle formed like generalized Pascal's triangle. The rule is T(n,k) = 2*T(n-1,k-1) + T(n-1,k), the left border is n and the right border is n^2 instead of 1.
 * @author Georg Fischer
 */
public class A228576 extends Triangle {

  /** Construct the sequence. */
  public A228576() {
    setOffset(1);
    hasRAM(false);
  }

  /* T(n, k) = 2*T(n-1, k-1) + T(n-1, k) for n,k >=0, with T(n, 0) = n, T(n,n) = n^2. */
  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 ? Z.valueOf(n) : (k == n ? Z.valueOf((long) n * n) : get(n - 1, k - 1).multiply2().add(get(n - 1, k)));
  }
}
