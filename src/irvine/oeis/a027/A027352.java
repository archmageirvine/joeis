package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027352 Number of partitions of n into distinct odd parts, the least being 7.
 * @author Sean A. Irvine
 */
public class A027352 extends A027345 {

  private int mN = 0;

  @Override
  public Z next() {
    return distinctOddPartsMinimum(++mN, 7);
  }
}
