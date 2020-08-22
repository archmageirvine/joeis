package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026082;

/**
 * A027316 a(n) = Sum_{k=0..m-1} T(n,k) * T(n,k+1), where m=n for n=0,1,2,3; m=2n for n &gt;= 4; and T is given by A026082.
 * @author Sean A. Irvine
 */
public class A027316 extends A026082 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
