package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026743 <code>a(n) = Sum_{j=0..n} T(n,j)</code>, T given by <code>A026736</code>.
 * @author Sean A. Irvine
 */
public class A026743 extends A026736 {

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
