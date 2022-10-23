package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022892 n-th index k such that p(k) + p(k+9) = p(k+3) + p(k+6).
 * @author Sean A. Irvine
 */
public class A022892 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      final long q = mPrime.nextPrime(mPrime.nextPrime(mPrime.nextPrime(mP)));
      final long r = mPrime.nextPrime(mPrime.nextPrime(mPrime.nextPrime(q)));
      final long s = mPrime.nextPrime(mPrime.nextPrime(mPrime.nextPrime(r)));
      if (mP + s == q + r) {
        return Z.valueOf(mN);
      }
    }
  }
}
