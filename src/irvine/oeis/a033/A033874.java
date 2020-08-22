package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033874 Difference between the largest prime &lt; 10^n (A003618) and 10^n.
 * @author Sean A. Irvine
 */
public class A033874 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return mA.subtract(mPrime.prevPrime(mA));
  }
}
