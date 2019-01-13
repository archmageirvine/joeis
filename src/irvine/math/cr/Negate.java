package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of the negation of a constructive real.  Private.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Negate extends CR {

  private final CR mOp;

  Negate(final CR x) {
    mOp = x;
  }

  @Override
  protected Z approximate(final int p) {
    return mOp.getApprox(p).negate();
  }
}

