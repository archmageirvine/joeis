package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026148;

/**
 * A027330 a(n) = Sum_{k=0..m} T(n,k) * T(n,k+1), where m=0 for n=1; m=n+1 for n &gt;= 2; and T is given by A026148.
 * @author Sean A. Irvine
 */
public class A027330 extends A026148 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long lim = mN < 2 ? mN : mN + 2;
    for (long k = 0; k < lim; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
