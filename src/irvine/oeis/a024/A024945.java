package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A024945.
 * @author Sean A. Irvine
 */
public class A024945 extends MemorySequence {

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    } else if (n == 3) {
      return Z.TWO;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= (n + 2) / 4; ++k) {
      sum = sum.add(get(2 * k - 1).multiply(get(n - 2 * k + 1)));
    }
    return sum;
  }
}
