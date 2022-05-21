package irvine.oeis.a188;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A188587 1-Euler triangle.
 * @author Georg Fischer
 */
public class A188587 extends Triangle {

  /** Construct the sequence. */
  public A188587() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n <= 2 || k == 0 || k == n ? Z.ONE : get(n - 1, k - 1).multiply(n - k + 1).add(get(n - 1, k).multiply(k + 1));
  }
}
