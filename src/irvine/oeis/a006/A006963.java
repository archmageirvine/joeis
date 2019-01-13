package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006963.
 * @author Sean A. Irvine
 */
public class A006963 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.multiply(mN - 2).multiply(2 * mN - 3).multiply2().divide(mN - 1);
    }
    return mA;
  }
}
