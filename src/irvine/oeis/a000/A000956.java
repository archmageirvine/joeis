package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000956.
 * @author Sean A. Irvine
 */
public class A000956 implements Sequence {

  private Z mOdd = null;
  private Z mEven = null;
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mOdd == null && mEven == null) {
      mOdd = Z.TWO;
      return Z.TWO;
    }
    if (mEven == null) {
      mEven = Z.valueOf(17);
      mOdd = null;
      return mEven;
    }
    if (mOdd == null) {
      mOdd = Z.valueOf(40);
      return mOdd;
    }
    if (mFirst) {
      mEven = mOdd.square().multiply(3).add(mOdd.multiply(8)).add(6);
      mOdd = mOdd.pow(3).multiply(3).add(mOdd.square().multiply(12)).add(mOdd.multiply(17)).add(8);
    }
    mFirst = !mFirst;
    return mFirst ? mOdd : mEven;
  }
}
