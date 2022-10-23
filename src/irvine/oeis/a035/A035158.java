package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035158 Floor of the Chebyshev function theta(n): a(n) = floor(Sum_{primes p &lt;= n } log(p)).
 * @author Sean A. Irvine
 */
public class A035158 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private CR mSum = CR.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      mSum = mSum.add(CR.valueOf(mN).log());
    }
    return mSum.floor();
  }
}

