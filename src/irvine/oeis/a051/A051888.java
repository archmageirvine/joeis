package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A051888 a(n) is the smallest prime p such that p*n! + 1 is prime.
 * @author Sean A. Irvine
 */
public class A051888 extends A000142 {

  private final Fast mPrime = new Fast();

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
