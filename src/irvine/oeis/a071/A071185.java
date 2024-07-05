package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071185 Smallest k such that prime(k*n)-k*prime(n) is prime.
 * @author Sean A. Irvine
 */
public class A071185 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  private long step(long q, final long n) {
    for (long k = 0; k < n; ++k) {
      q = mPrime.nextPrime(q);
    }
    return q;
  }

  @Override
  public Z next() {
    ++mN;
    mP = mPrime.nextPrime(mP);
    long k = 1;
    long q = mP;
    while (true) {
      q = step(q, mN);
      ++k;
      if (mPrime.isPrime(q - mP * k)) {
        return Z.valueOf(k);
      }
    }
  }
}
