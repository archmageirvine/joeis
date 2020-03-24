package irvine.math.cr;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Sum needed for computation of log gamma function.
 * Series <code>sum(z/k-ln(1+z/k),k=0..infty)</code>.
 * @author Sean A. Irvine
 */
class PrescaledLnGamma extends CR {

  private static final double DIGITS_TO_BITS = Math.log(10) / Math.log(2);
  private final CR mX;

  PrescaledLnGamma(final CR x) {
    if (x.signum(32) < 0) {
      throw new UnsupportedOperationException();
    }
    mX = x;
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }

    // See D. E. G. Hare, "Computing the Principal Branch of log-Gamma"
    // Use lgamma(z) = lgamma(z+1) - ln(z), to increase z
    CR logSum = CR.ZERO;
    final int runUp = 1 + (int) (-0.5 * p / DIGITS_TO_BITS);
    for (int k = 0; k < runUp; ++k) {
      logSum = logSum.add(mX.add(CR.valueOf(k)).log());
    }
    final CR z = mX.add(CR.valueOf(runUp));
    final CR u = TAU.log().divide(TWO).subtract(z).add(z.subtract(HALF).multiply(z.log()));
    Z currentSum = u.subtract(logSum).approximate(p);
    //System.out.println("Run up: " + currentSum + " R=" + logSum + " z=" + z);

    // Use Bernoulli series
    final BernoulliSequence bernoulli = new BernoulliSequence(0);
    int k = 0;
    while (true) {
      if (Thread.interrupted() || sPleaseStop) {
        throw new AbortedError();
      }
      final Q b2k = bernoulli.get(2L * ++k);
      final Q c = b2k.divide(2L * k).divide(2L * k - 1);
      final CR t = CR.valueOf(c).divide(ComputableReals.SINGLETON.pow(z, 2L * k - 1));
      final Z currentTerm = t.approximate(p);
      if (Z.ZERO.equals(currentTerm)) {
        break;
      }
      currentSum = currentSum.add(currentTerm);
      //System.out.println("Current sum is now " + currentSum + " ct=" + currentTerm);
    }
    return currentSum;
  }

}

