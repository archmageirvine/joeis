package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A031400 Period of continued fraction for <code>sqrt(k)</code> equal for all <code>a(n) &lt;= k &lt; a(n)+n</code>.
 * @author Sean A. Irvine
 */
public class A031400 extends A003285 {

  private Z mPrev = super.next(); // period(sqrt(1)) == 0
  private int mN = 0;
  private int mRunLength = 0;
  private long mK = 1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mK;
      final Z a = super.next();
      if (!a.equals(mPrev)) {
        mPrev = a;
        mRunLength = 0;
      }
      if (++mRunLength == mN) {
        return Z.valueOf(mK - mN + 1);
      }
    }
  }
}
