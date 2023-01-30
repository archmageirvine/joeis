package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A061254 Odd composite numbers n such that primitive part of Fibonacci(n) (see A061446) is prime.
 * @author Sean A. Irvine
 */
public class A061254 extends A061446 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((++mN & 1) == 1 && mN > 1 && !mPrime.isPrime(mN) && t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
