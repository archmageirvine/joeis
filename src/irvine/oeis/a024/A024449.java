package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024449 4th elementary symmetric function of the first n+3 primes.
 * @author Sean A. Irvine
 */
public class A024449 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mS = 5;

  @Override
  public Z next() {
    mS = mPrime.nextPrime(mS);
    final Z s = Z.valueOf(mS);
    for (long p = 2; p < mS; p = mPrime.nextPrime(p)) {
      final Z ps = s.multiply(p);
      for (long q = mPrime.nextPrime(p); q < mS; q = mPrime.nextPrime(q)) {
        final Z pqs = ps.multiply(q);
        for (long r = mPrime.nextPrime(q); r < mS; r = mPrime.nextPrime(r)) {
          mSum = mSum.add(pqs.multiply(r));
        }
      }
    }
    return mSum;
  }
}
