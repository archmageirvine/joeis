package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A051902 Minimal primorial safe primes: p and primorial*p + 1 are both primes.
 * @author Sean A. Irvine
 */
public class A051902 extends A002110 {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
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
