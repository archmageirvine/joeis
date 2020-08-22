package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026755 a(n) = Sum_{k=0..floor(n/2)} T(n,k), T given by A026747.
 * @author Sean A. Irvine
 */
public class A026755 extends A026747 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
