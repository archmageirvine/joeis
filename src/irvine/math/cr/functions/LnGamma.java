package irvine.math.cr.functions;

import java.util.HashMap;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * The log gamma function.
 * Series <code>sum(z/k-ln(1+z/k),k=0..infty)</code>.
 * @author Sean A. Irvine
 */
class LnGamma extends CrFunction1 {

  // This is slow ...

  private static final double DIGITS_TO_BITS = Math.log(10) / Math.log(2);
  private static final CR C1 = CR.TAU.log().divide(2);

  private static final BernoulliSequence BERNOULLI_SEQUENCE = new BernoulliSequence(0);
  private static final HashMap<Integer, CR> BERNOULLI_CACHE = new HashMap<>();

  private static CR bernoulli(final int k) {
    final CR res = BERNOULLI_CACHE.get(k);
    if (res != null) {
      return res;
    }
    final Q b2k = BERNOULLI_SEQUENCE.get(2L * k);
    final Q c = b2k.divide(2L * k).divide(2L * k - 1);
    final CR b = CR.valueOf(c);
    BERNOULLI_CACHE.put(k, b);
    return b;
  }

  @Override
  public CR cr(final CR z) {
    if (z.signum(32) < 0) {
      throw new UnsupportedOperationException();
    }
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 1) {
          return Z.ZERO;
        }

        // See D. E. G. Hare, "Computing the Principal Branch of log-Gamma"
        // Use lgamma(z) = lgamma(z+1) - ln(z), to increase z >> 1
        //StringUtils.message("Starting run up: " + precision + " " + System.identityHashCode(this));
        final int runUp = 1 + (int) (-0.5 * precision / DIGITS_TO_BITS);
        Z currentSum = Z.ZERO;
        for (int k = 0; k < runUp; ++k) {
          final Z a = z.add(CR.valueOf(k)).log().getApprox(precision);
          currentSum = currentSum.add(a);
        }
        final CR z1 = z.add(CR.valueOf(runUp));
        currentSum = C1.subtract(z1).add(z1.subtract(HALF).multiply(z1.log())).getApprox(precision).subtract(currentSum);

        // Use Bernoulli series
        int k = 0;
        while (true) {
          final CR t = bernoulli(++k).divide(ComputableReals.SINGLETON.pow(z1, 2L * k - 1));
          final Z currentTerm = t.getApprox(precision);
          if (currentTerm.isZero()) {
            break;
          }
          currentSum = currentSum.add(currentTerm);
        }
        return currentSum;
      }
    };
  }
}
