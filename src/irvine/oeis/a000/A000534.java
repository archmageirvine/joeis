package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000534.
 * @author Sean A. Irvine
 */
public class A000534 implements Sequence {

  private static final int[] SMALL = {0, 1, 2, 3, 5, 6, 8, 9, 11, 14, 17, 24, 29, 32, 41, 56, 96, 128};

  private int mN = 0;
  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    final Z t;
    if (mN < SMALL.length) {
      t = Z.valueOf(SMALL[mN++]);
    } else {
      t = mA.shiftLeft(2);
    }
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
