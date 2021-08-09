package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049628 a(n) = Sum_{i=0..n} T(i,n-i) where T is A049627.
 * @author Sean A. Irvine
 */
public class A049628 extends A049627 {

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
