package irvine.math.cr;

import java.util.HashMap;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Compute zeta function.
 * @author Sean A. Irvine
 */
public final class Zeta {

  private Zeta() { }

  private static final ComputableReals FLD = ComputableReals.SINGLETON;
  private static final BernoulliSequence BERNOULLI = new BernoulliSequence(0);
  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();
  private static final CR EXP_PI = FLD.exp(CR.PI);
  private static final int DEFAULT_TERMS = 150;
  // Because the even values have "simple" closed forms we can cache them
  private static final HashMap<Integer, CR> EVEN_CACHE = new HashMap<>();

  // See "Computational strategies for the Riemann zeta function",
  // Jonathan M. Borwein, David M. Bradley, Richard E. Crandall,
  // J Comp. Applied Math. 121, (2000), 247-296.

  // Compute zeta(4*p-1)
  private static CR zeta4m(final int p, final int terms) {
    CR sum = CR.ZERO;
    for (int n = 0; n <= 2 * p; ++n) {
      sum = FLD.signedAdd((n & 1) == 1, sum, FLD.multiply(zeta(2 * n, terms), zeta(4 * p - 2 * n, terms)));
    }
    sum = FLD.divide(sum, CR.PI);

    for (int n = 1; n < terms; ++n) {
      final CR v = FLD.divide(FLD.pow(CR.valueOf(n), CR.valueOf(1 - 4 * p)), FLD.subtract(FLD.pow(EXP_PI, 2 * n), CR.ONE));
      sum = FLD.subtract(sum, FLD.multiply(v, CR.TWO));
    }

    return sum;
  }

  // Compute zeta(4*p+1)
  private static CR zeta4p(final int p, final int terms) {
    CR sum = CR.ZERO;
    for (int n = 0; n <= 2 * p + 1; ++n) {
      sum = FLD.signedAdd((n & 1) == 0, sum, FLD.multiply(FLD.multiply(zeta(2 * n, terms), zeta(4 * p + 2 - 2 * n, terms)), FLD.subtract(CR.valueOf(n), CR.HALF)));
    }
    sum = FLD.divide(sum, CR.PI);

    final CR crp = CR.valueOf(p);
    for (int n = 1; n < terms; ++n) {
      final CR v = FLD.divide(FLD.pow(FLD.coerce(n), CR.valueOf(-1 - 4 * p)), FLD.subtract(FLD.pow(EXP_PI, 2 * n), CR.ONE));
      final CR w = FLD.add(crp, FLD.divide(FLD.multiply(CR.PI, CR.valueOf(n)), FLD.subtract(CR.ONE, FLD.pow(EXP_PI, CR.valueOf(-2 * n)))));
      sum = FLD.subtract(sum, FLD.multiply(FLD.multiply(v, w), CR.TWO));
    }

    return FLD.divide(sum, crp);
  }

  private static final CR ZETA3 = new CR() {
    @Override
    protected Z approximate(final int p) {
      // Amdeberhan and Zeilberger
      // zeta(3) = (1/64) * Sum_{k >= 0} (-)^k * k!^10 * (205*k^2+250*k+77) / (2*k+1)!^5
      // Formula asymptotically gives just over 3 digits of accuracy per term
      if (p >= 1) {
        return Z.ZERO;
      }
      Z kf0 = Z.ONE;  // k!
      Z kf1 = Z.ONE;  // (2k+1)!
      Z currentSum = Z.ZERO;
      Z currentTerm;
      long k = -1;
      do {
        if (++k > 0) {
          kf0 = kf0.multiply(k);
          kf1 = kf1.multiply(2 * k).multiply(2 * k + 1);
        }
        final Z num = kf0.pow(10).multiply(Z.valueOf(205 * k + 250).multiply(k).add(77));
        final Z den = kf1.pow(5);
        currentTerm = scale(num, -p).divide(den);
        currentSum = currentSum.signedAdd((k & 1) == 0, currentTerm);
      } while (!Z.ZERO.equals(currentTerm));
      return currentSum.shiftRight(6);  // / 64
    }
  };

  /**
   * Zeta function.
   * @param n argument
   * @param terms for odd <code>n</code> controls the accuracy of the result.
   * @return zeta function
   */
  public static CR zeta(final int n, final int terms) {
    if ((n & 1) == 1) {
      if (n == 3) {
        return ZETA3; // we have a comparatively "fast" implementation for this
      }
      if ((n & 3) == 3) {
        return zeta4m((n + 1) / 4, terms);
      } else {
        return zeta4p(n / 4, terms);
      }
    }
    final CR res = EVEN_CACHE.get(n);
    if (res != null) {
      return res;
    }
    final Q q = BERNOULLI.get(n).divide(2).divide(FACTORIAL.factorial(n));
    final CR cr = FLD.pow(CR.PI.multiply(CR.TWO), n).multiply(q);
    final CR r = (n & 2) == 0 ? cr.negate() : cr;
    EVEN_CACHE.put(n, r);
    return r;
  }

  /**
   * Zeta function.
   * @param n argument
   * @return zeta function
   */
  public static CR zeta(final int n) {
    return zeta(n, DEFAULT_TERMS);
  }
}

