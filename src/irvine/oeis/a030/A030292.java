package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030292 Numbers k such that k^3 has at most two different digits.
 * @author Sean A. Irvine
 */
public class A030292 implements Sequence {

  private static final long[] SMALL = {0, 1, 2, 3, 4, 7, 10, 11, 20};
  private int mN = 0;
  private Z mA = Z.TEN;
  private boolean mT = true;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    mT = !mT;
    if (mT) {
      return mA.multiply2();
    }
    mA = mA.multiply(10);
    return mA;
  }
}
