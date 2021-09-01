package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of the exponential of a constructive real.
 * Uses a Taylor series expansion.  Assumes <code>x &lt; 1/2</code>.
 * Note: this is known to be a bad algorithm for floating point.
 * Unfortunately, other alternatives appear to require precomputed 
 * information.
 * Private.  Should use Newton iteration to refine estimates.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class PrescaledExp extends CR {

  private final CR mOp;

  PrescaledExp(final CR x) {
    mOp = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    final int iterationsNeeded = -p / 2 + 2;  // conservative estimate > 0.
    //  Claim: each intermediate term is accurate to 2*2^calcPrecision.
    //  Total rounding error in series computation is
    //  2*iterations_needed*2^calcPrecision,
    //  exclusive of error in op.
    final int calcPrecision = p - boundLog2(2 * iterationsNeeded) - 4; // -4 for error in op, truncation.
    final int opPrec = p - 3;
    final Z opAppr = mOp.getApprox(opPrec);
    // Error in argument results in error of < 3/8 ulp.
    // Sum of term eval. rounding error is < 1/16 ulp.
    // Series truncation error < 1/16 ulp.
    // Final rounding error is <= 1/2 ulp.
    // Thus final error is < 1 ulp.
    final Z scaled = Z.ONE.shiftLeft(-calcPrecision);
    final Z maxTruncError = Z.ONE.shiftLeft(p - 4 - calcPrecision);
    Z currentTerm = scaled;
    Z currentSum = scaled;
    int n = 0;
    while (currentTerm.abs().compareTo(maxTruncError) >= 0) {
      ++n;
      // currentTerm = currentTerm * op / n
      currentTerm = scale(currentTerm.multiply(opAppr), opPrec);
      currentTerm = currentTerm.divide(Z.valueOf(n));
      currentSum = currentSum.add(currentTerm);
    }
    return scale(currentSum, calcPrecision - p);
  }
}

