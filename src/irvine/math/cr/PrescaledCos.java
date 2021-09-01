package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of the cosine of a constructive real.  Private.
 * Uses a Taylor series expansion.  Assumes <code>|x| &lt; 1</code>.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class PrescaledCos extends SlowCR {

  private final CR mOp;

  PrescaledCos(final CR x) {
    mOp = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    final int iterationsNeeded = -p / 2 + 4;  // conservative estimate > 0.
    // Claim: each intermediate term is accurate to 2*2^calcPrecision.
    // Total rounding error in series computation is
    // 2*iterations_needed*2^calcPrecision,
    // exclusive of error in op.
    final int calcPrecision = p - boundLog2(2 * iterationsNeeded) - 4; // -4 for error in op, truncation.
    final int opPrec = p - 2;
    final Z opAppr = mOp.getApprox(opPrec);
    // Error in argument results in error of < 1/4 ulp.
    // Cumulative arithmetic rounding error is < 1/16 ulp.
    // Series truncation error < 1/16 ulp.
    // Final rounding error is <= 1/2 ulp.
    // Thus final error is < 1 ulp.
    final Z maxTruncError = Z.ONE.shiftLeft(p - 4 - calcPrecision);
    int n = 0;
    Z currentTerm = Z.ONE.shiftLeft(-calcPrecision);
    Z currentSum = currentTerm;
    while (currentTerm.abs().compareTo(maxTruncError) >= 0) {
      n += 2;
      // currentTerm = - currentTerm * op * op / n * (n - 1)
      currentTerm = scale(currentTerm.multiply(opAppr), opPrec);
      currentTerm = scale(currentTerm.multiply(opAppr), opPrec);
      final Z divisor = Z.valueOf(-n).multiply(Z.valueOf(n - 1));
      currentTerm = currentTerm.divide(divisor);
      currentSum = currentSum.add(currentTerm);
    }
    return scale(currentSum, calcPrecision - p);
  }
}

