package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A015486.
 * @author Sean A. Irvine
 */
public class A015486 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.valueOf(n + 1);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(get(k).shiftLeft(k));
    }
    return sum;
  }
}
