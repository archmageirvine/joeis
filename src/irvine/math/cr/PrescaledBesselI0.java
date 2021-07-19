package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Sum needed for computation of Bessel <code>I0</code> function.
 * Series <code>sum(((x/2)^2)^k/(k!)^2,k=0..infty)</code>.
 * @author Sean A. Irvine
 */
class PrescaledBesselI0 extends CR {

  private static final int EXTRA_PRECISION = 3;

  private final CR mX;

  PrescaledBesselI0(final CR x) {
    mX = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    final int opPrec = p - EXTRA_PRECISION;
    final Z x2Appr = mX.multiply(mX).divide(CR.FOUR).getApprox(opPrec);
    Z currentTerm = CR.ONE.getApprox(opPrec); // k = 0
    Z currentSum = currentTerm;
    long k = 0;
    while (currentTerm.abs().compareTo(Z.ONE) >= 0) {
      ++k;
      currentTerm = scale(currentTerm.multiply(x2Appr), opPrec);
      currentTerm = currentTerm.divide(k).divide(k);
      currentSum = currentSum.add(currentTerm);
    }
    return scale(currentSum, -EXTRA_PRECISION);
  }
}

