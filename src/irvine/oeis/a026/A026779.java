package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026779 <code>a(n) = Sum_{k=0..floor(n/2)} T(n-k,k)</code>, T given by <code>A026769</code>.
 * @author Sean A. Irvine
 */
public class A026779 extends A026769 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(mN - k, k));
    }
    return sum;
  }
}
