package irvine.oeis.a008;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008866 Prime(A052928(n+1)) + (-1)^n* prime(A109613(n)).
 * @author Sean A. Irvine
 */
public class A008866 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private boolean mSign = true;
  private Z mA = Z.TWO;
  private Z mB = null;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (mSign) {
      mSign = false;
      mB = mP;
    } else {
      mSign = true;
      mA = mP;
    }
    return mB.signedAdd(mSign, mA);
  }
}

