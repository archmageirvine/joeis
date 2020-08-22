package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024523 a(n) = 3rd elementary symmetric function of {1, p(1), p(2), ..., p(n-1)}, where p(0) = 1.
 * @author Sean A. Irvine
 */
public class A024523 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mR = 2;

  @Override
  public Z next() {
    mR = mPrime.nextPrime(mR);
    final Z r = Z.valueOf(mR);
    for (long p = 1; p < mR; p = mPrime.nextPrime(p)) {
      final Z pr = r.multiply(p);
      for (long q = mPrime.nextPrime(p); q < mR; q = mPrime.nextPrime(q)) {
        mSum = mSum.add(pr.multiply(q));
      }
    }
    return mSum;
  }
}
