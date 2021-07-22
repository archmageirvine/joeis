package irvine.math.cr;

import java.util.HashMap;

import irvine.math.MemoryFunction;
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

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final BernoulliSequence BERNOULLI = new BernoulliSequence(0);
  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();
  private static final CR EXP_PI = REALS.exp(CR.PI);
  private static final HashMap<Integer, CR> ZETA_CACHE = new HashMap<>();

  // See "Computational strategies for the Riemann zeta function",
  // Jonathan M. Borwein, David M. Bradley, Richard E. Crandall,
  // J Comp. Applied Math. 121, (2000), 247-296.

  private static final MemoryFunction<Long, CR> EXP_PI_CACHE = new MemoryFunction<Long, CR>() {
    @Override
    protected CR compute(final Long key) {
      return EXP_PI.pow(key);
    }
  };

  /* 2 * Sum_{k>0} (k^(-4p-1)/(exp(2*Pi*k)-1)) * (p + (Pi* k / (1-exp(-2*Pi*k))). */
  private static final class PrescaledZeta4p1 extends CR {

    private static final int EXTRA_PRECISION = 5;

    private final int mP;

    private PrescaledZeta4p1(final int p) {
      mP = p;
    }

    @Override
    protected Z approximate(final int precision) {
      if (precision >= 0) {
        return Z.ZERO;
      }
      final int opPrec = EXTRA_PRECISION - precision;
      final Z scale = Z.ONE.shiftLeft(opPrec);
      final Z ps = Z.valueOf(mP).shiftLeft(2 * opPrec);
      Z sum = Z.ZERO;
      long k = 0;
      while (true) {
        final Z term = CR.PI.getApprox(-3 * opPrec).multiply(++k)
          .divide(scale.subtract(EXP_PI_CACHE.getValue(-2 * k).getApprox(-opPrec)))
          .add(ps)
          .divide(Z.valueOf(k).pow(4L * mP + 1))
          .divide(EXP_PI_CACHE.getValue(2 * k).getApprox(-opPrec).subtract(scale));
        if (term.isZero()) {
          break;
        }
        sum = sum.add(term);
      }
      return sum.shiftRight(EXTRA_PRECISION - 1);
    }
  }

  /* 2 * Sum_{k>0} (k^(-4p+1)/(exp(2*Pi*k)-1)). */
  private static final class PrescaledZeta4m1 extends CR {

    private static final int EXTRA_PRECISION = 5;

    private final int mP;

    private PrescaledZeta4m1(final int p) {
      mP = p;
    }

    @Override
    protected Z approximate(final int precision) {
      if (precision >= 0) {
        return Z.ZERO;
      }
      final int opPrec = EXTRA_PRECISION - precision;
      final Z scale = Z.ONE.shiftLeft(opPrec);
      final Z scale2 = Z.ONE.shiftLeft(2 * opPrec);
      Z sum = Z.ZERO;
      long k = 0;
      while (true) {
        final Z term = scale2.divide(Z.valueOf(++k).pow(4L * mP - 1))
          .divide(EXP_PI_CACHE.getValue(2 * k).getApprox(-opPrec).subtract(scale));
        if (term.isZero()) {
          break;
        }
        sum = sum.add(term);
      }
      return sum.shiftRight(EXTRA_PRECISION - 1);
    }
  }

  // Compute zeta(4*p-1)
  private static CR zeta4m(final int p) {
    CR sum = CR.ZERO;
    for (int n = 0; n <= 2 * p; ++n) {
      sum = REALS.signedAdd((n & 1) == 1, sum, zeta(2 * n).multiply(zeta(4 * p - 2 * n)));
    }
    return sum.divide(CR.PI).subtract(new PrescaledZeta4m1(p));
  }

  // Compute zeta(4*p+1)
  private static CR zeta4p(final int p) {
    CR sum = CR.ZERO;
    for (int n = 0; n <= 2 * p + 1; ++n) {
      sum = REALS.signedAdd((n & 1) == 0, sum, zeta(2 * n).multiply(zeta(4 * p + 2 - 2 * n)).multiply(CR.valueOf(n).subtract(CR.HALF)));
    }
    sum = sum.divide(CR.PI);

    sum = sum.subtract(new PrescaledZeta4p1(p));
    final CR crp = CR.valueOf(p);
    return sum.divide(crp);
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
      } while (!currentTerm.isZero());
      return currentSum.shiftRight(6);  // / 64
    }
  };

  /**
   * Zeta function.
   * @param n argument
   * @return zeta function
   */
  public static CR zeta(final int n) {
    final CR res = ZETA_CACHE.get(n);
    if (res != null) {
      return res;
    }
    final CR r;
    if ((n & 1) == 1) {
      if (n == 3) {
        r = ZETA3; // we have a comparatively "fast" implementation for this
      } else if ((n & 3) == 3) {
        r = zeta4m((n + 1) / 4);
      } else {
        r = zeta4p(n / 4);
      }
    } else {
      final Q q = BERNOULLI.get(n).divide(2).divide(FACTORIAL.factorial(n));
      final CR cr = REALS.pow(CR.PI.multiply(CR.TWO), n).multiply(q);
      r = (n & 2) == 0 ? cr.negate() : cr;
    }
    ZETA_CACHE.put(n, r);
    return r;
  }
}
