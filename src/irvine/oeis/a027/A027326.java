package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026120;

/**
 * A027326 a(n) = Sum_{k=0..m} (k+1) * A026120(n, k), where m=0 for n=0,1; m=n for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A027326 extends A026120 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = -1; k <= mN; ++k) {
      sum = sum.add(u(mN, k).multiply(k + 2));
    }
    return sum;
  }
}
