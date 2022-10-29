package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A060162 Triangle T(n,m) with T(n,m)=T(n-1,|m-1|)+T(n-1,m)+T(n-1,m+1)-2T(n-2,m) and T(0,0)=1.
 * @author Sean A. Irvine
 */
public class A060162 extends Triangle {

  @Override
  protected Z compute(final int n, final int m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    return get(n - 1, Math.abs(m - 1)).add(get(n - 1, m)).add(get(n - 1, m + 1)).subtract(get(n - 2, m).multiply2());
  }
}

