package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007540 Wilson primes: primes p such that <code>(p-1)! == -1 (mod p^2)</code>.
 * @author Sean A. Irvine
 */
public class A007540 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 4;

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
      if (f.equals(mod.subtract(1))) {
        return zp;
      }
    }
  }
}
