package irvine.oeis.a139;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A139432 a(0)=0. For n&gt;=1, a(n) = a(n-1) - d(n) if a(n-1) &gt;= d(n); a(n) = a(n-1) + d(n) if a(n-1) &lt; d(n); where d(n) is the number of positive divisors of n.
 * @author Sean A. Irvine
 */
public class A139432 extends Sequence0 {

  private long mN = -1;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    if (++mN != 0) {
      final Z d = Jaguar.factor(mN).sigma0();
      if (mPrev.compareTo(d) >= 0) {
        mPrev = mPrev.subtract(d);
      } else {
        mPrev = mPrev.add(d);
      }
    }
    return mPrev;
  }
}

