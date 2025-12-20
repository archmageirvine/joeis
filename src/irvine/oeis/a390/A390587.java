package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390587 allocated for Gilligan Brobert.
 * @author Sean A. Irvine
 */
public class A390587 extends A000040 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = super.next();
        return mA;
      }
      mB = super.next();
      return mB;
    }
    final long t = mB.subtract(mA).longValueExact();
    for (long k = 0; k < t; ++k) {
      super.next();
    }
    mA = mB;
    mB = super.next();
    return mB;
  }
}
