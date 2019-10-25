package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027155 Greatest number in row n of array T given by <code>A027144</code>.
 * @author Sean A. Irvine
 */
public class A027155 extends A027144 {

  private long mN = 0;

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
