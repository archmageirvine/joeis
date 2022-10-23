package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001750 Primes multiplied by 5.
 * @author Sean A. Irvine
 */
public class A001750 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mPrime.nextPrime(mN);
    return mN.multiply(5);
  }
}
