package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007284 Horizontally symmetric numbers.
 * @author Sean A. Irvine
 */
public class A007284 extends Sequence0 {

  private static final long[] INCREMENTS = {2, 1, 2, 5};
  private Z mN = Z.valueOf(-2);
  private int mPos = 0;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(INCREMENTS[mPos]);
      if (++mPos == INCREMENTS.length) {
        mPos = 0;
      }
      if (mN.toString().matches("[0138]*")) {
        return mN;
      }
    }
  }
}
