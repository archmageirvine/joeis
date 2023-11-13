package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066838 Product of primes &lt; n that do not divide n.
 * @author Sean A. Irvine
 */
public class A066838 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (mN % p != 0) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
