package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Sum needed for computation of error function <code>erf</code>.
 * Series <code>sum((-1)^k*x^(2*k+1)/(2k+1)k!,k=0..infty)</code>.
 * @author Sean A. Irvine
 */
class PrescaledErf extends CR {

  private final CR mX;

  PrescaledErf(final CR x) {
    mX = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    // This is probably using more accuracy than needed
    final Z xAppr = mX.getApprox(p);
    final Z x2Appr = mX.multiply(mX).getApprox(p);
    Z currentTerm = xAppr; // x
    Z currentSum = currentTerm;
    int k = 0;
    while (currentTerm.abs().compareTo(Z.ONE) >= 0) {
      ++k;
      // currentTerm = currentTerm * x^2 / n
      currentTerm = scale(currentTerm.multiply(x2Appr), p);
      currentTerm = currentTerm.divide(Z.valueOf(k));
      currentSum = currentSum.signedAdd((k & 1) == 0, currentTerm.divide(2L * k + 1));
    }
    return currentSum;
  }
}

