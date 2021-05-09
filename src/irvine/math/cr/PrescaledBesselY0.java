package irvine.math.cr;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Sum needed for computation of Bessel Y0 function.
 * Note: this is not the complete computation of Bessel Y0 (see also <code>CR</code>).
 * @author Sean A. Irvine
 */
class PrescaledBesselY0 extends CR {

  private static final int EXTRA_PRECISION = 30;

  private final CR mX;

  PrescaledBesselY0(final CR x) {
    mX = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    final int opPrec = p - EXTRA_PRECISION;
    final Z z = mX.multiply(mX).divide(CR.FOUR).getApprox(opPrec);
    Z currentTerm = z;
    Z currentSum = currentTerm;
    Q harmonic = Q.ONE;
    long k = 1;
    while (currentTerm.abs().compareTo(Z.ONE) >= 0) {
      //System.out.println("k=" + k + " " + CR.valueOf(new Q(currentSum, Z.ONE.shiftLeft(-opPrec))));
      ++k;
      harmonic = harmonic.add(new Q(1, k));
      currentTerm = scale(currentTerm.multiply(z), opPrec);
      currentTerm = currentTerm.divide(k).divide(k);
      currentSum = currentSum.signedAdd((k & 1) == 1, harmonic.multiply(currentTerm).toZ());
    }
    return scale(currentSum, -EXTRA_PRECISION);
  }
}

