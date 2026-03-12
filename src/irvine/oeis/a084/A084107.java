package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084107 A014486-encoding of "Complete Binary Trees".
 * @author Sean A. Irvine
 */
public class A084107 extends Sequence0 {

  private int mN = -1;
  private Z mCode = null;

  private void inOrder(final int depth) {
    if (depth == mN) {
      return;
    }
    mCode = mCode.multiply2().add(1);
    inOrder(depth + 1);
    mCode = mCode.multiply2();
    inOrder(depth + 1);
  }

  @Override
  public Z next() {
    mCode = Z.ZERO;
    if (++mN > 0) {
      inOrder(0);
    }
    return mCode;
  }
}
