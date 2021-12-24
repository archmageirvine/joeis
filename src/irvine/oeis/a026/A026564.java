package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026564 a(n) = Sum_{j=0..n} T(n, j), where T is given by A026552.
 * @author Sean A. Irvine
 */
public class A026564 extends A026552 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
