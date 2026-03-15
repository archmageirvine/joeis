package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084198 Primes p such that there exists exactly one prime q&lt;p with q+1 dividing p+1.
 * @author Sean A. Irvine
 */
public class A084198 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long t = mP + 1;
      int cnt = 0;
      for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
        if (t % (q + 1) == 0 && ++cnt > 1) {
          break;
        }
      }
      if (cnt == 1) {
        return Z.valueOf(mP);
      }
    }
  }
}
