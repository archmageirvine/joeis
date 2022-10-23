package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013604 a(n) = 3^n - prevprime(3^n), where prevprime(x) is the largest prime &lt; x.
 * @author Sean A. Irvine
 */
public class A013604 extends Sequence1 {

  private Prime mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(3);
    return mA.subtract(mPrime.prevPrime(mA));
  }
}
