package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A015716 Triangle read by rows: T(n,k) is the number of partitions of n into distinct parts, one of which is k (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A015716 extends A000009 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      super.next();
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / mM; ++k) {
      sum = sum.signedAdd((k & 1) == 1, get(mN - k * mM));
    }
    return sum;
  }
}
