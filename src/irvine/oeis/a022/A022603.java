package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a014.A014232;

/**
 * A022603.
 * @author Sean A. Irvine
 */
public class A022603 extends A014232 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mPi = 0;

  @Override
  public Z next() {
    final Z target = super.next();
    while (!target.equals(mP)) {
      mP = mPrime.nextPrime(mP);
      ++mPi;
    }
    return Z.valueOf(mPi);
  }
}
