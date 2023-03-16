package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061850.
 * @author Sean A. Irvine
 */
public class A062044 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z p = mPrime.nextPrime(mA.multiply2());
    mA = p.subtract(mA);
    return p;
  }
}
