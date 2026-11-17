package irvine.math.graph;

import java.util.Arrays;
import java.util.List;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.StandardMultiply;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Fixed all-valid strong digraphs from the rooted and derangement cycle indices.
 * @author Gregory Morse
 */
final class AllValidCycleIndex {

  private static final CycleIndex X = new CycleIndex("x", MultivariateMonomial.X1);

  private static CycleIndex add(final CycleIndex... terms) {
    final CycleIndex sum = new CycleIndex();
    for (final CycleIndex term : terms) {
      sum.add(term);
    }
    return sum;
  }

  private static CycleIndex scale(final CycleIndex series, final Q coefficient) {
    final CycleIndex result = series.copy();
    result.multiply(coefficient);
    return result;
  }

  private static CycleIndex mul(final CycleIndex a, final CycleIndex b, final int n) {
    final CycleIndex result = a.wop(StandardMultiply.OP, b, n);
    result.setName("");
    return result;
  }

  private static CycleIndex exp(final CycleIndex series, final int n) {
    final CycleIndex result = CycleIndex.ONE.copy();
    CycleIndex power = CycleIndex.ONE;
    for (int k = 1; k <= n; ++k) {
      power = mul(power, series, n);
      if (power.isEmpty()) {
        break;
      }
      result.add(scale(power, new Q(Z.ONE, Functions.FACTORIAL.z(k))));
    }
    return result;
  }

  private static CycleIndex mset(final CycleIndex series, final int n) {
    final CycleIndex exponent = new CycleIndex();
    for (int k = 1; k <= n; ++k) {
      exponent.add(scale(series.scale(k, n), new Q(1, k)));
    }
    return exp(exponent, n);
  }

  // The rooted flat/SESE system in the power-sum basis.
  private final MemoryFunction1<CycleIndex> mRooted = new MemoryFunction1<>() {
    @Override
    protected CycleIndex compute(final int n) {
      CycleIndex tree = CycleIndex.ZERO;
      for (int k = 1; k <= n; ++k) {
        final CycleIndex forest = mset(tree, k);
        final CycleIndex twice = add(scale(forest, Q.TWO), scale(CycleIndex.ONE, Q.NEG_ONE));
        tree = mul(mul(X, twice, k), add(twice, scale(tree, Q.NEG_ONE)), k);
      }
      final CycleIndex forest = mset(tree, n);
      final CycleIndex twice = add(scale(forest, Q.TWO), scale(CycleIndex.ONE, Q.NEG_ONE));
      final CycleIndex g = mul(X, twice, n);
      final CycleIndex b = add(twice, scale(tree, Q.NEG_ONE));
      final CycleIndex factor = scale(mul(X, mul(b, forest, n), n), Q.TWO);
      CycleIndex marked = CycleIndex.ZERO;
      for (int k = 1; k <= n; ++k) {
        marked = add(g, mul(marked, factor, n));
      }
      final CycleIndex phi = add(forest, mul(mul(marked, b, n), forest, n));
      CycleIndex blocks = CycleIndex.ZERO;
      for (int k = 1; k <= n; ++k) {
        blocks = mul(X, phi.plethysm(blocks, k - 1), k);
      }
      return forest.plethysm(blocks, n);
    }
  };

  private static final int RAP = 0;
  private static final int RAS0 = 1;
  private static final int RAS1 = 2;
  private static final int RA1 = 3;
  private static final int RBP = 4;
  private static final int RBS0 = 5;
  private static final int RBS1 = 6;
  private static final int RB1 = 7;
  private static final int CC = 8;
  private static final int DD = 9;
  private static final int EE = 10;
  private static final int[][] SERIES = {
    {CC, CC, CC}, {CC, EE, RAS1}, {CC, RAP, RAS1}, {CC, RAS0, RAS1}, {CC, RAS1, RAS1}, {CC, RA1, CC},
    {DD, DD, DD}, {DD, EE, RBS1}, {DD, RBP, RBS1}, {DD, RBS0, RBS1}, {DD, RBS1, RBS1}, {DD, RB1, DD},
    {EE, CC, RA1}, {EE, DD, RB1}, {EE, RAS1, RAS0}, {EE, RBS1, RBS0},
    {RAP, CC, RA1}, {RAP, RAS1, RAS0}, {RBP, DD, RB1}, {RBP, RBS1, RBS0},
  };

  private static CycleIndex[] parallel(final CycleIndex[] series, final CycleIndex c, final CycleIndex d, final int n) {
    final CycleIndex one = CycleIndex.ONE;
    final CycleIndex[] result = new CycleIndex[11];
    Arrays.fill(result, CycleIndex.ZERO);
    final CycleIndex twiceC = add(scale(c, Q.TWO), scale(one, Q.NEG_ONE));
    final CycleIndex twiceD = add(scale(d, Q.TWO), scale(one, Q.NEG_ONE));
    result[RAP] = mul(add(series[RAS0], series[RAS1], series[RA1]), twiceD, n);
    result[RBP] = mul(add(series[RBS0], series[RBS1], series[RB1]), twiceC, n);
    result[CC] = add(twiceC, scale(series[CC], Q.NEG_ONE));
    result[DD] = add(twiceD, scale(series[DD], Q.NEG_ONE));
    result[EE] = add(scale(mul(c, d, n), Q.FOUR), scale(c, Q.TWO.negate()), scale(d, Q.TWO.negate()), one);
    return result;
  }

  // p_1=0: unrooted dissymmetry retains only pole exchanges and rotations.
  private final MemoryFunction1<CycleIndex> mDeranged = new MemoryFunction1<>() {
    @Override
    protected CycleIndex compute(final int n) {
      if (n < 2) {
        return CycleIndex.ZERO;
      }
      final CycleIndex[] x = new CycleIndex[n + 1];
      x[1] = CycleIndex.ZERO;
      for (int k = 2; k <= n; ++k) {
        x[k] = mul(new CycleIndex("x", MultivariateMonomial.create(k, 1)), mRooted.get(n / k - 1).scale(k, n), n);
      }
      final CycleIndex[][] series = new CycleIndex[n + 1][];
      final CycleIndex[][] atoms = new CycleIndex[n + 1][];
      for (int d = n; d >= 2; --d) {
        series[d] = new CycleIndex[11];
        Arrays.fill(series[d], CycleIndex.ZERO);
        for (int j = 0; j <= n / d; ++j) {
          final CycleIndex hc = new CycleIndex();
          final CycleIndex hd = new CycleIndex();
          for (int k = 1; k <= n / d; ++k) {
            hc.add(scale(series[d * k][CC], new Q(1, k)));
            hd.add(scale(series[d * k][DD], new Q(1, k)));
          }
          atoms[d] = parallel(series[d], exp(hc, n), exp(hd, n), n);
          final CycleIndex[] all = new CycleIndex[11];
          for (int k = 0; k < all.length; ++k) {
            all[k] = add(atoms[d][k], series[d][k]);
            series[d][k] = new CycleIndex();
          }
          for (final int[] rule : SERIES) {
            series[d][rule[2]].add(mul(x[d], mul(atoms[d][rule[0]], all[rule[1]], n), n));
          }
        }
      }
      final CycleIndex pairs = new CycleIndex();
      for (int k = 1; k <= n / 2; ++k) {
        pairs.add(scale(add(series[2 * k][CC], series[2 * k][DD]), new Q(1, 2L * k)));
      }
      final CycleIndex reversed = add(scale(exp(pairs, n), Q.TWO), scale(CycleIndex.ONE, Q.NEG_ONE),
        scale(add(series[2][CC], series[2][DD]), new Q(-1, 2)));
      final CycleIndex result = scale(mul(x[2], reversed, n), Q.HALF);
      for (int k = 2; k <= n; ++k) {
        final CycleIndex empty = mul(x[k], atoms[k][CC], n);
        final CycleIndex occupied = mul(x[k], add(atoms[k][RAP], atoms[k][EE]), n);
        CycleIndex a = CycleIndex.ONE;
        CycleIndex b = CycleIndex.ZERO;
        CycleIndex c = CycleIndex.ZERO;
        CycleIndex d = CycleIndex.ONE;
        for (int j = 1; j <= n / k; ++j) {
          final CycleIndex nextA = mul(add(a, b), empty, n);
          final CycleIndex nextC = mul(add(c, d), empty, n);
          b = mul(a, occupied, n);
          d = mul(c, occupied, n);
          a = nextA;
          c = nextC;
          if (k * j >= 3) {
            result.add(scale(add(a, d), new Q(Functions.PHI.z(k), Z.valueOf((long) k * j))));
          }
        }
      }
      return result.homogeneous(n);
    }
  };

  Z fixed(final List<Integer> cycles) {
    final MultivariateMonomial monomial = new MultivariateMonomial();
    final boolean rooted = cycles.get(0) == 1;
    int n = 0;
    Z symmetries = Z.ONE;
    for (final var entry : PartMultisets.counts(rooted ? cycles.subList(1, cycles.size()) : cycles).entrySet()) {
      final int length = entry.getKey();
      final int count = entry.getValue();
      n += length * count;
      monomial.add(length, count);
      symmetries = symmetries.multiply(Z.valueOf(length).pow(count)).multiply(Functions.FACTORIAL.z(count));
    }
    final CycleIndex index = rooted ? mRooted.get(n) : mDeranged.get(n);
    final MultivariateMonomial term = index.get(monomial.termKey());
    return term == null ? Z.ZERO : term.getCoefficient().multiply(symmetries).toZ();
  }
}
