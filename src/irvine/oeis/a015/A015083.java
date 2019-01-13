package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A015083.
 * @author Sean A. Irvine
 */
public class A015083 extends MemorySequence {

  protected long q() {
    return 2;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z qk = Z.ONE;
    for (int k = 0; k < n; ++k, qk = qk.multiply(q())) {
      sum = sum.add(qk.multiply(get(k)).multiply(get(n - 1 - k)));
    }
    return sum;
  }
}
