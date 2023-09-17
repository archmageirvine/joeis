package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065858 m-th composite number c(m) = A002808(m), where m is the n-th prime number: a(n) = A002808(A000040(n)).
 * @author Sean A. Irvine
 */
public class A065858 extends A002808 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (mPrime.isPrime(++mN)) {
        return c;
      }
    }
  }
}
