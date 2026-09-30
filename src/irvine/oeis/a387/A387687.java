package irvine.oeis.a387;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387687 a(n) is the smallest prime p greater than all previous terms such that the product of the previous terms plus p is prime.
 * @author Sean A. Irvine
 */
public class A387687 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mProd = Z.ONE;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mProd.add(mP).isProbablePrime()) {
        mProd = mProd.multiply(mP);
        return Z.valueOf(mP);
      }
    }
  }
}
