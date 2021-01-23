package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A026819 a(n) = least k such that if 1&lt;=h&lt;=n then T(n,k)&gt;=T(n,h), T given by A008284.
 * @author Sean A. Irvine
 */
public class A026819 extends A008284 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    long maxK = 0;
    for (long k = 1; k <= mN; ++k) {
      if (get(mN, k).compareTo(max) > 0) {
        maxK = k;
        max = get(mN, k);
      }
    }
    return Z.valueOf(maxK);
  }
}
