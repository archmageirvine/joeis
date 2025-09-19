package irvine.oeis.a387;

import irvine.math.z.Z;

/**
 * A387867 a(n) is the number of n-digit terms in A387866.
 * @author Sean A. Irvine
 */
public class A387867 extends A387866 {

  private Z mLim = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    long cnt = 0;
    while (mA.compareTo(mLim) < 0) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}
