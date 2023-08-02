package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007479 Earliest sequence with a(a(a(n))) = 2n.
 * @author Sean A. Irvine
 */
public class A007479 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    switch (n % 6) {
      case 0:
      case 2:
      case 4:
        return a(n / 2).multiply2();
      case 1:
      case 3:
        return Z.valueOf(n + 2);
      default: // 5
        return Z.valueOf(12L * (n / 6) + 2);
    }
  }
}
