package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032107 Number of reversible strings with n labeled beads of 2 colors.
 * @author Sean A. Irvine
 */
public class A032107 implements Sequence {

  private int mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    mA = mA.multiply(mN).multiply2();
    return mA;
  }
}
