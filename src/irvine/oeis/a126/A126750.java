package irvine.oeis.a126;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.partition.PartitionUtils;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.StandardMultiply;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A126750 Number of 2-connected (or biconnected) graphs on n nodes with chromatic number 2.
 * @author Sean A. Irvine
 */
public class A126750 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

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
      res = res.multiply(Z.valueOf(part).pow(multiplicity)).multiply(Functions.FACTORIAL.z(multiplicity));
    }
    return res;
  }

  /**
   * Construct the monomial p_lambda with the supplied coefficient.
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
   * @param n maximum weight
   * @return cycle index
   */
  private static CycleIndex bcE(final int n) {
    final CycleIndex res = new CycleIndex("BC[e]");
    final List<int[]> partitions = partitions(n);
    final int[] cLambda = new int[n + 1];
    final int[] cMu = new int[n + 1];
    for (final int[] lambda : partitions) {
      IntegerPartition.toCountForm(lambda, cLambda);
      final Z perLambda = PartitionUtils.per(cLambda);
      final int sizeLambda = sum(lambda);
      for (final int[] mu : partitions) {
        final int weight = sizeLambda + sum(mu);
        if (weight > n) {
          continue;
        }
        IntegerPartition.toCountForm(mu, cMu);
        final int exponent = gcdSum(lambda, mu);
        final Z numerator = Z.ONE.shiftLeft(exponent);
        final Z denominator = perLambda.multiply(PartitionUtils.per(cMu));

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
   * @param m maximum weight
   * @return cycle index
   */
  private static CycleIndex bcTau(final int m) {
    final CycleIndex res = new CycleIndex("BC[tau]");
    final int[] c = new int[m + 1];
    for (int n = 2; n <= m; n += 2) {
      for (final int[] lambda : exactPartitions(n / 2)) {
        final int exponent = tauExponent(lambda);
        for (int k = 0; k < lambda.length; ++k) {
          lambda[k] = 2 * lambda[k]; // double all the values
        }
        IntegerPartition.toCountForm(lambda, c);
        final Q coefficient = new Q(Z.ONE.shiftLeft(exponent), PartitionUtils.per(c));
        res.add(monomial(lambda, coefficient));
      }
    }
    return res;
  }

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

  private static CycleIndex s2TwistedComposition(final CycleIndex f, final CycleIndex oddG, final CycleIndex evenG, final long n) {
    final CycleIndex res = new CycleIndex("S2(" + f.getName() + ")");
    final Map<Integer, CycleIndex> cache = new HashMap<>();
    for (final MultivariateMonomial m : f.values()) {
      CycleIndex r = CycleIndex.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        final int k = e.getKey().right();
        final int exponent = e.getValue().intValueExact();
        CycleIndex g = cache.get(k);
        if (g == null) {
          final CycleIndex source = (k & 1) != 0 ? oddG : evenG;
          g = source.scale(k, n);
          cache.put(k, g);
        }
        r = r.wop(StandardMultiply.OP, g.wpow(exponent, n), n);
      }
      r.multiply(m.getCoefficient());
      res.add(r);
    }
    return res;
  }


  private static List<int[]> exactPartitions(final int n) {
    final List<int[]> result = new ArrayList<>();
    final ArrayList<Integer> current = new ArrayList<>();
    partition(n, n, current, result);
    return result;
  }

  // bcE = A049312
  // bcTau = A122082
  // CBC[e] = A318870
  // CBC[tau] = A123549

  @Override
  public Z next() {
    ++mN;
    final CycleIndex omega = CycleIndex.omega(mN);
    final CycleIndex bcE = bcE(mN);
    bcE.subtract(CycleIndex.ONE);
    final CycleIndex cbcE = omega.plethysm(bcE, mN);
    final CycleIndex bcTau = bcTau(mN);
    final CycleIndex cbcTau = s2TwistedComposition(omega, bcTau, bcE, mN);

    // CBP = (CBC[e] + CBC[tau]) / 2.
    final CycleIndex cbp = cbcE.copy();
    cbp.add(cbcTau);
    cbp.multiply(Q.HALF);

    // Compositional inverse of CBP.pointing()
    final CycleIndex cbpPointed = cbp.pointing().weightedTruncate(mN);
    final CycleIndex cbpPointedInverse = cbpPointed.inverse(mN);

    final CycleIndex left = cbp.plethysm(cbpPointedInverse, mN);
    // xDiv reduces with by 1
    // J = ci_xdiv(I), K = J^(-1), L = K - 1.
    final CycleIndex k = cbpPointedInverse.x1Div().reciprocal(mN);
    k.subtract(CycleIndex.ONE);
    //k.add(MultivariateMonomial.ONE, Q.NEG_ONE);
    final CycleIndex prex = omega.plethysm(k, mN);
    // Multiply by X = x_1.
    final CycleIndex right = prex.multiply(MultivariateMonomial.X1);
    // NBP = CBP o I + X * (Omega o (K - 1)).
    // We can get away without copy because we do not need left again after this
    final CycleIndex nbp = left; //.copy();
    nbp.add(right);
    return nbp.apply(RING.x(), mN).coeff(mN).toZ();
  }
}
