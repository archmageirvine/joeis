package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A036569 Increments used in Sedgewick-Incerpi upper bound for shell sort.
 * @author Sean A. Irvine
 */
public class A036569 extends MemorySequence {

  private final MemorySequence mB = new A036567();
  private int mR = 0;

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    while (mR * (mR - 1) / 2 < n) {
      ++mR;
    }
    return get(n - mR + 1).multiply(mB.a(mR - 2));
  }
}
