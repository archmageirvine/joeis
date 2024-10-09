package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072523.
 * @author Sean A. Irvine
 */
public class A072531 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      final long r = mN % p;
      if (r != 0 && !mPrime.isPrime(r)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
