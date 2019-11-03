package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026765 <code>a(n) = Sum_{k=0..n} T(n,k)</code>, T given by <code>A026758</code>.
 * @author Sean A. Irvine
 */
public class A026765 extends A026758 {

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
