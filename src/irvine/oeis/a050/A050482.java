package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A050482 Sum of remainders when n-th prime is divided by all preceding integers.
 * @author Sean A. Irvine
 */
public class A050482 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    Z sum = Z.ZERO;
    for (long k = 1; k < p; ++k) {
      sum = sum.add(p % k);
    }
    return sum;
  }
}
