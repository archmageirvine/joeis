package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068003 a(1) = 5, a(n+1) is the concatenation of a(n) and the next prime after a(n).
 * @author Sean A. Irvine
 */
public class A068003 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(mA.length() == 0 ? Z.FIVE : mPrime.nextPrime(new Z(mA)));
    return new Z(mA);
  }
}
