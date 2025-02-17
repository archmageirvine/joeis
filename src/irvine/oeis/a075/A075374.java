package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075374 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = mB.multiply(++mN).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
