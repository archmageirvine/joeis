package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027098 T(n,n) + T(n,n+1) + ... + T(n,2n), T given by A027082.
 * @author Sean A. Irvine
 */
public class A027098 extends A027082 {

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
