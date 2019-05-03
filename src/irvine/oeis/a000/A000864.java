package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000864 Deceptive nonprimes: composite numbers n such that n divides the repunit <code>R_{n-1}</code>.
 * @author Sean A. Irvine
 */
public class A000864 implements Sequence {

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
