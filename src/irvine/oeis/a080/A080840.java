package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a046.A046132;

/**
 * A080840 Number of cousin primes &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A080840 extends A046132 {

  private Z mA = super.next();
  private Z mLim = Z.ONE;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    while (mA.compareTo(mLim) < 0) {
      ++mCount;
      mA = super.next();
    }
    return Z.valueOf(mCount);
  }
}

