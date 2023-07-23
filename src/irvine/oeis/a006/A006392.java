package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006392 Number of planar maps with n edges and without faces of degree 1 or 2.
 * @author Sean A. Irvine
 */
public class A006392 extends A006388 {

  {
    setOffset(2);
  }

  @Override
  protected boolean reject(final int e) {
    if (super.reject(e)) {
      return true;
    }
    if (mS[1] == OPEN_PAREN && isBracketPair(2, 2 * e)) {
      return true;
    }
    for (int k = 3; k <= 2 * e; ++k) {
      if (mS[k - 2] == OPEN_BRACKET && mS[k - 1] == CLOSE_PAREN && mS[k] == CLOSE_BRACKET) {
        return true;
      }
    }
    for (int k = 1; k < 2 * e; ++k) {
      if (mS[k] == OPEN_BRACKET && mS[k + 1] == OPEN_BRACKET) {
        for (int j = k + 3; j <= 2 * e; ++j) {
          if (isBracketPair(k, j) && isBracketPair(k + 1, j - 1)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private int mN = 1;

  @Override
  public Z next() {
    planarCount(1, ++mN, 1, mN + 1, mVerbose);
    return Z.valueOf(mTotalSensed);
  }
}
