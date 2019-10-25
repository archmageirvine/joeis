package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027168 Greatest number in row n of array T given by <code>A027157</code>.
 * @author Sean A. Irvine
 */
public class A027168 extends A027157 {

  private long mN = 0;

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
