package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051353 a(n) = a(n-1) + n^2 if n prime else a(n-1) - n.
 * @author Sean A. Irvine
 */
public class A051353 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mPrime.isPrime(mN)) {
      mA = mA.add(mN.square());
    } else {
      mA = mA.subtract(mN);
    }
    return mA;
  }
}
