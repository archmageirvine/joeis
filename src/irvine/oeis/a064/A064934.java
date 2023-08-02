package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064933.
 * @author Sean A. Irvine
 */
public class A064934 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z res = mA.isZero() ? Z.ONE : mPrime.nextPrime(mA);
    mA = mA.add(res);
    return res;
  }
}
