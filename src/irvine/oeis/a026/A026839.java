package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026839 a(n) = MAX{T(n,k) for k=1,2,...,n}, T given in A026836.
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
