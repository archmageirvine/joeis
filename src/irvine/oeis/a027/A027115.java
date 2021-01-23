package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027115 a(n) = T(n,0) + T(n,1) + ... + T(n,2n), T given by A027113.
 * @author Sean A. Irvine
 */
public class A027115 extends A027113 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
