package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of a number that may not have been completely
 * evaluated, but is assumed to be an integer.  Hence we never
 * evaluate beyond the decimal point.
 * 
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class AssumedInt extends CR {

  private final CR mValue;

  AssumedInt(final CR x) {
    mValue = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 0) {
      return mValue.getApprox(p);
    } else {
      return scale(mValue.getApprox(0), -p) ;
    }
  }
}
