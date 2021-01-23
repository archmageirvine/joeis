package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026622 a(n) = T(n,0) + T(n,1) + ... + T(n,n), T given by A026615.
 * @author Sean A. Irvine
 */
public class A026622 extends A026615 {

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
