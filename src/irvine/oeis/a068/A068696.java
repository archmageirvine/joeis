package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068696 Number of primes that are a concatenation nk of n and k for values of k from 1 to n.
 * @author Sean A. Irvine
 */
public class A068696 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long lim = 10;
    long cnt = 0;
    for (long k = 1; k <= mN; k += 2) {
      if (k > lim) {
        lim *= 10;
      }
      if (mPrime.isPrime(mN * lim + k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
