package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061216 a(n) = product of all even numbers between n-th prime and (n+1)-st prime.
 * @author Sean A. Irvine
 */
public class A061216 extends A000040 {

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final long p = super.next().longValueExact();
    final long q = mPrime.nextPrime(p);
    for (long k = (p | 1) + 1; k < q; k += 2) {
      prod = prod.multiply(k);
    }
    return prod;
  }
}
