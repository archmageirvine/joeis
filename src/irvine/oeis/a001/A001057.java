package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001057 Canonical enumeration of integers: interleaved positive and negative integers with zero prepended.
 * @author Sean A. Irvine
 */
public class A001057 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
    } else if (mN.signum() <= 0) {
      mN = mN.subtract(1);
    }
    mN = mN.negate();
    return mN;
  }
}
