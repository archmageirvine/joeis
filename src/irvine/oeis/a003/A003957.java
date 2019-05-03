package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003957 The Dottie number: decimal expansion of root of <code>cos(x) =</code> x.
 * @author Sean A. Irvine
 */
public class A003957 implements Sequence {

  private int mN = 1;
  private CR mLo = CR.valueOf(0.7390);
  private CR mHi = CR.valueOf(0.7391);

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final String lo = mLo.toString(mN + 32);
      final String hi = mHi.toString(mN + 32);
      if (lo.charAt(mN) == hi.charAt(mN)) {
        return Z.valueOf(lo.charAt(mN) - '0');
      }
      final CR mid = mLo.add(mHi).multiply(CR.HALF);
      final CR r = mid.cos().subtract(mid);
      if (r.compareTo(CR.ZERO) > 0) {
        mLo = mid;
      } else {
        mHi = mid;
      }
    }
  }
}
