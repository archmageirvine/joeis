package irvine.oeis.a045;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045545.
 * @author Sean A. Irvine
 */
public class A045545 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      if (LongUtils.gcd(k, n) == 1) {
        sum = sum.add(get(k));
      }
    }
    return sum;
  }
}
