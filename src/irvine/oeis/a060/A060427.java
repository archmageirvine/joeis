package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060427 Smallest prime p such that there are n strings of consecutive integers all having products = 1 mod p.
 * @author Sean A. Irvine
 */
public class A060427 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mP = 2;

  private int consecCount(final long p, final long s) {
    int cnt = 0;
    long t = 1;
    for (long k = s; k < p; ++k) {
      t *= k;
      t %= p;
      if (t == 1) {
        ++cnt;
      }
    }
    return cnt;
  }

  private int consecCount(final long p) {
    int max = 0;
    for (long s = 2; s < p; ++s) {
      final int cnt = consecCount(p, s);
      if (cnt > max) {
        max = cnt;
      }
    }
    return max;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    while (consecCount(mP) < mN) {
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}
