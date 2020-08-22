package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A031401 Period of continued fraction for sqrt(A031400(n)).
 * @author Sean A. Irvine
 */
public class A031401 extends A003285 {

  private Z mPrev = super.next(); // period(sqrt(1)) == 0
  private int mN = 0;
  private int mRunLength = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z a = super.next();
      if (!a.equals(mPrev)) {
        mPrev = a;
        mRunLength = 0;
      }
      if (++mRunLength == mN) {
        return a;
      }
    }
  }
}
