package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a001.A001511;

/**
 * A059127 A hierarchical sequence (W2{3} - see A059126).
 * @author Sean A. Irvine
 */
public class A059127 extends A001511 {

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 7)) {
      case 0:
        mA = super.next().multiply(3);
        return mA.subtract(2);
      case 3:
        return mA;
      case 2:
      case 4:
      case 6:
        return mA.subtract(2);
      case 1:
      case 5:
      default:
        return mA.subtract(1);
    }
  }
}

