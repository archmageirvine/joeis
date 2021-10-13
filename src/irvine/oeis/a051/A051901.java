package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A051901 Minimal factorial safe-primes: a prime p = a(n) here if (p-1)/n! = A051888(n).
 * @author Sean A. Irvine
 */
public class A051901 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z q = p.multiply(n).add(1);
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}
