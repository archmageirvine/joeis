package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062170.
 * @author Sean A. Irvine
 */
public class A062170 extends A062169 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      max = max.max(super.next());
    }
    return max;
  }
}
