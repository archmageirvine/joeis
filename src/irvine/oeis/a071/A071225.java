package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071225 n-th power of the product of next n primes.
 * @author Sean A. Irvine
 */
public class A071225 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(super.next());
    }
    return prod.pow(mN);
  }
}
