package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027350 Number of partitions of n into distinct odd parts, the least being 3.
 * @author Sean A. Irvine
 */
public class A027350 extends A027345 {

  private int mN = 0;

  @Override
  public Z next() {
    return distinctOddPartsMinimum(++mN, 3);
  }
}
