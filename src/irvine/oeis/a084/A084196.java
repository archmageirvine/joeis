package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084196 Number of primes q&lt;prime(n) such that q+1 divides prime(n)+1.
 * @author Sean A. Irvine
 */
public class A084196 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long t = mP + 1;
    long cnt = 0;
    for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
      if (t % (q + 1) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
