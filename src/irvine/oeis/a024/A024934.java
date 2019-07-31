package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024934 Sum of remainders <code>n mod</code> p, over all primes p <code>&lt; n</code>.
 * @author Sean A. Irvine
 */
public class A024934 implements Sequence {

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
