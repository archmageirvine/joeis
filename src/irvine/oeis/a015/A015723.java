package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a008.A008289;

/**
 * A015723 Number of parts in all partitions of n into distinct parts.
 * @author Sean A. Irvine
 */
public class A015723 extends A008289 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k));
    }
    return sum;
  }
}
