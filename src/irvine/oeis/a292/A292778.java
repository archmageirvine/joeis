package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A292778 INVERT transform of double factorials.
 * @author Georg Fischer
 */
public class A292778 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z fa = Z.ONE;
    Z fb = Z.ONE;
    for (int k = 1; k <= n; ++k) {
      if (k > 1) {
        final Z t = fa.multiply(k);
        fa = fb;
        fb = t;
      }
      sum = sum.add(fb.multiply(a(n - k)));
    }
    return sum;
  }
}
