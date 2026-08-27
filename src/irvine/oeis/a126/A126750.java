package irvine.oeis.a126;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A126750 Number of 2-connected (or biconnected) graphs on n nodes with chromatic number 2.
 * @author Sean A. Irvine
 */
public class A126750 extends Sequence0 {

  private long mN = 0;

  /**
   * Combinatorial logarithm
   *
   * Omega = sum_{k>=1} mu(k)/k * log(1 + p_k).
   *
   * Only terms of weight at most n are generated.
   *
   * @param n maximum weight
   * @return Omega
   */
  private static CycleIndex omega(final int n) {
    final CycleIndex res = new CycleIndex("Omega");

    for (int k = 1; k <= n; ++k) {
      final long mu = Functions.MOBIUS.l(k);
      if (mu == 0) {
        continue;
      }

      for (int j = 1; k * j <= n; ++j) {
        // (-1)^(j+1) * mu(k) / (k*j)
        final long sign = (j & 1) == 1 ? 1 : -1;
        final Q c = new Q(mu * sign, (long) k * j);

        // p_k^j
        final MultivariateMonomial m =
          MultivariateMonomial.create(k, j, c);

        res.add(m);
      }
    }
    return res;
  }

  /**
   * z_lambda = product_i i^m_i m_i!.
   *
   * @param lambda partition
   * @return z_lambda
   */
  private static Z z(final int[] lambda) {
    Z res = Z.ONE;
    int i = 0;
    while (i < lambda.length) {
      final int part = lambda[i];
      int multiplicity = 1;
      ++i;
      while (i < lambda.length && lambda[i] == part) {
        ++multiplicity;
        ++i;
      }
      res = res.multiply(Z.valueOf(part).pow(multiplicity))
        .multiply(factorial(multiplicity));
    }
    return res;
  }

  private static Z factorial(final int n) {
    Z res = Z.ONE;
    for (int k = 2; k <= n; ++k) {
      res = res.multiply(k);
    }
    return res;
  }

  /**
   * Construct the monomial p_lambda with the supplied coefficient.
   *
   * @param lambda partition
   * @param coefficient coefficient
   * @return monomial
   */
  private static MultivariateMonomial monomial(final int[] lambda, final Q coefficient) {
    final MultivariateMonomial m = new MultivariateMonomial();
    for (final int part : lambda) {
      m.add(part, Z.ONE);
    }
    m.setCoefficient(coefficient);
    return m;
  }

  /**
   * Sum gcd(lambda_i, mu_j).
   */
  private static int gcdSum(final int[] lambda, final int[] mu) {
    int sum = 0;
    for (final int a : lambda) {
      for (final int b : mu) {
        sum += Functions.GCD.i(a, b);
      }
    }
    return sum;
  }

  /**
   * Exponent in the fixed-point formula for the colour transposition.
   *
   * l(lambda) + sum ceil(lambda_i/2)
   * + sum_{i<j} gcd(lambda_i, lambda_j).
   */
  private static int tauExponent(final int[] lambda) {
    int exponent = lambda.length;

    for (final int part : lambda) {
      exponent += (part + 1) / 2;
    }

    for (int i = 0; i < lambda.length; ++i) {
      for (int j = i + 1; j < lambda.length; ++j) {
        exponent += Functions.GCD.i(lambda[i], lambda[j]);
      }
    }
    return exponent;
  }

  /**
   * Identity component of the cycle index of bicoloured graphs.
   *
   * BC_e = sum_{lambda,mu}
   *   2^(sum gcd(lambda_i,mu_j)) / (z_lambda z_mu)
   *   p_lambda p_mu.
   *
   * @param n maximum weight
   * @return cycle index
   */
  private static CycleIndex bcE(final int n) {
    final CycleIndex res = new CycleIndex("BC[e]");

    final List<int[]> partitions = partitions(n);

    for (final int[] lambda : partitions) {
      final int sizeLambda = sum(lambda);
      for (final int[] mu : partitions) {
        final int weight = sizeLambda + sum(mu);
        if (weight == 0 || weight > n) {
          continue;
        }

        final int exponent = gcdSum(lambda, mu);
        final Z numerator = Z.ONE.shiftLeft(exponent);
        final Z denominator = z(lambda).multiply(z(mu));

        final Q coefficient = new Q(numerator, denominator);

        final MultivariateMonomial m = monomial(lambda, coefficient);
        for (final int part : mu) {
          m.add(part, Z.ONE);
        }
        res.add(m);
      }
    }
    return res;
  }

  /**
   * Transposition component of the cycle index of bicoloured graphs.
   *
   * BC_tau = sum_lambda
   *   2^tauExponent(lambda) / z_lambda * p_lambda
   *
   * with the appropriate weight restriction.
   *
   * @param n maximum weight
   * @return cycle index
   */
  private static CycleIndex bcTau(final int n) {
    final CycleIndex res = new CycleIndex("BC[tau]");

    for (final int[] lambda : partitions(n / 2)) {
      if (lambda.length == 0) {
        continue;
      }

      final int exponent = tauExponent(lambda);

      final int[] doubled = new int[lambda.length];
      for (int k = 0; k < lambda.length; ++k) {
        doubled[k] = 2 * lambda[k];
      }

      final Q coefficient =
        new Q(Z.ONE.shiftLeft(exponent), z(doubled));

      res.add(monomial(doubled, coefficient));
    }
    return res;
  }

  /**
   * Integer partitions of all integers <= n.
   */
  private static List<int[]> partitions(final int n) {
    final List<int[]> result = new ArrayList<>();
    final ArrayList<Integer> current = new ArrayList<>();
    for (int k = 0; k <= n; ++k) {
      partition(k, k, current, result);
    }
    return result;
  }

  private static void partition(final int remaining,
                                final int largest,
                                final ArrayList<Integer> current,
                                final List<int[]> result) {
    if (remaining == 0) {
      final int[] p = new int[current.size()];
      for (int i = 0; i < p.length; ++i) {
        p[i] = current.get(i);
      }
      result.add(p);
      return;
    }

    for (int part = Math.min(remaining, largest); part >= 1; --part) {
      current.add(part);
      partition(remaining - part, part, current, result);
      current.remove(current.size() - 1);
    }
  }

  private static int sum(final int[] a) {
    int s = 0;
    for (final int x : a) {
      s += x;
    }
    return s;
  }

  /**
   * Compute CBC_e = Omega o BC_e.
   */
  private static CycleIndex cbcE(final int n) {
    return localWreath(omega(n), bcE(n));
  }

  /**
   * Compute CBC_tau = Omega o BC_tau.
   */
  private static CycleIndex cbcTau(final int n) {
    return localWreath(omega(n), bcTau(n));
  }

  /**
   * Compute CBP = (CBC_e + CBC_tau) / 2.
   */
  private static CycleIndex cbp(final int n) {
    final CycleIndex res = cbcE(n);
    res.add(cbcTau(n));
    res.multiply(Q.HALF);
    return res;
  }

  private static CycleIndex localWreath(final CycleIndex r, final CycleIndex s) {
    return r.copy().wreath(s.copy());
  }

  @Override
  public Z next() {
    final CycleIndex cbcE =
      localWreath(omega(4), bcE(4)).weightedTruncate(4);

    final CycleIndex cbcTau =
      localWreath(omega(4), bcTau(4)).weightedTruncate(4);

    final CycleIndex cbp = cbcE.copy();
    cbp.add(cbcTau);
    cbp.multiply(Q.HALF);

    System.out.println("CBC[e]      = " + cbcE);
    System.out.println("CBC[tau]    = " + cbcTau);
    System.out.println("CBP         = " + cbp);
    System.out.println("CBP pointed = " + cbp.pointing());

    final CycleIndex cbpPointed =
      cbp(4).pointing().weightedTruncate(4);

    final CycleIndex inv = cbpPointed.inverse(4);

    System.out.println("P   = " + cbpPointed);
    System.out.println("Inv = " + inv);
    System.out.println("P[Inv] = "
      + localWreath(cbpPointed, inv).weightedTruncate(4));

    ++mN;
    return Z.ZERO;
  }

}
