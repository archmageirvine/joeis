package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015889 Numbers n such that n | 4^n + 4.
 * @author Georg Fischer
 */
public class A015889 implements Sequence {

  protected Z mK; // Number k such that ...
  protected Z[] mList; // list of constants to be exponentiated
  protected Z[] mPows; // list[i]^mN
  protected Z mConst; // starting value of the sum
  protected int mLen; // length of mPows, mList

  /**
   * Construct the sequence
   */
  public A015889() {
    this(4, 4);
  }

  /**
   * Constructor with parameters
   *
   * @param exp exponent
   */
  public A015889(final int... list) {
    mConst = Z.valueOf(list[0]);
    mLen = list.length - 1;
    mList = new Z[mLen];
    mPows = new Z[mLen];
    for (int i = 0; i < mLen; ++i) {
      mList[i] = Z.valueOf(list[i + 1]);
      mPows[i] = Z.ONE;
    }
    mK = Z.ZERO;
  }

//  public Z next2() {
//    while (true) {
//      mK = mK.add(1);
//      Z sum = mConst;
//      for (int i = 0; i < mLen; ++i) {
//        mPows[i] = mPows[i].multiply(mList[i]);
//        sum = sum.add(mPows[i]);
//      }
//      if (sum.mod(mK).isZero()) {
//        return mK;
//      }
//    }
//  }

  @Override
  public Z next() {
    while (true) {
/*
      mN = mN.add(1);
      if (Z.TEN.modPow(mN, mN).add(Z.NINE.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
*/
      mK = mK.add(1);
      Z sum = mConst;
      for (int i = 0; i < mLen; ++i) {
        sum = sum.add(mList[i].modPow(mK, mK));
      }
      if (sum.mod(mK).isZero()) {
        return mK;
      }
    }
  }
}
