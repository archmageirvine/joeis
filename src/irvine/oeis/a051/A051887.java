package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A051887 Minimal and special 2k-Germain primes, where 2k is in A002110 (primorial numbers).
 * @author Sean A. Irvine
 */
public class A051887 extends A002110 {

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
      if (p.multiply(n).add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
