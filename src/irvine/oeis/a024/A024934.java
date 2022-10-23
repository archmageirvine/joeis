package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024934 Sum of remainders n mod p, over all primes p &lt; n.
 * @author Sean A. Irvine
 */
public class A024934 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(mN % p);
    }
    return sum;
  }
}
