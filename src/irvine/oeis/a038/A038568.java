package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038568 Numerators in canonical bijection from positive integers to positive rationals.
 * Offset 0. Follow each term with its reciprocal:
 * 1/1, 1/2, 2/1, 1/3, 3/1, 2/3, 3/2, 1/4, 4/1, 3/4, 4/3
 * @author Georg Fischer
 */
public class A038568 implements Sequence {

  protected long mNum = 0;
  protected long mDen = 1;
  protected int mState;

  /**
   * Construct the sequence
   */
  public A038568() {
    mNum = 1;
    mDen = 1;
    mState = 2;
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
