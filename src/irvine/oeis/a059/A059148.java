package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059148 A hierarchical sequence (W'3{2,2} - see A059126).
 * @author Sean A. Irvine
 */
public class A059148 extends A059146 {

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    switch ((int) (++mN % 3)) {
      case 0:
        mA = super.next().square();
        return mA;
      case 1:
        return mA.multiply2();
      case 2:
      default:
        return mA;
    }
  }
}

