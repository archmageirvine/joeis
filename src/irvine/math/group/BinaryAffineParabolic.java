package irvine.math.group;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Affine-parabolic lifts from the five-dimensional binary subgroup census.
 * @author Gregory Morse
 */
final class BinaryAffineParabolic {

  private static final int DIMENSION = 5;
  private static final int IDENTITY = (int) BinaryLinearActions.identity(DIMENSION);

  private BinaryAffineParabolic() { }

  private static int[] action(final int g, final boolean dual) {
    final int matrix = dual ? (int) BinaryLinearActions.inverse(g, DIMENSION) : g;
    final int[] columns = new int[DIMENSION];
    for (int i = 0; i < DIMENSION; ++i) {
      final int x = BinaryLinearActions.column(matrix, i, DIMENSION);
      if (!dual) {
        columns[i] = x;
      } else {
        for (int bits = x; bits != 0; bits &= bits - 1) {
          columns[Integer.numberOfTrailingZeros(bits)] |= 1 << i;
        }
      }
    }
    return columns;
  }

  private static Z lifts(final BinaryGlSubgroups.Subgroup subgroup, final boolean dual, final Map<Integer, int[]> actions) {
    final int[] generators = Arrays.stream(subgroup.mGenerators).mapToInt(Math::toIntExact).toArray();
    final int variables = generators.length * DIMENSION;
    final BigInteger[][] initial = new BigInteger[generators.length][DIMENSION];
    for (int i = 0; i < generators.length; ++i) {
      for (int j = 0; j < DIMENSION; ++j) {
        initial[i][j] = BigInteger.ONE.shiftLeft(DIMENSION * i + j);
      }
    }
    final BinaryLiftChain pres = new BinaryLiftChain(DIMENSION, DIMENSION, variables, IDENTITY, generators, initial,
      (x, y) -> (int) BinaryLinearActions.multiply(x, y, DIMENSION), x -> (int) BinaryLinearActions.inverse(x, DIMENSION),
      (x, v) -> BinaryLinearActions.apply(x, v, DIMENSION), x -> actions.computeIfAbsent(x, k -> action(k, dual)));
    if (pres.order() != subgroup.mOrder) {
      throw new IllegalStateException("Lift presentation order does not match its ambient subgroup");
    }
    return BinarySplitSubgroups.count(DIMENSION, generators, pres.relations(), x -> actions.computeIfAbsent(x, k -> action(k, dual)));
  }

  static Z fixesLine(final BinaryGlSubgroups five) {
    final long order = LinearGroupOrder.general(DIMENSION, Z.TWO).longValueExact();
    final Map<Integer, int[]> actions = new HashMap<>();
    Z total = Z.ZERO;
    for (final BinaryGlSubgroups.Subgroup p : five.classes()) {
      total = total.add(lifts(p, true, actions).multiply(order / p.mNormalizerOrder));
    }
    return total;
  }

  static Z withFixedVector(final BinaryGlSubgroups five) {
    final int n = DIMENSION + 1;
    Z total = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      final Z fixed;
      if (k == 1) {
        fixed = fixesLine(five);
      } else if (k == n) {
        fixed = Z.ONE;
      } else if (k == n - 1) {
        // The quotient has dimension one, so only the kernel acts.
        Z sum = Z.ZERO;
        for (int j = 0; j <= k; ++j) {
          sum = sum.add(Binomial.gaussianBinomial(k, j, 2));
        }
        fixed = sum;
      } else {
        fixed = BinaryParabolicSubgroups.fixesSpace(k, n - k);
      }
      final Z weighted = fixed.multiply(Binomial.gaussianBinomial(n, k, 2)).shiftLeft((long) k * (k - 1) / 2);
      total = (k & 1) == 1 ? total.add(weighted) : total.subtract(weighted);
    }
    return total;
  }

  static Z minimumFive(final BinaryGlSubgroups five) {
    final long order = LinearGroupOrder.general(DIMENSION, Z.TWO).longValueExact();
    final Map<Integer, int[]> actions = new HashMap<>();
    Z total = Z.ZERO;
    for (final BinaryGlSubgroups.Subgroup p : five.classes()) {
      if (five.irreducible(p)) {
        // An irreducible action in the hyperplane only permits zero
        // or the full kernel. The split complements, precisely the
        // coboundaries (one per vector), fix a line and must be removed.
        final Z withoutLine = lifts(p, false, actions).subtract(1 << DIMENSION);
        total = total.add(withoutLine.multiply(order / p.mNormalizerOrder));
      }
    }
    // The invariant hyperplane of such a subgroup is unique.
    return total.multiply(Binomial.gaussianBinomial(DIMENSION + 1, DIMENSION, 2));
  }

  static int minimumFiveClasses(final BinaryGlSubgroups five) {
    final Map<Integer, int[]> actions = new HashMap<>();
    int total = 0;
    for (final BinaryGlSubgroups.Subgroup p : five.classes()) {
      if (five.irreducible(p)) {
        if (!lifts(p, false, actions).equals(Z.valueOf(1 + (1 << DIMENSION)))) {
          throw new UnsupportedOperationException("A nonsplit complement requires a cohomology orbit census");
        }
        // With no nonsplit complement the unique hyperplane class
        // has the full kernel, for each irreducible projection class.
        ++total;
      }
    }
    return total;
  }
}
