package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000463.
 * @author Sean A. Irvine
 */
public class A000463 implements Sequence {

  private Z mN = Z.ZERO;
  private boolean mSquareNext = false;

  @Override
  public Z next() {
    final Z r;
    if (mSquareNext) {
      r = mN.square();
    } else {
      mN = mN.add(1);
      r = mN;
    }
    mSquareNext = !mSquareNext;
    return r;
  }
}
