package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058909.
 * @author Sean A. Irvine
 */
public class A058910 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z t = mProd.multiply(mP);
      if (Z.ONE.equals(Z.TWO.modPow(t.add(1), t))) {
        mProd = t;
        return mP;
      }
    }
  }
}
