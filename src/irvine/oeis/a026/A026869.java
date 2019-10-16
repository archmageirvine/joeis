package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026869 <code>a(n) = T(n,m) + T(n,m+1) + ... + T(n,n), m=[ (n+1)/2 ]</code>, T given by <code>A026747</code>.
 * @author Sean A. Irvine
 */
public class A026869 extends A026747 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = (mN + 1) / 2; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
