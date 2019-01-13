package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Square root.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Sqrt extends CR {

  private final CR mOp;

  Sqrt(final CR x) {
    mOp = x;
  }

  // Conservative estimate of number of significant bits in double precision computation.
  private static final int FP_REC = 50; 
  private static final int FP_OP_PREC = 60;

  @Override
  protected Z approximate(final int p) {
    final int maxPrecNeeded = 2 * p - 1;
    final int msd = mOp.msd(maxPrecNeeded);
    if (msd <= maxPrecNeeded) {
      return Z.ZERO; 
    }
    final int resultMsd = msd / 2;   // +- 1
    final int resultDigits = resultMsd - p;  // +- 2
    if (resultDigits > FP_REC) {
      // Compute less precise approximation and use a Newton iter.
      final int apprDigits = resultDigits / 2 + 6;
      // This should be conservative.  Is fewer enough?
      final int apprPrec = resultMsd - apprDigits;
      final Z lastAppr = getApprox(apprPrec);
      final int prodPrec = 2 * apprPrec;
      final Z opAppr = mOp.getApprox(prodPrec);
      // Slightly fewer might be enough;
      // Compute (last_appr * last_appr + op_appr)/(last_appr/2)
      // while adjusting the scaling to make everything work
      final Z prodPrecScaledNumerator = lastAppr.multiply(lastAppr).add(opAppr);
      final Z scaledNumerator = scale(prodPrecScaledNumerator, apprPrec - p);
      final Z shiftedResult = scaledNumerator.divide(lastAppr);
      return shiftedResult.add(Z.ONE).divide2();
    } else {
      // Use a double precision floating point approximation.
      // Make sure all precisions are even
      final int opPrec = (msd - FP_OP_PREC) & ~1;
      final int workingPrec = opPrec - FP_OP_PREC;
      final Z scaledBiAppr = mOp.getApprox(opPrec).shiftLeft(FP_OP_PREC);
      final double scaledAppr = scaledBiAppr.doubleValue();
      if (scaledAppr < 0) {
        throw new ArithmeticException();
      }
      final double scaledFpSqrt = Math.sqrt(scaledAppr);
      final Z scaledSqrt = Z.valueOf((long) scaledFpSqrt);
      final int shiftCount = workingPrec / 2 - p;
      return scaledSqrt.shiftLeft(shiftCount);
    }
  }
}
