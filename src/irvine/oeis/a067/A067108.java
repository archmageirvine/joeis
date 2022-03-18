package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A067108 a(n) = a number with 2n digits with first n digits odd and the rest even, in cyclic increasing order.
 * @author Georg Fischer
 */
public class A067108 implements Sequence {

  private final int[] mOdds = {1, 3, 5, 7, 9};
  private final int[] mEves = {2, 4, 6, 8, 0};
  private Z mO = Z.ZERO;
  private Z mE = Z.ZERO;
  private Z mPow10 = Z.ONE;
  private int mPos = 0;

  @Override
  public Z next() {
    mPow10 = mPow10.multiply(10);
    mO = mO.multiply(10).add(mOdds[mPos]);
    mE = mE.multiply(10).add(mEves[mPos++]);
    mPos %= 5;
    return mO.multiply(mPow10).add(mE);
  }
}
