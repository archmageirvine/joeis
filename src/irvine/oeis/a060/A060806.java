package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060806 Denominators of special continued fraction for 2*zeta(3).
 * @author Sean A. Irvine
 */
public class A060806 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    switch ((int) ++mN & 3) {
      case 0:
        return Z.valueOf(2 * (mN / 4 - 1) + 2);
      case 1:
        return Z.valueOf(2 * (mN / 4) + 2);
      case 2:
        return Z.valueOf(2 * (mN / 4) + 4);
      case 3:
        return Z.valueOf(2 * (mN / 4) + 3);
      default:
        throw new RuntimeException();
    }
  }
}
