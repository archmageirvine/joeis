package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057448 a(n+1) = next prime such that a(n+1)-1 | (a(1)...a(n))^5.
 * @author Sean A. Irvine
 */
public class A057448 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mA.mod(mP.subtract(1)).isZero()) {
        mA = mA.multiply(mP.pow(5));
        return mP;
      }
    }
  }
}
