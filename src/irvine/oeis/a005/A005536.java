package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005536 <code>a(0) = 0, a(2n) = n - a(n) - a(n-1), a(2n+1) = n - 2a(n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A005536 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final int m = n / 2;
    if ((n & 1) == 0) {
      return Z.valueOf(m).subtract(get(m)).subtract(get(m - 1));
    } else {
      return Z.valueOf(m + 1).subtract(get(m).multiply2());
    }
  }
}
