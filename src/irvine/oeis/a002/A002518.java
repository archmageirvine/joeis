package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002518 Earliest sequence with a(a(n))=5n.
 * @author Sean A. Irvine
 */
public class A002518 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n % 5) {
    case 0:
      return n == 0 ? Z.ZERO : a(n / 5).multiply(5);
    case 1:
    case 3:
      return Z.valueOf(n + 1);
    default: /* 2, 4 */
      return Z.valueOf(5L * (n - 1));
    }
  }
}
