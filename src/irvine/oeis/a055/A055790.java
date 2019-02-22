package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A0655790.
 * @author Sean A. Irvine
 */
public class A055790 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN > 1) {
      final Z t = mB.multiply(mN).add(mA.multiply(mN - 2));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

