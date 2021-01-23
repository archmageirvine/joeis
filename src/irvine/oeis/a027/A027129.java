package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027129 a(n) = T(n,n) + T(n,n+1) + ... + T(n,2n), T given by A027113.
 * @author Sean A. Irvine
 */
public class A027129 extends A027113 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2 * mN; k >= mN; --k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
