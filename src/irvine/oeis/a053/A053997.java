package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053997 Sum of primes in n-th shell of prime spiral.
 * @author Sean A. Irvine
 */
public class A053997 extends A000040 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < Math.max(1, 8 * mN); ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}

