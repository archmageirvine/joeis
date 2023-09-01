package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065382 Number of primes between n(n+1)/2 (exclusive) and (n+1)(n+2)/2 (inclusive).
 * @author Sean A. Irvine
 */
public class A065382 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 2;

  @Override
  public Z next() {
    final long lim = ++mN * (mN + 1) / 2;
    long cnt = 0;
    while (mP <= lim) {
      ++cnt;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(cnt);
  }
}
