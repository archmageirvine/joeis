package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000153.
 * @author Sean A. Irvine
 */
public class A000153 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN == 1) {
      return Z.ONE;
    }
    final Z t = mB.multiply(mN).add(mA.multiply(mN - 2));
    mA = mB;
    mB = t;
    return t;
  }
}

