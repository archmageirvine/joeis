package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003618 Largest n-digit prime.
 * @author Sean A. Irvine
 */
public class A003618 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return mPrime.prevPrime(mA);
  }
}
