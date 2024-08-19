package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071839 Number of primes == 1 mod 8 &lt;= n.
 * @author Sean A. Irvine
 */
public class A071839 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if ((++mN & 7) == 1 && mPrime.isPrime(mN)) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
