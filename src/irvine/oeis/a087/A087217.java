package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087217 In decimal representation: smallest multiple of n containing it as substring.
 * @author Sean A. Irvine
 */
public class A087217 extends Sequence1 {

  private long mN = 0;
  private long mLim = 10;

  private boolean is(final long n, final long k) {
    long m = n * k;
    while (m >= n) {
      if (m % mLim == n) {
        return true;
      }
      m /= 10;
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == mLim) {
      mLim *= 10;
    }
    long k = 1;
    while (true) {
      if (is(mN, ++k)) {
        return Z.valueOf(mN * k);
      }
    }
  }
}
