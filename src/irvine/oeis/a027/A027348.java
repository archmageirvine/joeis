package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027348 Number of partitions of n into distinct odd parts, the least being congruent to <code>3 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A027348 extends A027345 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 3; k <= mN; k += 4) {
      sum = sum.add(distinctOddPartsMinimum(mN, k));
    }
    return sum;
  }
}
