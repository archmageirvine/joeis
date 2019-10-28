package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026009;

/**
 * A027289 <code>a(n) = Sum_{k=0..floor(n/2)-1} T(n,k) * T(n,k+2)</code>, with T given by <code>A026009</code>.
 * @author Sean A. Irvine
 */
public class A027289 extends A026009 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN / 2; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 2)));
    }
    return sum;
  }
}
