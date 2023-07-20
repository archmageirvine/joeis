package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A061295 Minimal number of steps to get from 0 to n by (a) adding 1 or (b) subtracting 1 or (c) multiplying by 3.
 * @author Sean A. Irvine
 */
public class A061295 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n % 3) {
      case 0:
        return n == 0 ? Z.ZERO : a(n / 3).add(1);
      case 1:
        return n == 1 ? Z.ONE : a(n / 3).add(2);
      default:
        return n == 2 ? Z.TWO : a(n / 3 + 1).add(2);
    }
  }
}

