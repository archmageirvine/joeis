package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.a023.A023200;

/**
 * A152052 Number of cousin primes &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A152052 extends A023200 {

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

