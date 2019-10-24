package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027139 <code>T(n,n+1) + T(n,n+2) + ... + T(n,2n)</code>, T given by <code>A027113</code>.
 * @author Sean A. Irvine
 */
public class A027139 extends A027113 {

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
