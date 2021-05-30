package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A048054 Number of n-digit reversible primes (emirps).
 * @author Sean A. Irvine
 */
public class A048054 extends A000040 {

  private Z mLim = Z.TEN;
  private Z mP = super.next();

  @Override
  public Z next() {
    long cnt = 0;
    while (mP.compareTo(mLim) <= 0) {
      if (ZUtils.reverse(mP).isProbablePrime()) {
        ++cnt;
      }
      mP = super.next();
    }
    mLim = mLim.multiply(10);
    return Z.valueOf(cnt);
  }
}
