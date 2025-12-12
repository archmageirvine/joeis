package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082533 Number of primes p such that p can be expressed as the sum of consecutive primes with largest prime in the sum = n-th prime.
 * @author Sean A. Irvine
 */
public class A082533 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    Z sum = p;
    long cnt = 1;
    while (p.compareTo(Z.TWO) > 0) {
      p = mPrime.prevPrime(p);
      sum = sum.add(p);
      if (sum.isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
