package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Arithmetic geometric mean.
 * @author Sean A. Irvine
 */
class Agm extends CR {

  private final CR mA;
  private final CR mG;

  Agm(final CR x, final CR y) {
    if (x == null || y == null) {
      throw new NullPointerException();
    }
    mA = x;
    mG = y;
  }

  @Override
  protected Z approximate(final int p) {
    final Z x = mA.getApprox(p);
    if (x.isZero() || x.equals(mG.getApprox(p))) {
      return x;
    }
    return scale(new Agm(mA.add(mG).multiply(CR.HALF), mA.multiply(mG).sqrt()).approximate(p - 2), -2);
  }
}

