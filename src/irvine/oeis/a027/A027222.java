package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026747;

/**
 * A027222 <code>a(n) =</code> greatest number in row n of array T given by <code>A026747</code>.
 * @author Sean A. Irvine
 */
public class A027222 extends A026747 {

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
