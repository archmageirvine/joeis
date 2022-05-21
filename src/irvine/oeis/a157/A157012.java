package irvine.oeis.a157;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157012 Riordan's general Eulerian recursion: T(n,k) = (k+2)*T(n-1, k) + (n-k) * T(n-1, k-1), with T(n,0) = 1, T(n,n) = 0.
 * @author Georg Fischer
 */
public class A157012 extends Triangle {

  /** Construct the sequence. */
  public A157012() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : (k == n ? Z.ZERO : get(n - 1, k - 1).multiply(n - k).add(get(n - 1, k).multiply(k + 2)));
  }
}
