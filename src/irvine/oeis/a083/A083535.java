package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083535 A version of the Chebyshev function theta(n): a(n) = ceiling(Sum_{primes p &lt;= n } log(p)).
 * @author Sean A. Irvine
 */
public class A083535 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private CR mSum = CR.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      mSum = mSum.add(CR.valueOf(mN).log());
    }
    return mSum.ceil();
  }
}

