package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002083.
 * @author Sean A. Irvine
 */
public class A002083 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.ONE;
    } else if ((n & 1) == 0) {
      return get(n - 1).multiply2();
    } else {
      return get(n - 1).multiply2().subtract(get(n / 2));
    }
  }
}
