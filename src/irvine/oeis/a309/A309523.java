package irvine.oeis.a309;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A309523 Start with a(1) = 1 and apply certain patterns of operations on a(n-1) to obtain a(n) as described in comments.
 * @author Georg Fischer
 */
public class A309523 implements Sequence {

  protected long mN; // current index
  protected int mState; // automaton state for flattening of while loops
  protected Z mPrev; // previous result of <code>next()</code>

  /** Construct the sequence. */
  public A309523() {
    mN = 0; // Offset1 = 1
    mState = 1; // initial
    mPrev = Z.ONE; // start with 1
  }

  @Override
  public Z next() {
    ++mN;
    Z result = null;
    switch (mState) {
      case 1:
        result = mPrev;
        ++mState;
        break;
      case 2:
        result = mPrev.add(Z.ONE).multiply(Z.THREE).add(Z.ONE);
        ++mState;
        break;
      case 3:
        result = mPrev.add(Z.ONE);
        ++mState;
        break;
      case 4:
        result = mPrev.add(Z.ONE).divide(Z.THREE).subtract(Z.ONE);
        ++mState;
        break;
      case 5:
        result = mPrev.add(Z.ONE).multiply(Z.THREE).multiply2().subtract(Z.TWO);
        ++mState;
        break;
      case 6:
        result = mPrev.add(Z.NEG_ONE).divide(Z.THREE).subtract(Z.ONE);
        ++mState;
        break;
      case 7:
        result = mPrev.add(Z.ONE);
        ++mState;
        break;
      case 8:
        result = mPrev.add(Z.ONE).multiply(Z.THREE).subtract(Z.ONE);
        ++mState;
        break;
      case 9:
        result = mPrev.add(Z.ONE).divide(Z.THREE).multiply2().subtract(Z.TWO);
        ++mState;
        break;
      case 10:
        result = mPrev.add(Z.ONE).multiply(Z.THREE).add(Z.ONE);
        mState = 3;
        break;
      default:
        break;
    } // switch mState
    mPrev = result;
    return result;
  }
}
