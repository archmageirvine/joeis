package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a031.A031158;

/**
 * A055724 Number of lucky twins &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A055724 extends A031158 {

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
