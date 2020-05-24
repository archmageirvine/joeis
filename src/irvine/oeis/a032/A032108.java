package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032108 Number of reversible strings with n labeled beads of 3 colors.
 * @author Sean A. Irvine
 */
public class A032108 implements Sequence {

  private long mN = 0;
  private Z mA = Z.THREE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    mA = mA.multiply(mN == 2 ? 3 : 3 * mN);
    return mA;
  }
}
