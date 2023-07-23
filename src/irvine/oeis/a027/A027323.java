package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026120;

/**
 * A027323 a(n) = Sum_{k=0..m} T(n,k) * T(n,k+1), where m=0 for n=1; m=n for n &gt;= 2; and T is given by A026120.
 * @author Sean A. Irvine
 */
public class A027323 extends A026120 {

  {
    setOffset(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = -1; k < mN; ++k) {
      sum = sum.add(u(mN, k).multiply(u(mN, k + 1)));
    }
    return sum;
  }
}
