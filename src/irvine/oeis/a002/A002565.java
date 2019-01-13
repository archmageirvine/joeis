package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002565.
 * @author Sean A. Irvine
 */
public class A002565 extends A002566 {

  @Override
  protected boolean isCounted(final Z q) {
    return A002563.isCounted(q, mBoardSize);
  }
 
}
