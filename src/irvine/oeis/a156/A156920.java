package irvine.oeis.a156;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A156920 Triangle of the normalized A142963 and A156919 sequences.
 * @author Georg Fischer
 */
public class A156920 extends Triangle {

  /** Construct the sequence. */
  public A156920() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    if (k == n || k == 0) {
      return Z.ONE;
    }
    return get(n - 1, k - 1).multiply(2L * (n - k) + 1).add(get(n - 1, k).multiply(k + 1));
  }
}
