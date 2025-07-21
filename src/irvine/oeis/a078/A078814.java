package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A078814 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long p = 13;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Z.TEN.modPow(Z.TEN.modPow(100, Z.valueOf(p - 1)), Z.valueOf(p)).equals(mN)) {
        return Z.valueOf(p);
      }
    }
  }
}
