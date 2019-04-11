package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001579 <code>a(n) = 3^n + 5^n + 6^n</code>.
 * @author Sean A. Irvine
 */
public class A001579 implements Sequence {

  private Z mThree = null;
  private Z mFive = Z.ONE;
  private Z mSix = Z.ONE;

  @Override
  public Z next() {
    if (mThree == null) {
      mThree = Z.ONE;
    } else {
      mThree = mThree.multiply(3);
      mFive = mFive.multiply(5);
      mSix = mSix.multiply(6);
    }
    return mSix.add(mFive).add(mThree);
  }
}
