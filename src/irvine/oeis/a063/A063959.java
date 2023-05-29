package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A063959 Sum of the primes from 1 to n!.
 * @author Sean A. Irvine
 */
public class A063959 extends A000142 {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mP = 2;

  @Override
  public Z next() {
    final long t = super.next().longValueExact();
    while (mP <= t) {
      mSum = mSum.add(mP);
      mP = mPrime.nextPrime(mP);
    }
    return mSum;
  }
}

