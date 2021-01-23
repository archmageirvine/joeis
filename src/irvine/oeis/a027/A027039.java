package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027039 a(n) = greatest number in row n of array T given by A027023.
 * @author Sean A. Irvine
 */
public class A027039 extends A027023 {

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
