package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A056753 Only odd numbers occur and for all k there are k numbers between any two successive occurrences of k.
 * @author Sean A. Irvine
 */
public class A056753 extends MemorySequence {

  // After Reinhard Zumkeller

  private Z f(final int i, final int x, final int y, final int z) {
    final int n = size();
    if (i == n) {
      return x == 1 ? a(n - z).add(2) : a(n - z);
    } else if (x == 1) {
      return y == 1 ? f(i + 1, 2 * z, z, 2 * z) : f(i + 1, z, y - 1, z);
    } else {
      return f(i + 1, x - 1, y, z);
    }
  }

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ONE : f(1, 1, 1, 1);
  }
}
