package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050264 Weak veryprimes.
 * @author Sean A. Irvine
 */
public class A050264 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    outer:
    while (true) {
      //++mN;
      mN = mPrime.nextPrime(mN); // it appears all such numbers are prime
      final long s = LongUtils.sqrt(mN);
      for (long p = 2; p <= s; p = mPrime.nextPrime(p)) {
        final long q = 2 * Math.abs((mN % p) * 2  - p);
        if (q > p) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}

