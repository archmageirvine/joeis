package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation for ln(1 + op)
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class PrescaledLn extends SlowCR {

  private final CR mOp;

  PrescaledLn(final CR x) {
    mOp = x;
  }

  // Compute an approximation of ln(1+x) to precision prec. This assumes |x| < 1/2.                    
  // It uses a Taylor series expansion.
  // Unfortunately there appears to be no way to take advantage of old information.                     
  // Note: this is known to be a bad algorithm for floating point.
  // Unfortunately, other alternatives appear to require precomputed tabular information.   
  @Override
  protected Z approximate(final int p) {
    if (p >= 0) {
      return Z.ZERO;
    }
    final int iterationsNeeded = -p;  // conservative estimate > 0.
    // Claim: each intermediate term is accurate to 2*2^calc_precision.
    // Total error is 2*iterations_needed*2^calc_precision exclusive of error in op.
    final int calcPrecision = p - boundLog2(2 * iterationsNeeded) - 4; // -4 for error in op, truncation.
    final int opPrec = p - 3;
    final Z opAppr = mOp.getApprox(opPrec);
    // Error analysis as for exponential.
    //Z scaled = big1.shiftLeft(-calcPrecision);
    final Z maxTruncError = Z.ONE.shiftLeft(p - 4 - calcPrecision);
    Z xNth = scale(opAppr, opPrec - calcPrecision);
    Z currentTerm = xNth;  // x^n
    Z currentSum = currentTerm;
    int n = 1;
    int currentSign = 1; // (-1)^(n-1)
    while (currentTerm.abs().compareTo(maxTruncError) >= 0) {
      if (Thread.interrupted() || sPleaseStop) {
        throw new AbortedError();
      }
      ++n;
      currentSign = -currentSign;
      xNth = scale(xNth.multiply(opAppr), opPrec);
      currentTerm = xNth.divide(Z.valueOf(n * currentSign));
      // x**n / (n * (-1)^(n-1))
      currentSum = currentSum.add(currentTerm);
    }
    return scale(currentSum, calcPrecision - p);
  }
}

