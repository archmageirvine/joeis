package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a002.A002564;

/**
 * A075458 Domination number for queens' graph Q(n).
 * @author Sean A. Irvine
 */
public class A075458 extends A002564 {

  @Override
  protected boolean keepLooking(final int queens) {
    return queens < mMinQueens - 1;
  }
 
  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mMinQueens);
  }
}
