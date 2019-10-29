package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027358 Number of partitions of n into distinct odd parts, the greatest being congruent to <code>3 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A027358 extends A027356 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 3; k <= mN; k += 4) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
