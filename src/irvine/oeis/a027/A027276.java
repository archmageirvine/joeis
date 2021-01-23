package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026552;

/**
 * A027276 a(n) = Sum_{k=0..2n} (k+1) * A026552(n, k).
 * @author Sean A. Irvine
 */
public class A027276 extends A026552 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
