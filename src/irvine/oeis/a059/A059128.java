package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059128 A hierarchical sequence (W3{2,2} - see A059126).
 * @author Sean A. Irvine
 */
public class A059128 extends A059126 {

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

