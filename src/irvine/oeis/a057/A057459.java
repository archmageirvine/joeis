package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057459.
 * @author Sean A. Irvine
 */
public class A057459 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z def = mP;
    while (true) {
      mP = mPrime.nextPrime(mP);
      final boolean none = mP.compareTo(mA) > 0;
      if (none || mA.mod(mP.subtract(1)).isZero()) {
        if (none) {
          mP = mPrime.nextPrime(def);
        }
        mA = mA.multiply(mP);
        return mP;
      }
    }
  }
}
