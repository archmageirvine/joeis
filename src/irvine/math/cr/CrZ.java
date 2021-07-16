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
}

