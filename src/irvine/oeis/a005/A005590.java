package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005590 a(0) = 0, a(1) = 1, a(2n) = a(n), a(2n+1) = a(n+1) - a(n).
 * @author Sean A. Irvine
 */
public class A005590 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.valueOf(n);
    }
    if ((n & 1) == 0) {
      return a(n / 2);
    }
    return a(n / 2 + 1).subtract(a(n / 2));
  }
}

