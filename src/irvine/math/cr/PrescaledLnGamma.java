package irvine.math.cr;

import java.util.HashMap;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Sum needed for computation of log gamma function.
 * Series <code>sum(z/k-ln(1+z/k),k=0..infty)</code>.
 * @author Sean A. Irvine
 */
class PrescaledLnGamma extends CR {

  // todo this is very slow

  private static final double DIGITS_TO_BITS = Math.log(10) / Math.log(2);
  private static final CR C1 = TAU.log().divide(TWO);
  private final CR mX;

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
    // Use lgamma(z) = lgamma(z+1) - ln(z), to increase z >> 1
    //StringUtils.message("Starting run up: " + p + " " + System.identityHashCode(this));
    final int runUp = 1 + (int) (-0.5 * p / DIGITS_TO_BITS);
    Z currentSum = Z.ZERO;
    for (int k = 0; k < runUp; ++k) {
      final Z a = mX.add(CR.valueOf(k)).log().approximate(p);
      currentSum = currentSum.add(a);
    }
    final CR z = mX.add(CR.valueOf(runUp));
    currentSum = C1.subtract(z).add(z.subtract(HALF).multiply(z.log())).approximate(p).subtract(currentSum);

   // StringUtils.message("Starting bernoulli");
    // Use Bernoulli series
    int k = 0;
    while (true) {
//      final Z ta = bernoulli(++k).approximate(p);
//      final Z tb = ComputableReals.SINGLETON.pow(z, 2L * k - 1).approximate(p);
//      final Z currentTerm = ta.divide(tb);

      final CR t = bernoulli(++k).divide(ComputableReals.SINGLETON.pow(z, 2L * k - 1));
      final Z currentTerm = t.approximate(p);
      if (Z.ZERO.equals(currentTerm)) {
        break;
      }
      currentSum = currentSum.add(currentTerm);
      //System.out.println("Current sum is now " + currentSum + " ct=" + currentTerm);
    }
    //StringUtils.message("Done");
    return currentSum;
  }

}

