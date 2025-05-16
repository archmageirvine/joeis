package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077350 Smallest number beginning with n and having exactly n divisors.
 * @author Sean A. Irvine
 */
public class A077350 extends Sequence1 {

  // After Max Alekseyev

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      final long lenN = Functions.DIGIT_LENGTH.l(mN);
      Z p = Z.ONE;
      while (true) {
        p = mPrime.nextPrime(p);
        final Z m = p.pow(mN - 1);
        if (m.divide(Z.TEN.pow(Functions.DIGIT_LENGTH.l(m) - lenN)).equals(mN)) {
          return m;
        }
      }
    } else {
      long d = 0;
      while (true) {
        final Z d10 = Z.TEN.pow(d);
        for (Z k = Z.ZERO; k.compareTo(d10) < 0; k = k.add(1)) {
          final Z m = d10.multiply(mN).add(k);
          if (Functions.SIGMA0.z(m).equals(mN)) {
            return m;
          }
        }
        ++d;
      }
    }
  }
}
