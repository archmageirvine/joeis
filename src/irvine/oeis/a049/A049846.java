package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049846 a(n) = Max_{k=1..n-1} T(n,k), array T as in A049843.
 * @author Sean A. Irvine
 */
public class A049846 extends A049843 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      max = max.max(super.next());
    }
    return max;
  }
}
