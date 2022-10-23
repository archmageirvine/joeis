package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054892 Smallest prime a(n) such that the sum of n consecutive primes starting with a(n) is divisible by n.
 * @author Sean A. Irvine
 */
public class A054892 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      long q = p;
      long sum = 0;
      for (long k = 0; k < mN; ++k, q = mPrime.nextPrime(q)) {
        sum += q;
      }
      if (sum % mN == 0) {
        return Z.valueOf(p);
      }
    }
  }
}
