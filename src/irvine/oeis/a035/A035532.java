package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A035532 a(n) = 2*phi(n) if n composite, or 2*phi(n) - (A000120(n)-1) if n prime, where phi = A000010, Euler's totient function, and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A035532 extends A000010 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN == 1) {
      return Z.ONE;
    }
    return t.multiply2().subtract(mPrime.isPrime(mN) ? Long.bitCount(mN) - 1 : 0);
  }
}

