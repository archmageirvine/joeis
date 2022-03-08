package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a051.A051885;

/**
 * A055019 Numbers n such that A051885(p_n) is prime, where p_n=A000040(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A055019 extends A051885 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mPi = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mPrime.isPrime(++mN)) {
        ++mPi;
        if (t.isProbablePrime()) {
          return Z.valueOf(mPi);
        }
      }
    }
  }
}
