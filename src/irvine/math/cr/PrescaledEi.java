package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Sum needed for computation of exponential integral.
 * Taylor series <code>sum(x^k/kk!,k=1..infty)</code>.
 * @author Sean A. Irvine
 */
class PrescaledEi extends CR {

  private final CR mX;

  PrescaledEi(final CR x) {
    mX = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    final int iterationsNeeded = -p / 2 + 2;  // conservative estimate > 0.
    //  Claim: each intermediate term is accurate
    //  to 2*2^calcPrecision.
    //  Total rounding error in series computation is
    //  2*iterations_needed*2^calcPrecision,
    //  exclusive of error in x.
    final int calcPrecision = p - boundLog2(2 * iterationsNeeded) - 4; // -4 for error in x, truncation.
    final int xPrec = p - 3;
    final Z xAppr = mX.getApprox(xPrec);
    // Error in argument results in error of < 3/8 ulp.
    // Sum of term eval. rounding error is < 1/16 ulp.
    // Series truncation error < 1/16 ulp.
    // Final rounding error is <= 1/2 ulp.
    // Thus final error is < 1 ulp.
    final Z scaled = Z.ONE.shiftLeft(-calcPrecision);
    final Z maxTruncError = Z.ONE.shiftLeft(p - 4 - calcPrecision);
    Z currentTerm = scaled;
    Z currentSum = Z.ZERO;
    int k = 0;
    while (currentTerm.abs().compareTo(maxTruncError) >= 0) {
      if (Thread.interrupted() || sPleaseStop) {
        throw new AbortedError();
      }
      // currentTerm = currentTerm * x / k
      currentTerm = scale(currentTerm.multiply(xAppr), xPrec);
      final Z kz = Z.valueOf(++k);
      currentTerm = currentTerm.divide(kz);
      currentSum = currentSum.add(currentTerm.divide(kz));
    }
    return scale(currentSum, calcPrecision - p);
  }
}

