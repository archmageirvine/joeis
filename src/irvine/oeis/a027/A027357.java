package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027357 Number of partitions of n into distinct odd parts, the greatest being congruent to <code>1 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A027357 extends A027356 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; k += 4) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
