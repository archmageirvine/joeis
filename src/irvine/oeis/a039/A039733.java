package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A039733 a(n)=k such that prime(k) is the prime q&lt;prime(n) for which (prime(n) mod q) is maximal.
 * @author Sean A. Irvine
 */
public class A039733 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long max = 0;
    long maxk = 0;
    for (long q = 2, k = 1; q < mP; q = mPrime.nextPrime(q), ++k) {
      final long r = mP % q;
      if (r > max) {
        max = r;
        maxk = k;
      }
    }
    return Z.valueOf(maxk);
  }
}
