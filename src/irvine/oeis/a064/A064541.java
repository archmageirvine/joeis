package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064541 Numbers k such that 2^k ends in k.
 * @author Sean A. Irvine
 */
public class A064541 extends Sequence1 {

  private Z mA = null;
  private Z mMod = Z.valueOf(100);

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(36);
    } else {
      while (true) {
        mMod = mMod.multiply(10);
        final Z t = Z.TWO.modPow(mA, mMod);
        if (!t.equals(mA)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

