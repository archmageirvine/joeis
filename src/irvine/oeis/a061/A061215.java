package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061215 a(n)= product of all odd composite numbers between n-th prime and (n+1)-st prime.
 * @author Sean A. Irvine
 */
public class A061215 extends A000040 {

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (long k = (super.next().longValueExact() | 1) + 2; !mPrime.isPrime(k); k += 2) {
      prod = prod.multiply(k);
    }
    return prod;
  }
}
