package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a000.A000266;

/**
 * A027616 Number of permutations of n elements containing a 2-cycle.
 * @author Sean A. Irvine
 */
public class A027616 extends A000266 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.subtract(super.next());
  }
}
