package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A019308.
 * @author Sean A. Irvine
 */
public class A019308 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return get(n - 1).multiply(3).subtract((n & 1) == 0 ? get(n / 2) : Z.ZERO);
  }
}
