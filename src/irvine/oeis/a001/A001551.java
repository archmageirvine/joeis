package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001551 a(n) = 1^n + 2^n + 3^n + 4^n.
 * @author Sean A. Irvine
 */
public class A001551 implements Sequence {

  private Z mTwo = null;
  private Z mThree = Z.ONE;
  private Z mFour = Z.ONE;

  @Override
  public Z next() {
    if (mTwo == null) {
      mTwo = Z.ONE;
    } else {
      mTwo = mTwo.multiply2();
      mThree = mThree.multiply(3);
      mFour = mFour.shiftLeft(2);
    }
    return mFour.add(mThree).add(mTwo).add(1);
  }
}
