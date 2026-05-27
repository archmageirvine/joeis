package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085052 Start with n and continue adding primes until one reaches a prime &gt; n. Or, sequence gives n + P(k) where P(k)=sum_{k=1..n} prime(k) and k is the least value such that n + P(k) is prime and &gt; n.
 * @author Sean A. Irvine
 */
public class A085052 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      k += p;
      if (mPrime.isPrime(k)) {
        return Z.valueOf(k);
      }
    }
  }
}
