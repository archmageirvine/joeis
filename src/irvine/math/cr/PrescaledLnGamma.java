package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Sum needed for computation of log gamma function.
 * Series <code>sum(z/k-ln(1+z/k),k=0..infty)</code>.
 * @author Sean A. Irvine
 */
class PrescaledLnGamma extends CR {

  private final CR mX;

  PrescaledLnGamma(final CR x) {
    mX = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    Z currentSum = Z.ZERO;
    int k = 0;
    // todo this series is way too slow to be useful
    while (true) {
      if (Thread.interrupted() || sPleaseStop) {
        throw new AbortedError();
      }
      final CR zk = mX.divide(CR.valueOf(++k));
      final CR t = zk.subtract(zk.add(CR.ONE).log());
      final Z currentTerm = t.approximate(p);
      if (Z.ZERO.equals(currentTerm) || k > 1000) {
        break;
      }
      //System.out.println("Current sum is now " + currentSum + " ct=" + currentTerm);
      currentSum = currentSum.add(currentTerm);
    }
    return currentSum;
  }
}

