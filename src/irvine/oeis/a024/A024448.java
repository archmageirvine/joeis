package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024448 <code>a(n) = 3rd</code> elementary symmetric function of the first <code>n+2</code> primes.
 * @author Sean A. Irvine
 */
public class A024448 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mR = 3;

  @Override
  public Z next() {
    mR = mPrime.nextPrime(mR);
    final Z r = Z.valueOf(mR);
    for (long p = 2; p < mR; p = mPrime.nextPrime(p)) {
      final Z pr = r.multiply(p);
      for (long q = mPrime.nextPrime(p); q < mR; q = mPrime.nextPrime(q)) {
        mSum = mSum.add(pr.multiply(q));
      }
    }
    return mSum;
  }
}
