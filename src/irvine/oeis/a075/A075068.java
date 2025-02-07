package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075068 Product of prime(n) primes starting from prime(n).
 * @author Sean A. Irvine
 */
public class A075068 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z prod = p;
    Z q = p;
    for (Z k = Z.ONE; k.compareTo(p) < 0; k = k.add(1)) {
      q = mPrime.nextPrime(q);
      prod = prod.multiply(q);
    }
    return prod;
  }
}

