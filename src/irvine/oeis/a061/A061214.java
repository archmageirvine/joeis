package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061214 Product of composite numbers between the n-th and (n+1)st primes.
 * @author Sean A. Irvine
 */
public class A061214 extends A000040 {

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (long k = super.next().longValueExact() + 1; !mPrime.isPrime(k); ++k) {
      prod = prod.multiply(k);
    }
    return prod;
  }
}
