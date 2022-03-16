package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A067507 Powers of 2 with even digit sum.
 * @author Georg Fischer
 */
public class A067507 implements Sequence {

  private int mBase = 2;
  private Z mPow = Z.ONE;

  @Override
  public Z next() {
    mPow = mPow.multiply(mBase);
    while ((ZUtils.digitSum(mPow) & 1) != 0) {
      mPow = mPow.multiply(mBase);
    }
    return mPow;
  }
}
