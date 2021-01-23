package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026148;

/**
 * A027331 a(n) = Sum_{k=0..m} T(n,k) * T(n,k+2), where m=2 for n=2 and m=n+1 for n &gt;= 3; and T is given by A026148.
 * @author Sean A. Irvine
 */
public class A027331 extends A026148 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 2)));
    }
    return sum;
  }
}
