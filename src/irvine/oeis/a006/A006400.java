package irvine.oeis.a006;

/**
 * A006400 Number of connected planar maps without vertices of degree 1.
 * @author Sean A. Irvine
 */
public class A006400 extends A006394 {

  /** Construct the sequence. */
  public A006400() {
    next();
  }

  protected boolean isParenthesisPair(final int start, final int end) {
    return isPair(start, end, OPEN_PAREN, CLOSE_PAREN);
  }

  @Override
  protected boolean reject(final int e) {
    // Reject anything containing an adjacent pair of brackets or parentheses
    for (int k = 1; k <= 2 * e; ++k) {
      if (mS[k - 1] == OPEN_PAREN && mS[k] == CLOSE_PAREN) {
        return true;
      }
    }
    return isParenthesisPair(1, 2 * e);
  }
}
