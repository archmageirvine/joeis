package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A075304 Smallest prime greater than the previous term == 1 mod n-th composite number.
 * @author Sean A. Irvine
 */
public class A075304 extends A002808 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z mod = super.next();
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.mod(mod).equals(Z.ONE)) {
        return mP;
      }
    }
  }
}
