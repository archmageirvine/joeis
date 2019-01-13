package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of the multiplicative inverse of a constructive
 * real.  Should use Newton iteration to refine estimates.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Inverse extends CR {

  private final CR mOp;

  Inverse(final CR x) {
    mOp = x;
  }

  @Override
  protected Z approximate(final int p) {
    final int msd = mOp.msd();
    final int invMsd = 1 - msd;
    final int digitsNeeded = invMsd - p + 3;
    // Number of SIGNIFICANT digits needed for argument, excl. msd position, which may 
    // be fictitious, since msd routine can be off by 1.  Roughly 1 extra digit is     
    // needed since the relative error is the same in the argument and result, but    
    // this isn't quite the same as the number of significant digits.  Another digit   
    // is needed to compensate for slop in the calculation.
    // One further bit is required, since the final rounding introduces a 0.5 ulp
    // error.
    final int precNeeded = msd - digitsNeeded;
    final int logScaleFactor = -p - precNeeded;
    if (logScaleFactor < 0) {
      return Z.ZERO;
    }
    final Z dividend = Z.ONE.shiftLeft(logScaleFactor);
    final Z scaledDivisor = mOp.getApprox(precNeeded);
    final Z absScaledDivisor = scaledDivisor.abs();
    final Z adjDividend = dividend.add(absScaledDivisor.divide2());
    // Adjustment so that final result is rounded.
    final Z result = adjDividend.divide(absScaledDivisor);
    if (scaledDivisor.signum() < 0) {
      return result.negate();
    } else {
      return result;
    }
  }
}


