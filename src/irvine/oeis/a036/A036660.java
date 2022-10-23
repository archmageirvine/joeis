package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036660 Product of prime p with sum of next p consecutive primes.
 * @author Sean A. Irvine
 */
public class A036660 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z s = Z.ZERO;
    for (long k = 0, q = mPrime.nextPrime(mP); k < mP; ++k, q = mPrime.nextPrime(q)) {
      s = s.add(q);
    }
    return s.multiply(mP);
  }
}
