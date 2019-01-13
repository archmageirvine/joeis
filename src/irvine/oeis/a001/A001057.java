package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001057.
 * @author Sean A. Irvine
 */
public class A001057 implements Sequence {

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
