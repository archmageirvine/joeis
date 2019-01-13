package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of a CR multiplied by <code>2^n</code>.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Shift extends CR {

  private final CR mOp;
  private final int mCount;

  Shift(final CR x, final int n) {
    mOp = x;
    mCount = n;
  }

  @Override
  protected Z approximate(final int p) {
    return mOp.getApprox(p - mCount);
  }
}


