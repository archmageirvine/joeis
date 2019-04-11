package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005590 <code>a(0) = 0, a(1) = 1, a(2n) = a(n), a(2n+1) = a(n+1) - a(n)</code>.
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
      return get(n / 2);
    }
    return get(n / 2 + 1).subtract(get(n / 2));
  }
}

