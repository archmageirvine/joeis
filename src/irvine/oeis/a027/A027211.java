package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026725;

/**
 * A027211 a(n) = Sum_{k=0..n} (k+1) * A026725(n, k).
 * @author Sean A. Irvine
 */
public class A027211 extends A026725 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
