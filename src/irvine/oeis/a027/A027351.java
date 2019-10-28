package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027351 Number of partitions of n into distinct odd parts, the least being 5.
 * @author Sean A. Irvine
 */
public class A027351 extends A027345 {

  private int mN = 0;

  @Override
  public Z next() {
    return distinctOddPartsMinimum(++mN, 5);
  }
}
