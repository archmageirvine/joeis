package irvine.oeis.a126;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A126750 Number of 2-connected (or biconnected) graphs on n nodes with chromatic number 2.
 * @author Sean A. Irvine
 */
public class A126750 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

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
        if (weight > n) {
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
   * Transposition component of the cycle index of bicolored graphs.
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

    for (final int[] lambda : exactPartitions(n / 2)) {
      final int exponent = tauExponent(lambda);

      final int[] doubled = new int[lambda.length];
      for (int k = 0; k < lambda.length; ++k) {
        doubled[k] = 2 * lambda[k];
      }

      final Q coefficient = new Q(Z.ONE.shiftLeft(exponent), z(doubled));

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

  private static CycleIndex localWreath(final CycleIndex r, final CycleIndex s) {
    return r.copy().wreath(s.copy());
  }

  private static Q[] counts(final CycleIndex ci, final int n) {
    final Q[] res = new Q[n + 1];
    java.util.Arrays.fill(res, Q.ZERO);
    for (final MultivariateMonomial m : ci.values()) {
      final int w = m.weight();
      if (w <= n) {
        res[w] = res[w].add(m.getCoefficient());
      }
    }
    return res;
  }

  private static List<int[]> exactPartitions(final int n) {
    final List<int[]> result = new ArrayList<>();
    final ArrayList<Integer> current = new ArrayList<>();
    partition(n, n, current, result);
    return result;
  }

  @Override
  public Z next() {
    ++mN;
    final int n = (int) mN;
    final int w = n + 0;

    System.out.println("bcE[" + mN + "]=" + bcE(n));
    System.out.println("bcTau[" + mN + "]=" + bcTau(n));

    // CBC = Omega o BC.
    final CycleIndex cbcE = localWreath(omega(w), bcE(w)).weightedTruncate(w);
    System.out.println("cbcE[" + mN + "]=" + cbcE);

    final CycleIndex cbcTau = localWreath(omega(w), bcTau(w)).weightedTruncate(w);
    System.out.println("cbcTau[" + mN + "]=" + cbcTau);

    // CBP = (CBC[e] + CBC[tau]) / 2.
    final CycleIndex cbp = cbcE.copy();
    cbp.add(cbcTau);
    cbp.multiply(Q.HALF);
    System.out.println("CBP[" + mN + "]=" + cbp);

    // I = compositional inverse of CBP.pointing().
    final CycleIndex cbpPointed = cbp.pointing().weightedTruncate(w);
    final CycleIndex inv = cbpPointed.inverse(w);

    // Check during development.
    System.out.println("P[" + mN + "]       = " + cbpPointed);
    System.out.println("Inv[" + mN + "]     = " + inv);
    System.out.println("P[Inv][" + mN + "]  = "  + localWreath(cbpPointed, inv).weightedTruncate(mN));


    // J = ci_xdiv(I), K = J^(-1), L = K - 1.
    final CycleIndex k = inv.xDiv().reciprocal(w);
    k.subtract(CycleIndex.ONE);
    //k.add(MultivariateMonomial.ONE, Q.NEG_ONE);
    System.out.println("k = " + k);

    // NBP =
    //   CBP o I
    //   + X * (Omega o (K - 1)).
    final CycleIndex first = localWreath(cbp, inv).weightedTruncate(w);

    final CycleIndex second = localWreath(omega(w), k).weightedTruncate(w);

    // Multiply by X = x_1.
    second.multiply(MultivariateMonomial.create(1, 1));

    final CycleIndex nbp = first.copy();
    nbp.add(second);
    nbp.weightedTruncate(w);

    // Isotype generating series: substitute x_i -> x^i.
    final Polynomial<Q> series = nbp.apply(RING.x(), w);

    System.out.println("Rational: " + series);
    return series.coeff(mN).toZ(); //RING.eval(series, Q.ONE).toZ();
  }
}
