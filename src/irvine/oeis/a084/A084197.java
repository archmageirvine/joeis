package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084197 Primes p such that there exists at least one prime q&lt;p with q+1 dividing p+1.
 * @author Sean A. Irvine
 */
public class A084197 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long t = mP + 1;
      for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
        if (t % (q + 1) == 0) {
          return Z.valueOf(mP);
        }
      }
    }
  }
}
