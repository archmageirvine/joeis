package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a049.A049037;

/**
 * A063888 Number of n-step walks on a cube lattice starting from the origin but not returning to it at any stage.
 * @author Sean A. Irvine
 */
public class A063888 extends A049037 {

  private long mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      if (mA == null) {
        mA = super.next();
      } else {
        mA = mA.multiply(6).subtract(super.next());
      }
    } else {
      mA = mA.multiply(6);
    }
    return mA;
  }
}
