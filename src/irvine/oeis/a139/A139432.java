package irvine.oeis.a139;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A139432 <code>a(0)=0</code>. For <code>n&gt;=1, a(n) = a(n-1) - d(n)</code> if <code>a(n-1) &gt;= d(n); a(n) = a(n-1) + d(n)</code> if <code>a(n-1) &lt; d(n)</code>; where <code>d(n)</code> is the number of positive divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A139432 implements Sequence {

  private long mN = -1;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    if (++mN != 0) {
      final Z d = Cheetah.factor(mN).sigma0();
      if (mPrev.compareTo(d) >= 0) {
        mPrev = mPrev.subtract(d);
      } else {
        mPrev = mPrev.add(d);
      }
    }
    return mPrev;
  }
}

