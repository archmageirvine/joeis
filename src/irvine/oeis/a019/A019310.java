package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A019310.
 * @author Sean A. Irvine
 */
public class A019310 extends MemorySequence {

  {
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return n == 1 ? Z.ZERO : Z.TWO;
    }
    return get(n - 1).multiply2().signedAdd((n & 1) == 0, get((n + 1) / 2));
  }
}
