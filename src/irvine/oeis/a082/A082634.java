package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082634 Numbers n which can be expressed as sum of d consecutive primes (where d&gt;0 is a divisor of n).
 * @author Sean A. Irvine
 */
public class A082634 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mN)) {
        return Z.valueOf(mN); // trivial
      }
      for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
        int cnt = 0;
        long sum = 0;
        for (long q = p; sum + q <= mN; q = mPrime.nextPrime(q)) {
          sum += q;
          ++cnt;
          if (sum == mN && mN % cnt == 0) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
