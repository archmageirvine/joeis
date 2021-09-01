package irvine.math.cr;

import irvine.math.z.Z;

/**
 * The constructive real <code>atan(1/n)</code>, where n is a small integer &gt; base.
 * This gives a simple and moderately fast way to compute pi.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class IntegralAtan extends SlowCR {

  private final int mOp;

  IntegralAtan(final int x) {
    mOp = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    final int iterationsNeeded = -p / 2 + 2;  // conservative estimate > 0.
    //  Claim: each intermediate term is accurate to 2*base^calc_precision.
    //  Total rounding error in series computation is
    //  2*iterations_needed*base^calc_precision,
    //  exclusive of error in op.
    final int calcPrecision = p - boundLog2(2 * iterationsNeeded) - 2; // -2 for error in op, truncation.
    // Error in argument results in error of < 3/8 ulp.
    // Cumulative arithmetic rounding error is < 1/4 ulp.
    // Series truncation error < 1/4 ulp.
    // Final rounding error is <= 1/2 ulp.
    // Thus final error is < 1 ulp.
    final Z scaled = Z.ONE.shiftLeft(-calcPrecision);
    final Z bigOp = Z.valueOf(mOp);
    final Z bigOpSquared = bigOp.square();
    final Z opInverse = scaled.divide(bigOp);
    final Z maxTruncRrror = Z.ONE.shiftLeft(p - 2 - calcPrecision);
    Z currentPower = opInverse;
    Z currentTerm = opInverse;
    Z currentSum = opInverse;
    int currentSign = 1;
    int n = 1;
    while (currentTerm.abs().compareTo(maxTruncRrror) >= 0) {
      n += 2;
      currentPower = currentPower.divide(bigOpSquared);
      currentSign = -currentSign;
      currentTerm = currentPower.divide(Z.valueOf(currentSign * n));
      currentSum = currentSum.add(currentTerm);
    }
    return scale(currentSum, calcPrecision - p);
  }
}

