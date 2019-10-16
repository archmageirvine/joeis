package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026847 <code>a(n) = T(n,m) + T(n,m+1) + ... + T(n,n)</code>, where <code>m=[ (n+1)/2 ]</code>, T given by <code>A026725</code>.
 * @author Sean A. Irvine
 */
public class A026847 extends A026725 {

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
