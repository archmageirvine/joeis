package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050217.
 * @author Sean A. Irvine
 */
public class A050217 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 340;

  private boolean isSuperPoulet(final long n) {
    if (mPrime.isPrime(n)) {
      return false;
    }
    for (final Z d : Cheetah.factor(n).divisors()) {
      if (Z.ONE.equals(d)) {
        continue;
      }
      if (!Z.TWO.modPow(d, d).equals(Z.TWO)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isSuperPoulet(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
