package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000404;

/**
 * A077773 Number of integers between n^2 and (n+1)^2 that are the sum of two squares; multiple representations are counted once.
 * @author Sean A. Irvine
 */
public class A077773 extends A000404 {

  private long mN = 0;
  private Z mA = super.next();

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final Z lim = Z.valueOf(mN).square();
    while (mA.compareTo(lim) <= 0) {
      if (!mA.equals(lim)) {
        ++cnt;
      }
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}

