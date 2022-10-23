package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006859 From paths in the plane.
 * @author Sean A. Irvine
 */
public class A006859 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + 2).square()
      .multiply(mN + 1)
      .multiply(mN + 3).multiply(mN + 3)
      .multiply(mN + 4)
      .multiply(2 * mN + 3)
      .multiply(2 * mN + 5)
      .multiply(2 * mN + 7)
      .divide(15120);
  }
}

