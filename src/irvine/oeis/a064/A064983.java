package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064983 a(n) is the smallest prime p such that p*n! - 1 is prime.
 * @author Sean A. Irvine
 */
public class A064983 extends A000142 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z f = super.next();
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (f.multiply(p).subtract(1).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
