package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027098 <code>T(n,n) + T(n,n+1) + ... + T(n,2n)</code>, T given by <code>A027082</code>.
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
