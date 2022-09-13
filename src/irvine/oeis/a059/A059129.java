package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a001.A001511;

/**
 * A059129 A hierarchical sequence (W2{2}* - see A059126).
 * @author Sean A. Irvine
 */
public class A059129 extends A001511 {

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 3)) {
      case 0:
        do {
          mA = super.next();
        } while (Z.ONE.equals(mA));
        return mA.subtract(1);
      case 1:
        return mA;
      case 2:
      default:
        return mA.subtract(1);
    }
  }
}

