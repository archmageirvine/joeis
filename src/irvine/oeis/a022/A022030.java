package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022030 For even n, a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n); for odd n, the least integer such that a(n+2)/a(n+1) &gt; a(n+1)/a(n); a(0) = 4, a(1) = 16.
 * @author Sean A. Irvine
 */
public class A022030 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private boolean mC = true;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.FOUR;
        return mA;
      }
      mB = Z.valueOf(16);
    } else {
      mC = !mC;
      final Q q = new Q(mB.square(), mA);
      final Z t = mC ? q.add(1).floor() : q.subtract(1).ceiling();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
