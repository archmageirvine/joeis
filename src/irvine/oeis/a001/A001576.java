package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001576 a(n) = 1^n + 2^n + 4^n.
 * @author Sean A. Irvine
 */
public class A001576 extends Sequence0 {

  private Z mTwo = null;
  private Z mFour = Z.ONE;

  @Override
  public Z next() {
    if (mTwo == null) {
      mTwo = Z.ONE;
    } else {
      mTwo = mTwo.multiply2();
      mFour = mFour.shiftLeft(2);
    }
    return mFour.add(mTwo).add(1);
  }
}
