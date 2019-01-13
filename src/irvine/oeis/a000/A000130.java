package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000130.
 * @author Sean A. Irvine
 */
public class A000130 implements Sequence {

  private Z mAa = Z.ONE;
  private Z mAb = Z.ZERO;
  private Z mBa = Z.ONE;
  private Z mBb = Z.ZERO;
  private Z mCa = Z.ZERO;
  private Z mCb = Z.TWO;
  private Z mDa = Z.ZERO;
  private Z mDb = Z.FOUR;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN < 2) {
      return Z.ZERO;
    } else if (mN == 2) {
      return Z.ONE;
    } else if (mN == 3) {
      return Z.TWO;
    }
    final Z constant = mDa.multiply(mN + 1)
      .subtract(mCa.multiply(mN - 2))
      .subtract(mBa.multiply(mN - 5))
      .add(mAa.multiply(mN - 3));
    final Z linear = mDb.multiply(mN + 1)
      .subtract(mCb.multiply(mN - 2))
      .subtract(mBb.multiply(mN - 5))
      .add(mAb.multiply(mN - 3))
      .subtract(mDa)
      .add(mCa.multiply(mN - 5))
      .add(mBa.multiply(2 * mN - 11))
      .subtract(mAa.multiply(3 * mN - 9));
    mAa = mBa;
    mBa = mCa;
    mCa = mDa;
    mDa = constant;
    mAb = mBb;
    mBb = mCb;
    mCb = mDb;
    mDb = linear;
    return linear.divide2();
  }
}
