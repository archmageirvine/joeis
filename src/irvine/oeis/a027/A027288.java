package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026009;

/**
 * A027288 a(n) = Sum_{k=0..floor(n/2)} T(n,k) * T(n,k+1), with T given by A026009.
 * @author Sean A. Irvine
 */
public class A027288 extends A026009 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 1)));
    }
    return sum;
  }
}
