package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007965.
 * @author Sean A. Irvine
 */
public class A007965 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mP = mPrime.nextPrime(mP);
    return mN.pow(mP).subtract(mP.pow(mN));
  }
}
