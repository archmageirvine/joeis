package irvine.oeis.a342;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A342186 Triangle read by rows, matrix inverse of A139382.
 * @author Georg Fischer
 */
public class A342186 extends Triangle {

  /** Construct the sequence. */
  public A342186() {
    setOffset(1);
    hasRAM(false);
  }

  /* T(n,k) = T(n-1,k-1) - (2^(n-1)-1) * T(n-1,k), n, k >= 1, T(1, 1) = 1, T(n, 0) = 0. */
  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return n == k ? Z.ONE : get(n - 2, k - 2).subtract(get(n - 2, k - 1).multiply(Z.ONE.shiftLeft(n - 1).subtract(Z.ONE)));
  }
}
