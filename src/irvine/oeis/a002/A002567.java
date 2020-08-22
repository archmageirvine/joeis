package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002567 Number of nonisomorphic solutions to minimal independent dominating set on queens' graph Q(n).
 * @author Sean A. Irvine
 */
public class A002567 extends A002568 {

  @Override
  protected boolean isCounted(final Z q) {
    return A002563.isCounted(q, mBoardSize);
  }
 
}
