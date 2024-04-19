package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013607 a(n) = 6^n-prevprime(6^n).
 * @author Sean A. Irvine
 */
public class A013607 extends Sequence1 {

  private final Prime mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(6);
    return mA.subtract(mPrime.prevPrime(mA));
  }
}
