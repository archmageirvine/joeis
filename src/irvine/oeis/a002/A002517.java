package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A002517 Earliest sequence with a(a(n))=3n.
 * @author Sean A. Irvine
 */
public class A002517 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n % 3) {
    case 0:
      return n == 0 ? Z.ZERO : a(n / 3).multiply(3);
    case 1:
      return Z.valueOf(n + 1);
    default: /* 2 */
      return Z.valueOf(3 * (n - 1));
    }
  }
}
