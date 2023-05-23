package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a054.A054474;

/**
 * A063887 Number of n-step walks on a square lattice starting from the origin but not returning to it at any stage.
 * @author Sean A. Irvine
 */
public class A063887 extends A054474 {

  private long mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      if (mA == null) {
        mA = super.next();
      } else {
        mA = mA.multiply(4).subtract(super.next());
      }
    } else {
      mA = mA.multiply(4);
    }
    return mA;
  }
}

