package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026731 Greatest number in row n of array T given by <code>A026725</code>.
 * @author Sean A. Irvine
 */
public class A026731 extends A026725 {

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
