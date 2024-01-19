package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068004 a(1) = 7, a(n+1) is the concatenation of a(n) and the next prime after a(n).
 * @author Sean A. Irvine
 */
public class A068004 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(mA.length() == 0 ? Z.SEVEN : mPrime.nextPrime(new Z(mA)));
    return new Z(mA);
  }
}
