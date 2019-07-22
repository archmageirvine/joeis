package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A024735.
 * @author Sean A. Irvine
 */
public class A024735 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.TWO;
    } else if (n <= 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < (n + 2) / 4; ++k) {
      sum = sum.add(get(2 * k).multiply(get(n - 2 * k - 1)));
    }
    return sum;
  }
}
