package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038623 Smallest prime p such that p/pi(p)&gt;=n.
 * @author Sean A. Irvine
 */
public class A038623 extends A000040 {

  private long mN = 0;
  private long mPi = 1;
  private Z mP = super.next();

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.longValueExact() >= mN * mPi) {
        return mP;
      }
      ++mPi;
      mP = super.next();
    }
  }
}
