package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006334 From the enumeration of corners.
 * @author Sean A. Irvine
 */
public class A006334 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(2 * mN + 7).multiply(2 * mN + 5).multiply(2 * mN + 3).multiply(2 * mN + 1)
      .multiply(mN).multiply(mN + 1).multiply(mN + 1).multiply(mN + 2).multiply(mN + 2)
      .multiply(mN + 3).multiply(mN + 3).multiply(mN + 4)
      .divide(1360800);
  }
}
