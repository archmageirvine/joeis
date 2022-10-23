package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038804 Difference between largest n-digit prime and smallest (n+1)-digit prime.
 * @author Sean A. Irvine
 */
public class A038804 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    return mPrime.nextPrime(mN).subtract(mPrime.prevPrime(mN));
  }
}
