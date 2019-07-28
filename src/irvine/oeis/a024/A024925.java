package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024925 Sum of remainders of <code>n mod prime(k)</code>, for k <code>= 1,2,3,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024925 implements Sequence {

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
