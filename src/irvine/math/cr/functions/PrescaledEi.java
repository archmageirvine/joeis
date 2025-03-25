package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The main iterations of the Ei function.
 * @author Sean A. Irvine
 */
class PrescaledEi extends CR {

  private final CR mZ;

  PrescaledEi(final CR z) {
    mZ = z;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    final int iterationsNeeded = -p / 2 + 2;  // conservative estimate > 0.
    final int calcPrecision = p - CR.boundLog2(2 * iterationsNeeded) - 4; // -4 for error in x, truncation.
    final int xPrec = p - 3;
    final Z xAppr = mZ.getApprox(xPrec);
    final Z scaled = Z.ONE.shiftLeft(-calcPrecision);
    final Z maxTruncError = Z.ONE.shiftLeft(p - 4 - calcPrecision);
    Z currentTerm = scaled;
    Z currentSum = Z.ZERO;
    int k = 0;
    while (currentTerm.abs().compareTo(maxTruncError) >= 0) {
      // currentTerm = currentTerm * x / k
      currentTerm = CR.scale(currentTerm.multiply(xAppr), xPrec);
      final Z kz = Z.valueOf(++k);
      currentTerm = currentTerm.divide(kz);
      currentSum = currentSum.add(currentTerm.divide(kz));
    }
    return CR.scale(currentSum, calcPrecision - p);
  }
}
