package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001112 A continued fraction.
 * @author Sean A. Irvine
 */
public class A001112 extends Sequence0 {

  private static final long[] CF = {1, 2, 1, 2, 12, 2, 1, 2, 1, 24};

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private int mPos = -3;

  @Override
  public Z next() {
    if (++mPos == -2) {
      return Z.ZERO;
    }
    if (mPos == -1) {
      return Z.ONE;
    }
    mPos %= CF.length;
    final Z t = mB.multiply(CF[mPos]).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

