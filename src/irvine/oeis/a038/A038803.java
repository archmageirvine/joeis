package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038803 Largest number with n prime factors all of different lengths.
 * @author Sean A. Irvine
 */
public class A038803 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    mA = mA.multiply(mPrime.prevPrime(mN));
    return mA;
  }
}
