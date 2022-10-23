package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013941 a(n) = Sum_{k = 1..n} floor(n/prime(k)^3).
 * @author Sean A. Irvine
 */
public class A013941 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long p = 2; p * p * p <= mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(mN / (p * p * p));
    }
    return sum;
  }
}
