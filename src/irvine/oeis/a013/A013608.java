package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013608 7^n-prevprime(7^n).
 * @author Sean A. Irvine
 */
public class A013608 extends Sequence1 {

  private Prime mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(7);
    return mA.subtract(mPrime.prevPrime(mA));
  }
}
