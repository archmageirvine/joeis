package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059847 a(n)=2*p+2n-1, the smallest prime q such that p=[q-(2n-1)]/2 is prime. A special generalization of safe primes: 1 is replaced with 2n-1.
 * @author Sean A. Irvine
 */
public class A059847 implements Sequence {

  private long mN = -1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mN += 2;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final long q = mPrime.nextPrime(2 * p);
      if (q - 2 * p == mN) {
        return Z.valueOf(q);
      }
    }
  }
}
