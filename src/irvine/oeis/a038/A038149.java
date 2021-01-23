package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a037.A037027;

/**
 * A038149 a(n) = max T(n,k), with T as in A037027.
 * @author Sean A. Irvine
 */
public class A038149 extends A037027 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      max = max.max(t(mN, k));
    }
    return max;
  }
}
