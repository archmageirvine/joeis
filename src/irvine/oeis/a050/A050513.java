package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050513 a(n) = (-1)^n * Sum_{i=0..n} binomial(n+1,i+1)*prime(i+1).
 * @author Sean A. Irvine
 */
public class A050513 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1, p = 2; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(p));
    }
    return (mN & 1) == 1 ? sum : sum.negate();
  }
}
