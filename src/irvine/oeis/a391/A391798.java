package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391798 Numbers k such that prime(2*k + 2) - prime(2*k) = prime(2*k + 1) - prime(2*k - 1).
 * @author Sean A. Irvine
 */
public class A391798 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long q = mPrime.nextPrime(mP);
      mP = mPrime.nextPrime(q); // p(2k)
      final long r = mPrime.nextPrime(mP);
      if (mPrime.nextPrime(r) - mP == r - q) {
        return Z.valueOf(mN);
      }
    }
  }
}
