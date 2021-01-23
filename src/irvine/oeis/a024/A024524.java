package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024524 4th elementary symmetric function of {1, p(1), p(2), ..., p(n-1)}, where p(0) = 1.
 * @author Sean A. Irvine
 */
public class A024524 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mS = 3;

  @Override
  public Z next() {
    mS = mPrime.nextPrime(mS);
    final Z s = Z.valueOf(mS);
    for (long p = 1; p < mS; p = mPrime.nextPrime(p)) {
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
