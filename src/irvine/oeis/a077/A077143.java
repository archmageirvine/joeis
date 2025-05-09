package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077143 Floor[ product of next n primes /sum of next n primes].
 * @author Sean A. Irvine
 */
public class A077143 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      final Z p = super.next();
      sum = sum.add(p);
      prod = prod.multiply(p);
    }
    return prod.divide(sum);
  }
}

