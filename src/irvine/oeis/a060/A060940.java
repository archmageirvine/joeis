package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060940 Triangle in which n-th row gives the phi(n) terms appearing as initial primes in arithmetic progressions with difference n, with initial term equal to the smallest positive residue coprimes to n.
 * @author Sean A. Irvine
 */
public class A060940 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 1;
      }
      if (LongUtils.gcd(mN, mM) == 1) {
        long k = mM;
        while (true) {
          k += mN;
          if (mPrime.isPrime(k)) {
            return Z.valueOf(k);
          }
        }
      }
    }
  }
}
