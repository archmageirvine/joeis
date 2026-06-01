package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085064 a(n) = smallest k such that n*k-1 as well as n+k are primes.
 * @author Sean A. Irvine
 */
public class A085064 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    long k = ++mN;
    final Z n = Z.valueOf(mN);
    while (true) {
      k = mPrime.nextPrime(k);
      if (n.multiply(k - mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(k - mN);
      }
    }
  }
}
