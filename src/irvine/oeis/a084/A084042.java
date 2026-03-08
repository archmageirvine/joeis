package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084042 Smallest multiple of n in which the digit string of n appears sandwiched between at least a pair of digits.
 * @author Sean A. Irvine
 */
public class A084042 extends Sequence1 {

  private long mN = 0;
  private long mMod = 10;

  private boolean is(final long k) {
    long m = k / 10;
    while (m >= mMod) {
      if (m % mMod == mN) {
        return true;
      }
      m /= 10;
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == mMod) {
      mMod *= 10;
    }
    long k = ((mMod * 10) / mN) * mN;
    while (true) {
      if (is(k)) {
        return Z.valueOf(k);
      }
      k += mN;
    }
  }
}

