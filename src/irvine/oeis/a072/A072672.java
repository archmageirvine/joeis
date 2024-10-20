package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072656.
 * @author Sean A. Irvine
 */
public class A072672 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mQ = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mQ = mPrime.nextPrime(mPrime.nextPrime(mQ));
    return mQ.multiply(mP).add(mQ).add(mP);
  }
}
