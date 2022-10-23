package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000864 Deceptive nonprimes: composite numbers k that divide the repunit R_{k-1}.
 * @author Sean A. Irvine
 */
public class A000864 extends Sequence1 {

  private long mN = 89;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && mN % 5 != 0) {
        final Z n = Z.valueOf(mN);
        final Z t = Z.valueOf(mN - 1);
        if (Z.ONE.equals(Z.TEN.modPow(t, n.multiply(9)))) {
          return n;
        }
      }
    }
  }
}
