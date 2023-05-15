package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063807 a(0) = 0, a(n+1) = a(n) + next prime larger than a(n).
 * @author Sean A. Irvine
 */
public class A063807 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.add(mPrime.nextPrime(mA));
    return mA;
  }
}
