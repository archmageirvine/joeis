package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027008 a(n) = greatest number in row n of array T given by A026998.
 * @author Sean A. Irvine
 */
public class A027008 extends A027960 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      max = max.max(get(mN, 2 * k));
    }
    return max;
  }
}
