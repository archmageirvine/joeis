package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A015083 Carlitz-Riordan q-Catalan numbers (recurrence version) for q=2.
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
      sum = sum.add(qk.multiply(a(k)).multiply(a(n - 1 - k)));
    }
    return sum;
  }
}
