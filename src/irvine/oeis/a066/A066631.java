package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066631 The sequence f(1), f(2), ... as defined in A068192.
 * @author Sean A. Irvine
 */
public class A066631 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.multiply(mA.subtract(mPrime.prevPrime(mA.subtract(1))));
    return mA;
  }
}
