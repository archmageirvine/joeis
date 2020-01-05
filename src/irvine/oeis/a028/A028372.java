package irvine.oeis.a028;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028372 Smallest prime that is simultaneously of forms <code>x^2 + m*y^2</code> for m <code>= 1</code>, ..., <code>n</code>.
 * @author Sean A. Irvine
 */
public class A028372 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;

  private boolean isRepresentable(final long p, final long k) {
    long t;
    for (long j = 1; (t = p - k * j * j) >= 0; ++j) {
      final long s = LongUtils.sqrt(t);
      if (s * s == t) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long p, final long n) {
    for (long k = n; k > 0; --k) {
      if (!isRepresentable(p, k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mP, mN)) {
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}
