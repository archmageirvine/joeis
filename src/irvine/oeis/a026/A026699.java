package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026699 <code>T(n,0) + T(n,1) + ... + T(n,n)</code>, T given by <code>A026692</code>.
 * @author Sean A. Irvine
 */
public class A026699 extends A026692 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
