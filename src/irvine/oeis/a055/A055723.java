package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A055723 Number of lucky numbers (A000959) &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A055723 extends A000959 {

  private long mLimit = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    mLimit = mLimit == 0 ? 1 : mLimit * 10;
    while (super.next().longValueExact() <= mLimit) {
      ++mCount;
    }
    return Z.valueOf(mCount++);
  }
}
