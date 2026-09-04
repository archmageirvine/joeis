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
   * @param m maximum weight
   * @return cycle index
   */
  private static CycleIndex bcTau(final int m) {
    final CycleIndex res = new CycleIndex("BC[tau]");

    for (int n = 2; n <= m; n += 2) {
      for (final int[] lambda : exactPartitions(n / 2)) {
        final int exponent = tauExponent(lambda);

        final int[] doubled = new int[lambda.length];
        for (int k = 0; k < lambda.length; ++k) {
          doubled[k] = 2 * lambda[k];
        }

        final Q coefficient = new Q(Z.ONE.shiftLeft(exponent), z(doubled));

        res.add(monomial(doubled, coefficient));
      }
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

  private static CycleIndex plethysm(final CycleIndex r, final CycleIndex s, final int n) {
    return r.plethysm(s, n);
    //return r.op(StandardMultiply.OP, s);
    //return r.copy().wreath(s.copy());
  }

  private static void printCoefficients(final String name,
                                        final CycleIndex ci,
                                        final int n) {
    final Polynomial<Q> series = ci.apply(RING.x(), n);
    System.out.println(name + " = " + series);
    for (int k = 0; k <= n; ++k) {
      System.out.println(name + "[" + k + "] = " + series.coeff(k));
    }
  }

  private static List<int[]> exactPartitions(final int n) {
    final List<int[]> result = new ArrayList<>();
    final ArrayList<Integer> current = new ArrayList<>();
    partition(n, n, current, result);
    return result;
  }

  private static void inspect(final String name,
                              final CycleIndex ci,
                              final int n) {
    System.out.println("\n" + name);
    System.out.println("cycle index = " + ci);

    final Polynomial<Q> series = ci.apply(RING.x(), n);
    System.out.println("series      = " + series);

    for (int k = 0; k <= n; ++k) {
      final Q c = series.coeff(k);
      if (!c.equals(Q.ZERO)) {
        System.out.println("  [" + k + "] = " + c);
      }
    }
  }

  private static CycleIndex setCycleIndex(final int n) {
    final CycleIndex res = new CycleIndex("E");
    for (int k = 1; k <= n; ++k) {
      for (final int[] lambda : exactPartitions(k)) {
        res.add(monomial(lambda, new Q(Z.ONE, z(lambda))));
      }
    }
    return res;
  }

  // bcE = A049312
  // bcTau = A122082
  // CBC[e] = A318870
  // CBC[tau] = A318869

  @Override
  public Z next() {
//    final CycleIndex p = new CycleIndex("P",
//      MultivariateMonomial.create(1, 1),
//      MultivariateMonomial.create(2, 1));
//
//    final CycleIndex q = new CycleIndex("Q",
//      MultivariateMonomial.create(1, 1),
//      MultivariateMonomial.create(1, 2, Q.ONE));
//
//    System.out.println("P = " + p);
//    System.out.println("Q = " + q);
//    System.out.println("P[Q] = " + p.wreath(q));

//    for (int k = 1; k < 20; ++k) {
//      inspect("BC[tau]", bcTau(k), k);
//    }

//    for (int k = 1; k < 20; ++k) {
//      final CycleIndex bcE = bcE(k);
//      final CycleIndex omega = omega(k);
//      //final CycleIndex cbcE = compose(omega, bcE).weightedTruncate(k);
//      final CycleIndex cbcE = omega.op(StandardMultiply.OP, bcE).weightedTruncate(k); // gives cbcE -> A048194
//      inspect("cbc[E]", cbcE, k);
//    }

    ++mN;
    final int n = (int) mN;
    final int w = n + 0;

    //inspect("BC[e]", bcE(n), n);
    //inspect("BC[tau]", bcTau(n), n);

    // CBC = Omega o BC.
    final CycleIndex bcE = bcE(w);
    bcE.subtract(CycleIndex.ONE);
    //inspect("BC[e]", bcE, n);
    final CycleIndex cbcE = plethysm(omega(w), bcE, w);
    //inspect("CBC[e]", cbcE, n);

    final CycleIndex cbcTau = plethysm(omega(w), bcTau(w), w);
    //inspect("CBC[tau]", cbcTau, n);

    // CBP = (CBC[e] + CBC[tau]) / 2.
    final CycleIndex cbp = cbcE.copy();
    cbp.add(cbcTau);
    cbp.multiply(Q.HALF);
    inspect("CBP", cbp, n);

    // Check BP
    final CycleIndex e = setCycleIndex(n);
    System.out.println(e);
    final CycleIndex bp = e.plethysm(cbp, n).weightedTruncate(n);
    inspect("BP", bp, n);

//    System.out.println("BP = " + bp);
//    System.out.println("BP counts = " + Arrays.toString(counts(bp, n)));

//        // I = compositional inverse of CBP.pointing().
//    final CycleIndex cbpPointed = cbp.pointing().weightedTruncate(w);
//    final CycleIndex inv = cbpPointed.inverse(w);
//
//    // J = ci_xdiv(I), K = J^(-1), L = K - 1.
//    final CycleIndex k = inv.xDiv().reciprocal(w);
//    k.subtract(CycleIndex.ONE);
//    //k.add(MultivariateMonomial.ONE, Q.NEG_ONE);
//    System.out.println("k = " + k);
//
//    // NBP =
//    //   CBP o I
//    //   + X * (Omega o (K - 1)).
//    final CycleIndex first = plethysm(cbp, inv, w);
//
//    final CycleIndex second = plethysm(omega(w), k, w);
//
//    // Multiply by X = x_1.
//    second.multiply(MultivariateMonomial.create(1, 1));
//
//    final CycleIndex nbp = first.copy();
//    nbp.add(second);
//    nbp.weightedTruncate(w);
//
//    // Isotype generating series: substitute x_i -> x^i.
//    final Polynomial<Q> series = nbp.apply(RING.x(), w);
//
//    System.out.println("Rational: " + series);
//    return series.coeff(mN).toZ(); //RING.eval(series, Q.ONE).toZ();
    return Z.ZERO;
  }
}
