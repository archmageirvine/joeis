package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a001.A001511;

/**
 * A059126 A hierarchical sequence (W2{2} according to the description in the attached file - see link).
 * @author Sean A. Irvine
 */
public class A059126 extends A001511 {

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 3)) {
      case 0:
        mA = super.next().multiply2();
        return mA.subtract(1);
      case 1:
        return mA;
      case 2:
      default:
        return mA.subtract(1);
    }
  }
}

