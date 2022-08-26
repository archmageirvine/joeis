package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A037169 a(n) = prime(n) * Product_{k=0..n-2} prime(n-k) mod prime(n-k-1).
 * @author Sean A. Irvine
 */
public class A037169 extends A000040 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = super.next();
    for (long k = 0, p = 2, q = 3; k < mN; ++k, p = q, q = mPrime.nextPrime(q)) {
      prod = prod.multiply(q % p);
    }
    return prod;
  }
}
