package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069565 extends Sequence0 {

  private Z mA = null;
  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mP = mPrime.nextPrime(mP);
      if (mA.mod(mP) == 0) {
        return Z.ZERO;
      }
      long k = 0;
      while (true) {
        final Z t = mA.multiply(++k).add(1);
        if (t.mod(mP) == 0) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
