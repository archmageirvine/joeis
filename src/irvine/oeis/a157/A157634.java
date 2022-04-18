package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157634 Triangle T(n, k) = 1 if k = 0 or k = n, otherwise n^5 - k^5 - (n-k)^5, read by rows.
 * @author Georg Fischer
 */
public class A157634 extends Triangle {

  /** Construct the sequence. */
  public A157634() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || n == k ? Z.ONE : Z.valueOf(n).pow(5).subtract(Z.valueOf(k).pow(5)).subtract(Z.valueOf(n - k).pow(5));
  }
}
