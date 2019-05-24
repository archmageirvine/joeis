package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023043.
 * @author Sean A. Irvine
 */
public class A023043 implements Sequence {

  private long mN = -1;
  private Z mA = Z.valueOf(265);
  private Z mB = Z.valueOf(2119);

  @Override
  public Z next() {
    if (++mN == 0) {
      return mA;
    } else if (mN > 1) {
      final Z t = mB.multiply(mN + 7).subtract(mA.multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
