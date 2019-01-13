package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001041.
 * @author Sean A. Irvine
 */
public class A001041 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = null;
  private Z mN = Z.valueOf(12);

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.ONE;
    } else {
      mP = mPrime.nextPrime(mP);
      mN = mN.multiply(mP);
    }
    return mN;
  }
}
