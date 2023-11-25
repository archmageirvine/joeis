package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066838 Product of primes &lt; n that do not divide n.
 * @author Sean A. Irvine
 */
public class A066909 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long prod = 1 % ++mN;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (mN % p != 0) {
        prod *= p;
        prod %= mN;
      }
    }
    return Z.valueOf(prod);
  }
}
