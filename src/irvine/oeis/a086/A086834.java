package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086834 Smallest prime that is the smallest of at least two consecutive primes with sum=n; a(n)=0 if no consecutive primes with sum=n exist.
 * @author Sean A. Irvine
 */
public class A086834 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long p = 2; 2 * p < mN; p = mPrime.nextPrime(p)) {
      long s = p;
      for (long q = mPrime.nextPrime(p); s <= mN; q = mPrime.nextPrime(q)) {
        s += q;
        if (s == mN) {
          return Z.valueOf(p);
        }
      }
    }
    return Z.ZERO;
  }
}
