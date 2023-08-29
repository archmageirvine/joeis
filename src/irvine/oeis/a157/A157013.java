package irvine.oeis.a157;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157013 Riordan's general Eulerian recursion: T(n, k) = (k+2)*T(n-1, k) + (n-k-1) * T(n-1, k-1) with T(n,1) = 1, T(n,n) = (-1)^(n-1).
 * @author Georg Fischer
 */
public class A157013 extends Triangle {

  /** Construct the sequence. */
  public A157013() {
    setOffset(1);
    hasRAM(false);
  }

  /* T(n, k) = (k+2)*T(n-1, k) + (n-k-1)*T(n-1, k-1) with T(n, 1) = 1, T(n,n) = (-1)^(n-1) */
  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 ? Z.ONE : (k == n ? Z.NEG_ONE.pow(n - 1)
      : get(n - 2, k - 2).multiply(n - k - 1).add(get(n - 2, k - 1).multiply(k + 2)));
  }
}
