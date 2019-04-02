package irvine.oeis.a006;

/**
 * A006396 Number of planar maps with n edges and without faces or vertices of degree 1.
 * @author Sean A. Irvine
 */
public class A006396 extends A006388 {

  /** Construct the sequence. */
  public A006396() {
    next();
  }

  protected boolean isParenthesisPair(final int start, final int end) {
    return isPair(start, end, OPEN_PAREN, CLOSE_PAREN);
  }

  @Override
  protected boolean reject(final int e) {
    // Reject anything containing an adjacent pair of brackets or parentheses
    for (int k = 1; k <= 2 * e; ++k) {
      if (mS[k - 1] == OPEN_BRACKET && mS[k] == CLOSE_BRACKET) {
        return true;
      }
      if (mS[k - 1] == OPEN_PAREN && mS[k] == CLOSE_PAREN) {
        return true;
      }
    }
    return isBracketPair(1, 2 * e) || isParenthesisPair(1, 2 * e);
  }
}
