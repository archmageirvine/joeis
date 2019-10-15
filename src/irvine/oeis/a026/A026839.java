package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026839 <code>a(n) = MAX{T(n,k}</code> for <code>k=1,2,...,n</code>, T given in <code>A026836</code>.
 * @author Sean A. Irvine
 */
public class A026839 extends A026836 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      max = max.max(t(mN, k));
    }
    return max;
  }
}
