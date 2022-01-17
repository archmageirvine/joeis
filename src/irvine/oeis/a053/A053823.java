package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053823 Product of primes in n-th shell of prime spiral.
 * @author Sean A. Irvine
 */
public class A053823 extends A000040 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < Math.max(1, 8 * mN); ++k) {
      prod = prod.multiply(super.next());
    }
    return prod;
  }
}

