package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034387 Sum of primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A034387 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      mSum = mSum.add(mN);
    }
    return mSum;
  }
}
