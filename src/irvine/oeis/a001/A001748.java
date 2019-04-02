package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001748 3 * primes.
 * @author Sean A. Irvine
 */
public class A001748 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mPrime.nextPrime(mN);
    return mN.multiply(3);
  }
}
