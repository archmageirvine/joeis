package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013605 a(n) = 5^n-prevprime(5^n).
 * @author Sean A. Irvine
 */
public class A013605 extends Sequence1 {

  private Prime mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(5);
    return mA.subtract(mPrime.prevPrime(mA));
  }
}
