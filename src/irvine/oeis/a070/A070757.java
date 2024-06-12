package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070757 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 4;
    long cnt = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      for (long q = p; q < mN - p; q = mPrime.nextPrime(q)) {
        for (long r = q; r < mN - p - q; r = mPrime.nextPrime(r)) {
          final long s = mN - p - q - r;
          if (s >= r && mPrime.isPrime(s)) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
