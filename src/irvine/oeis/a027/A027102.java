package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027102 a(n) = greatest number in row n of array T given by A027082.
 * @author Sean A. Irvine
 */
public class A027102 extends A027082 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      max = max.max(get(mN, k));
    }
    return max;
  }
}
