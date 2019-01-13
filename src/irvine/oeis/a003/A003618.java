package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003618.
 * @author Sean A. Irvine
 */
public class A003618 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return mPrime.prevPrime(mA);
  }
}
