package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a001.A001097;

/**
 * A038345 Sum of the next n members of the list of twin primes.
 * @author Sean A. Irvine
 */
public class A038345 extends A001097 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
