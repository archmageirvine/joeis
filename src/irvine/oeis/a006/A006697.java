package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006697.
 * @author Sean A. Irvine
 */
public class A006697 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.ZERO;
    Z s = Z.ONE;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(s.min(Z.valueOf(n - k + 1)));
      s = s.multiply2();
    }
    return sum;
  }
}
