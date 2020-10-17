package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308709 Start with 3, divide by 3, multiply by 2, multiply by 3, multiply by 2, repeat.
 * @author Georg Fischer
 */
public class A308709 implements Sequence {

  protected long mN; // current index
  protected int mState; // automaton state for flattening of while loops
  protected Z mPrev; // previous result of <code>next()</code>

  /** Construct the sequence. */
  public A308709() {
    mN = 0; // Offset1 = 1
    mState = 0; // initial
    mPrev = Z.THREE;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = null;
    switch (mState) {
      case 0:
        result = mPrev;
        ++mState;
        break;
      case 1:
        result = mPrev.divide(Z.THREE);
        ++mState;
        break;
      case 2:
        result = mPrev.multiply2();
        ++mState;
        break;
      case 3:
        result = mPrev.multiply(Z.THREE);
        ++mState;
        break;
      case 4:
        result = mPrev.multiply2();
        mState = 1;
        break;
      default:
        break;
    } // switch mState
    mPrev = result;
    return result;
  }
}
