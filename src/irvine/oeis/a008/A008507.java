package irvine.oeis.a008;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008507.
 * @author Sean A. Irvine
 */
public class A008507 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mOddComposites = Z.ZERO;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mP.add(2);
      if (mPrime.isPrime(mP)) {
        return mOddComposites;
      }
      mOddComposites = mOddComposites.add(1);
    }
  }
}

