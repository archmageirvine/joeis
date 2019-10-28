package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027349 Number of partitions of n into distinct odd parts, the least being 1.
 * @author Sean A. Irvine
 */
public class A027349 extends A027345 {

  private int mN = 0;

  @Override
  public Z next() {
    return distinctOddPartsMinimum(++mN, 1);
  }
}
