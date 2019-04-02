package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a037.A037254;

/**
 * A005254 Number of weighted voting procedures.
 * @author Sean A. Irvine
 */
public class A005254 extends A037254 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}

