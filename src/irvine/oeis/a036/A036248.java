package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036248 Denominator of fraction equal to the continued fraction [ 2, 3, 5, ..., prime(n) ].
 * @author Sean A. Irvine
 */
public class A036248 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mB = null;
  private long mP = 2;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    mP = mPrime.nextPrime(mP);
    if (mB == null) {
      mB = Z.THREE;
    } else {
      final Z t = mB.multiply(mP).add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

