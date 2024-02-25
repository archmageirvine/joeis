package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A002997 Carmichael numbers: composite numbers k such that a^(k-1) == 1 (mod k) for every a coprime to k.
 * @author Sean A. Irvine
 */
public class A002997 extends A002322 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final Z lambda = super.next();
      if (mN % lambda.longValueExact() == 1 && !mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
