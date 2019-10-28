package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026747;

/**
 * A027228 <code>a(n) = Sum_{k=0..n} (k+1) * A026747(n, n-k)</code>.
 * @author Sean A. Irvine
 */
public class A027228 extends A026747 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, mN - k).multiply(k + 1));
    }
    return sum;
  }
}
