package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a031.A031157;

/**
 * A055728.
 * @author Sean A. Irvine
 */
public class A055728 extends A031157 {

  private long mLimit = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    mLimit = mLimit == 0 ? 1 : mLimit * 10;
    while (super.next().longValueExact() < mLimit) {
      ++mCount;
    }
    return Z.valueOf(mCount++);
  }
}
