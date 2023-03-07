package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A061674.
 * @author Sean A. Irvine
 */
public class A061835 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mA = null;
  private Z mMod = Z.TEN;
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FIVE;
    } else {
      while (true) {
        if (Z.FIVE.modPow(Z.valueOf(++mN), mMod).equals(mA)) {
          if (mVerbose) {
            StringUtils.message("Found solution 5^" + mN);
          }
          mA = Z.FIVE.pow(mN);
          while (mMod.compareTo(mA) < 0) {
            mMod = mMod.multiply(10);
          }
          break;
        }
        if (mVerbose && mN % 1000000 == 0) {
          StringUtils.message("Search completed to 5^" + mN);
        }
      }
    }
    return mA;
  }
}

