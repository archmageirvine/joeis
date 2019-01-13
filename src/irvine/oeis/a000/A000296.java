package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000296.
 * @author Sean A. Irvine
 */
public class A000296 extends A000110 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = super.next().subtract(mA);
    }
    return mA;
  }
}
