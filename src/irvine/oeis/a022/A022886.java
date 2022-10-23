package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022886 n-th index k such that p(k) + p(k+4) = p(k+1) + p(k+3).
 * @author Sean A. Irvine
 */
public class A022886 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      final long q = mPrime.nextPrime(mP);
      final long r = mPrime.nextPrime(mPrime.nextPrime(q));
      final long s = mPrime.nextPrime(r);
      if (mP + s == q + r) {
        return Z.valueOf(mN);
      }
    }
  }
}
