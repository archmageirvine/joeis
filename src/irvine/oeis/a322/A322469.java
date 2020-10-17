package irvine.oeis.a322;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A322469 Irregular table: row i = 1, 2, 3, ... starts with <code>4*i - 1</code>; then, as long as the number is divisible by 3, the next two terms are the result of dividing it by 3, then multiplying it by 2.
 *
 * @author Georg Fischer
 */
public class A322469 implements Sequence {

  protected long mN; // current index
  protected long mRow; // current row number
  protected int mState; // automaton state for flattening of while loops
  protected Z mPrev; // previous result of <code>next()</code>

  /**
   * Construct the sequence.
   */
  public A322469() {
    mN = 0;
    mRow = 0;
    mState = 4; // initial, 4*i-1
    mPrev = Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = null;
    switch (mState) {
      case 4:
        ++mRow;
        result = Z.valueOf(mRow).shiftLeft(2).subtract(Z.ONE); // * 4 - 1
        mState = 3;
        break;
      case 3:
        if (mPrev.remainder(Z.THREE).equals(Z.ZERO)) {
          result = mPrev.divide(Z.THREE); // / 3
          mState = 2;
        } else {
          ++mRow;
          result = Z.valueOf(mRow).shiftLeft(2).subtract(Z.ONE); // * 4 - 1
          mState = 3;
        }
        break;
      case 2:
        result = mPrev.shiftLeft(1); // * 2
        mState = 3;
        break;
      default:
        break;
    } // switch mState
    mPrev = result;
    return result;
  }
}
