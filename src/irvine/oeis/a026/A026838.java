package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026838 Number of partitions of n into distinct parts, the greatest being even.
 * @author Sean A. Irvine
 */
public class A026838 extends A026836 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; k += 2) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
