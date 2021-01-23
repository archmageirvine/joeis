package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026780;

/**
 * A027246 a(n) = greatest number in row n of array T given by A026780.
 * @author Sean A. Irvine
 */
public class A027246 extends A026780 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      max = max.max(get(mN, k));
    }
    return max;
  }
}
