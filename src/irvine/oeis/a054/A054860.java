package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054845.
 * @author Sean A. Irvine
 */
public class A054860 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    for (long p = 2; 3 * p <= mN; p = mPrime.nextPrime(p)) {
      for (long q = p; p + 2 * q <= mN; q = mPrime.nextPrime(q)) {
        final long r = mN - p - q;
        if (mPrime.isPrime(r)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
