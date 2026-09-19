package irvine.oeis.a126;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.StandardMultiply;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

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
        final MultivariateMonomial m =  MultivariateMonomial.create(k, j, c);
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

  private static void partition(final int remaining, final int largest, final ArrayList<Integer> current, final List<int[]> result) {
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
    return r.wreath(s, n);
  }

  /**
   * Adams operation psi_k on a cycle index:
   *
   *   psi_k(p_lambda) = p_{k lambda}.
   *
   * @param g cycle index
   * @param k Adams operation index
   * @param n maximum weight
   * @return psi_k(g)
   */
  private static CycleIndex adams(final CycleIndex g, final int k, final int n) {
    final CycleIndex result = new CycleIndex("psi_" + k + "(" + g.getName() + ")");

    for (final MultivariateMonomial m : g.values()) {
      final MultivariateMonomial scaled = new MultivariateMonomial();

      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        final Pair<String, Integer> key = e.getKey();
        scaled.add(key.left(), key.right() * k, e.getValue());
      }

      if (scaled.weight() <= n) {
        scaled.multiply(m.getCoefficient());
        result.add(scaled);
      }
    }
    return result;
  }

  private static CycleIndex s2TwistedComposition(final CycleIndex f,
                                                 final CycleIndex oddG,
                                                 final CycleIndex evenG,
                                                 final int n) {
    final CycleIndex res =
      new CycleIndex("S2(" + f.getName() + ")");

    final Map<Integer, CycleIndex> cache = new HashMap<>();

    for (final MultivariateMonomial m : f.values()) {
      CycleIndex r = CycleIndex.ONE;

      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        final int k = e.getKey().right();
        final int exponent = e.getValue().intValueExact();

        CycleIndex g = cache.get(k);
        if (g == null) {
          final CycleIndex source = (k & 1) != 0 ? oddG : evenG;
          g = source.adams(k);
          cache.put(k, g);
        }

        r = r.op(StandardMultiply.OP, g.pow(exponent, n), Z.valueOf(n));
      }

      r.multiply(m.getCoefficient());
      res.add(r);
    }

    return res.weightedTruncate(n);
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
  // CBC[tau] = A123549

  @Override
  public Z next() {
    ++mN;
    final int n = (int) mN;
    final int w = n + 1;

    final CycleIndex omega = omega(w);

    // CBC = Omega o BC.
    final CycleIndex bcE = bcE(w);
    bcE.subtract(CycleIndex.ONE);
    //inspect("BC[e]", bcE, n);
    final CycleIndex cbcE = plethysm(omega, bcE, w);
    //inspect("CBC[e]", cbcE, n);

    final CycleIndex bcTau = bcTau(w);
    //inspect("BC[tau]", bcTau(n), n);
    final CycleIndex cbcTau = s2TwistedComposition(omega, bcTau, bcE, w);
    //inspect("CBC[tau]", cbcTau, n);

    // CBP = (CBC[e] + CBC[tau]) / 2.
    final CycleIndex cbp = cbcE.copy();
    cbp.add(cbcTau);
    cbp.multiply(Q.HALF);
    //inspect("CBP", cbp, n);

    // Check BP
    //final CycleIndex bp = plethysm(setCycleIndex(n), cbp, n);
    //inspect("BP", bp, n);

    // I = compositional inverse of CBP.pointing().
    final CycleIndex cbpPointed = cbp.pointing().weightedTruncate(w);
    //inspect("CBP_pointed", cbpPointed, n);
    final CycleIndex cbpPointedInverse = cbpPointed.inverse(w);
    //inspect("CBP_pointed_inverse", cbpPointedInverse, n);

    inspect("xdiv", cbpPointedInverse.xDiv(), n);

    final CycleIndex left = plethysm(cbp, cbpPointedInverse, n);
    inspect("left", left, n);


    // xDiv reduces with by 1
    // J = ci_xdiv(I), K = J^(-1), L = K - 1.
    final CycleIndex k = cbpPointedInverse.xDiv().reciprocal(n);
    k.subtract(CycleIndex.ONE);
    //k.add(MultivariateMonomial.ONE, Q.NEG_ONE);
    inspect("rxdiv", k, n);
    final CycleIndex prex = plethysm(omega, k, n);
    // Multiply by X = x_1.
    final CycleIndex right = prex.multiply(MultivariateMonomial.create(1, 1));
    inspect("right", right, n);

    // NBP = CBP o I + X * (Omega o (K - 1)).
    final CycleIndex nbps = left.copy();
    nbps.add(right);
    final CycleIndex nbp = nbps.weightedTruncate(n); // todo this should be redundant, should already be truncated
    inspect("NBP", nbp, n);

    //
//    // Isotype generating series: substitute x_i -> x^i.
//    final Polynomial<Q> series = nbp.apply(RING.x(), n);
//
//    System.out.println("Rational: " + series);
//    return series.coeff(mN).toZ(); //RING.eval(series, Q.ONE).toZ();

    if (n == 2) {
      final int r = 2;
      System.out.println("BCe(2) = " + bcE.toString(r));
      System.out.println("CBCe(2) = " + cbcE.toString(r));
      System.out.println("BCt(2)  = " + bcTau.toString(r));
      System.out.println("CBCt(2) = " + cbcTau.toString(r));
      System.out.println("CBP(2)  = " + cbp.toString(r));
      System.out.println("CBP-pointed  = " + cbpPointed.toString(r));
      System.out.println("CBP-pointed-inverse  = " + cbpPointedInverse.toString(r));
      System.out.println("left  = " + left.toString(r));
      System.out.println("xdiv-recip  = " + k.toString(r));
      System.out.println("prex  = " + prex.toString(r));
      System.out.println("right  = " + right.toString(r));
    }

    return Z.ZERO;
  }
}
