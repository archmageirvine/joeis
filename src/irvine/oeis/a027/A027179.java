package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027179 <code>a(n) = T(n,0) + T(n,1) + ... + (T(n,[ n/2 ])</code>, T given by <code>A027170</code>.
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
