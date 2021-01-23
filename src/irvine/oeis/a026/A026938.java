package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026938 Greatest number in row of n array T given by A026300.
 * @author Sean A. Irvine
 */
public class A026938 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      max = max.max(t(mN, k));
    }
    return max;
  }
}
