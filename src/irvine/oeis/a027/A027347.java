package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027347 Number of partitions of n into distinct odd parts, the least being congruent to 1 mod 4.
 * @author Sean A. Irvine
 */
public class A027347 extends A027345 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; k += 4) {
      sum = sum.add(distinctOddPartsMinimum(mN, k));
    }
    return sum;
  }
}
