package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027045 <code>a(n) = T(n,n+1) + T(n,n+2) + ... + T(n,2n)</code>, T given by <code>A027023</code>.
 * @author Sean A. Irvine
 */
public class A027045 extends A027023 {

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
