package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058910 Smallest prime number, not already in sequence, such that the product M of it and all prior numbers in sequence satisfies 2^(M+1) = 1 (mod M).
 * @author Sean A. Irvine
 */
public class A058910 extends Sequence1 {

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
