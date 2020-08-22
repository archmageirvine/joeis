package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027977 a(n) = greatest number in row n of array T given by A027960.
 * @author Sean A. Irvine
 */
public class A027977 extends A027960 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (long m = 1; m < 2 * mN; ++m) {
      max = max.max(get(mN, m));
    }
    return max;
  }
}
