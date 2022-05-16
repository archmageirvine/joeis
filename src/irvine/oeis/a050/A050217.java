package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050217 Super-Poulet numbers: Poulet numbers whose divisors d all satisfy d|2^d-2.
 * @author Sean A. Irvine
 */
public class A050217 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 340;

  private boolean isSuperPoulet(final long n) {
    if (mPrime.isPrime(n)) {
      return false;
    }
    for (final Z d : Jaguar.factor(n).divisors()) {
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
