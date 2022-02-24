package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A054782 Number of primes &lt;= the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A054782 extends A000045 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mCount = 0;

  @Override
  public Z next() {
    final long f = super.next().longValueExact();
    while (mP <= f) {
      mP = mPrime.nextPrime(mP);
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
