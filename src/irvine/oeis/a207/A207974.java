package irvine.oeis.a207;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A207974 Triangle related to A152198.
 * @author Georg Fischer
 */
public class A207974 extends Triangle {

  /** Construct the sequence. */
  public A207974() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 || k == n ? Z.ONE : get(n - 1, k - 1).subtract(get(n - 1, k).multiply(((k & 1) == 0) ? 1 : -1));
  }
}
