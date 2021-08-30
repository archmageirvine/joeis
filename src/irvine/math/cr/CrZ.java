package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of an integer constant.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class CrZ extends CR {

  private final Z mValue;

  CrZ(final Z n) {
    mValue = n;
  }

  @Override
  protected Z approximate(final int p) {
    return scale(mValue, -p);
  }

  @Override
  public CR pow(final CR e) {
    if (mValue.isZero()) {
      if (e instanceof CrZ && ((CrZ) e).mValue.isZero()) {
        return CR.ONE;
      }
      // WARNING: if e is 0 by not CrZ this will be wrong!
      return CR.ZERO;
    }
    return super.pow(e);
  }
}

