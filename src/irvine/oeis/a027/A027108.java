package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027108 <code>a(n) = T(n,n+1) + T(n,n+2) + ... + T(n,2n)</code>, T given by <code>A027082</code>.
 * @author Sean A. Irvine
 */
public class A027108 extends A027082 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = mN + 1; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
