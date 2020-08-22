package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026769;

/**
 * A027238 Greatest number in row n of array T given by A026769.
 * @author Sean A. Irvine
 */
public class A027238 extends A026769 {

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
