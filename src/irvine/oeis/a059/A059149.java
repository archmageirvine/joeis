package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a006.A006519;

/**
 * A059149 A hierarchical sequence (W'2{2}* - see A059126).
 * @author Sean A. Irvine
 */
public class A059149 extends A006519 {

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 3)) {
      case 0:
        do {
          mA = super.next();
        } while (Z.ONE.equals(mA));
        return mA.divide2();
      case 1:
        return mA;
      case 2:
      default:
        return mA.divide2();
    }
  }
}

