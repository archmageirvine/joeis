package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007379.
 * @author Sean A. Irvine
 */
public class A007379 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n & 7) {
      case 0:
        return n == 0 ? Z.ZERO : get(2 * (n / 8)).multiply(4);
      case 1:
        return Z.valueOf(n + 1);
      case 2:
        return Z.valueOf(4L * (n - 2) + 4);
      case 3:
        return Z.valueOf(n + 2);
      case 4:
        return get(n / 4).multiply(4);
      case 5:
        return Z.valueOf(4L * (n - 5) + 12);
      case 6:
        return Z.valueOf(n + 1);
      default: // 7
        return Z.valueOf(4L * (n - 7) + 24);
    }
  }
}
