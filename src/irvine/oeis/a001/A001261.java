package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001261.
 * @author Sean A. Irvine
 */
public class A001261 implements Sequence {

  private long mN = -4;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = Z.valueOf(mN + 2).multiply(mN + 1);
      if ((mN & 1) == 0) {
        mB = mB.add(t).multiply(mN + 3);
      } else {
        mB = mB.subtract(t).multiply(mN + 3);
      }
    }
    return mB.multiply(mN).divide(120);
  }
}
