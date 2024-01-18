package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067823 Start with 2 and concatenate ("absorb") the next prime; continually repeat this procedure.
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
