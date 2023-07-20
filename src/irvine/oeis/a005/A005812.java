package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005812 Weight of balanced ternary representation of n.
 * @author Sean A. Irvine
 */
public class A005812 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    final int r = n % 3;
    switch (r) {
      case 0:
        return a(n / 3);
      case 1:
        return a(n / 3).add(1);
      default:
        final int s = n % 9;
        switch (s) {
          case 2:
            return a(n / 9).add(2);
          case 5:
            return a(3 * (n / 9) + 2).add(1);
          default:
            assert s == 8;
            return a(3 * (n / 9) + 2);
        }
    }
  }
}
