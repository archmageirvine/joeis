package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085105 Starting with prime(n) go on adding smaller primes until one gets a prime. a(n) = this prime, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A085105 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    Z sum = p;
    while (p.compareTo(Z.TWO) > 0) {
      p = mPrime.prevPrime(p);
      sum = sum.add(p);
      if (sum.isProbablePrime()) {
        return sum;
      }
    }
    return Z.ZERO;
  }
}

