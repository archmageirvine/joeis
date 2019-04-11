package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007378 <code>a(n), n&gt;=2,</code> is smallest positive integer which is consistent with sequence being monotonically increasing and satisfying <code>a(a(n)) = 2n</code>.
 * @author Sean A. Irvine
 */
public class A007378 extends MemorySequence {

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
