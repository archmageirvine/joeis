package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of the sum of two constructive reals.  Private.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Add extends CR {

  private final CR mOp1;
  private final CR mOp2;

  Add(final CR x, final CR y) {
    if (x == null || y == null) {
      throw new NullPointerException();
    }
    mOp1 = x;
    mOp2 = y;
  }

  @Override
  protected Z approximate(final int p) {
    // Args need to be evaluated so that each error is < 1/4 ulp.
    // Rounding error from the scale call is <= 1/2 ulp, so that
    // final error is < 1 ulp.
    return scale(mOp1.getApprox(p - 2).add(mOp2.getApprox(p - 2)), -2);
  }
}

