package irvine.oeis.a306;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A306547 Triangle read by rows, defined by Riordan's general Eulerian recursion: T(n, k) = (k+3)*T(n-1, k) + (n-k-2) * T(n-1, k-1) with T(n,1) = 1, T(n,n) = (-2)^(n-1).
 * @author Georg Fischer
 */
public class A306547 extends Triangle {

  /** Construct the sequence. */
  public A306547() {
    setOffset(1);
    hasRAM(false);
  }

  /* T(n, k) = (k+3)*T(n-1, k) + (n-k-2)*T(n-1, k-1) with T(n, 1) = 1, T(n,n) = (-2)^(n-1) */
  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 ? Z.ONE : (k == n ? Z.valueOf(-2).pow(n - 1) : get(n - 2, k - 2).multiply(n - k - 2).add(get(n - 2, k - 1).multiply(k + 3)));
  }
}
