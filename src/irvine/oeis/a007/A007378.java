package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007378 a(n), for n &gt;= 2, is smallest positive integer which is consistent with sequence being monotonically increasing and satisfying a(a(n)) = 2n.
 * @author Sean A. Irvine
 */
public class A007378 extends MemorySequence {

  {
    setOffset(2);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
      case 0:
        return Z.THREE;
      case 1:
        return Z.FOUR;
      default:
        if ((n & 1) == 0) {
          return get(n / 2 - 1).multiply2();
        } else {
          return get(n / 2).add(get(n / 2 - 1));
        }
    }
  }
}
