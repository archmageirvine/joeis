package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024925 Sum of remainders of n mod prime(k), for k = 1,2,3,...,n.
 * @author Sean A. Irvine
 */
public class A024925 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1, p = 2; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      sum = sum.add(mN % p);
    }
    return sum;
  }
}
