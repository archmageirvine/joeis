package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024929 a(n) = Sum_{k = 1..n} k*floor((n + prime(k))/k).
 * @author Sean A. Irvine
 */
public class A024929 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1, p = 2; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      sum = sum.add(k * ((mN + p) / k));
    }
    return sum;
  }
}
