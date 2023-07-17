package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006388 Number of planar maps with n edges and without faces of degree 1.
 * @author Sean A. Irvine
 */
public class A006388 extends A006385 {

  /** Construct the sequence. */
  public A006388() {
    super(1);
  }

  protected boolean isBracketPair(final int start, final int end) {
    return isPair(start, end, OPEN_BRACKET, CLOSE_BRACKET);
  }

  @Override
  protected boolean reject(final int e) {
    // Reject anything containing an adjacent pair of brackets
    for (int k = 2; k <= 2 * e; ++k) {
      if (mS[k - 1] == OPEN_BRACKET && mS[k] == CLOSE_BRACKET) {
        return true;
      }
    }
    return isBracketPair(1, 2 * e);
  }

  @Override
  public Z next() {
    planarCount(1, ++mN + 1, 1, mN + 2, mVerbose);
    return Z.valueOf(mTotalSensed);
  }
}
