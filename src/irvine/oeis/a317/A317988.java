package irvine.oeis.a317;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A317988 Farey fraction tree, reading each fraction's numerator first, then its denominator.
 * Offset 1. Begins:
 * <pre>
 * 0/1     1/1
 *     1/2
 * 1/3     2/3
 * </pre>
 * @author Georg Fischer
 */
public class A317988 implements Sequence {

  protected long mNum;
  protected long mDen;
  protected int mState;

  /**
   * Construct the sequence
   */
  public A317988() {
    mNum = -1;
    mDen = 1;
    mState = 1;
  }

  @Override
  public Z next() {
    Z result = null;
    switch (mState) {
      case 1:
        while (result == null) {
          if (++mNum > mDen) {
            ++mDen;
            mNum = 1;
          }
          if (LongUtils.gcd(mNum, mDen) == 1) {
            result = Z.valueOf(mNum);
            mState = 2;
          }
        }
        break;
      case 2:
        result = Z.valueOf(mDen);
        mState = 1;
        break;
      default:
        break;
    }
    return result;
  }
}
