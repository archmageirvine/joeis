package irvine.oeis.a197;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007540 Wilson primes: primes p such that (p-1)! == -1 (mod p^2).
 * @author Sean A. Irvine
 */
public class A197636 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z zp = Z.valueOf(mP);
      final Z mod = zp.square();
      Z f = Z.ONE;
      for (long k = 2; k < mP; ++k) {
        f = f.modMultiply(k, mod);
      }
      if (!f.equals(mod.subtract(1))) {
        return zp;
      }
    }
  }
}
