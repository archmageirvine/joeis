package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394209 Number of primes p such that 3^(n-1) &lt;= p &lt; 3^n.
 * @author Sean A. Irvine
 */
public class A394209 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mLimit = 3;
  private long mP = 2;

  @Override
  public Z next() {
    long count = 0;
    while (mP < mLimit) {
      mP = mPrime.nextPrime(mP);
      ++count;
    }
    mLimit *= 3;
    return Z.valueOf(count);
  }
}
