package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027020 <code>a(n) =</code> greatest number in row n of array T given by <code>A027011</code>.
 * @author Sean A. Irvine
 */
public class A027020 extends A027011 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z max = Z.ZERO;
    for (long k = 0; k <= (2 * mN - 1) / 2; ++k) {
      max = max.max(t(mN, k));
    }
    return max;
  }
}
