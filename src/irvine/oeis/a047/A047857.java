package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047857 a(n) = T(0,n) + T(1,n-1) + ... + T(n,0), array T given by A047848.
 * @author Sean A. Irvine
 */
public class A047857 extends A047848 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN - k, k));
    }
    return sum;
  }
}

