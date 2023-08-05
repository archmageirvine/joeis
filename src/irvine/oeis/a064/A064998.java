package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064998 a(n) is the smallest prime p such that p*n! +- 1 are twin primes.
 * @author Sean A. Irvine
 */
public class A064998 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    setOffset(2);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z f = super.next();
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z fp = p.multiply(f);
      if (fp.add(1).isProbablePrime() && fp.subtract(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
