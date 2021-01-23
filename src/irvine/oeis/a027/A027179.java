package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027179 a(n) = T(n,0) + T(n,1) + ... + (T(n,[ n/2 ]), T given by A027170.
 * @author Sean A. Irvine
 */
public class A027179 extends A027170 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
