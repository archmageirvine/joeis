package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006185 Number of pair-coverings with largest block size 3.
 * @author Sean A. Irvine
 */
public class A006185 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    switch ((int) (++mN % 6)) {
      case 0:
      case 2:
        return Z.valueOf(mN).multiply(mN + 1).divide(6);
      case 1:
      case 3:
        return Z.valueOf(mN).multiply(mN - 1).divide(6);
      case 4:
        return Z.valueOf(mN).square().add(mN).add(4).divide(6);
      default: // 5
        return Z.valueOf(mN).square().subtract(mN).add(16).divide(6);
    }
  }
}

