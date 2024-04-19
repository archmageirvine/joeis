package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a266.A266279;

/**
 * A082810 Palindromes in which every digit occurs with equal frequency.
 * @author Georg Fischer
 */
public class A082810 extends A266279 {

  protected int mN;
  private int mState;
  private Z mAdd1;
  private Z mTerm;
  private int mLen;
  private StringBuilder mLeft;

  /** Construct the sequence. */
  public A082810() {
    super.next(); // skip 0 of A266279
    mLeft = new StringBuilder(super.next().toString());
    mN = 0;
    mState = 1;
    mAdd1 = Z.ONE;
    mLen = 1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 9) {
      return Z.valueOf(mN);
    }
    if (mState == 1) {
      if (mLeft.length() == mLen) {
        mTerm = new Z(mLeft.toString() + mLeft.reverse());
        mLeft = new StringBuilder(super.next().toString());
      } else {
        mState = 2;
        mAdd1 = mAdd1.multiply(100).add(11);
        mTerm = mAdd1;
      }
    } else if (mState == 2) {
      mTerm = mTerm.add(mAdd1);
      if (mTerm.mod(10) == 9) {
        mState = 1;
        ++mLen;
      }
    }
    return mTerm;
  }
}
