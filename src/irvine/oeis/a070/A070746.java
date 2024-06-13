package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070746 Numbers k such that k 1's followed by k is a prime.
 * @author Sean A. Irvine
 */
public class A070746 extends Sequence1 {

  private Z mA = null;
  private long mN = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    while (true) {
      mA = mA.multiply(100).add(11);
      mN += 2;
      if (mN > mLim) {
        mLim *= 10;
      }
      final Z t = mA.multiply(mLim).add(mN);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
