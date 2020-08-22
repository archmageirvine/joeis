package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002610 Glaisher's function H'(4n+1) (18 squares version).
 * @author Sean A. Irvine
 */
public class A002610 extends MemorySequence {

  private final MemorySequence mTheta = MemorySequence.cachedSequence(new A002288());

  @Override
  protected Z computeNext() {
    final int n = size();
    final int m = 4 * n + 1;
    Z sum = Z.ZERO;
    boolean sign = true;
    for (int k = 1, j = 0; n - j >= 0; k += 2, j += k - 1, sign = !sign) {
      final Z h = mTheta.a(n - j).multiply(k);
      sum = sum.signedAdd(sign, h);
    }
    for (int k = 2; m - k * k >= 0; k += 2) {
      final int c = m - k * k;
      sum = sum.signedAdd((k & 2) != 0, get(c / 4).multiply(k == 0 ? 1 : 2));
    }
    return sum;
  }
}
