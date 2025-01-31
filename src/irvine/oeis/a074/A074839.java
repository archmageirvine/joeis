package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074839 a(0) = 1, a(n+1) = a(n) + next prime larger than a(n).
 * @author Sean A. Irvine
 */
public class A074839 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(mPrime.nextPrime(mA));
    return mA;
  }
}
