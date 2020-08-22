package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026009;

/**
 * A027291 a(n) = Sum_{k=0..floor(n/2)+1} (k+1) * A026009(n, k).
 * @author Sean A. Irvine
 */
public class A027291 extends A026009 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2 + 1; ++k) {
      sum = sum.add(t(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
