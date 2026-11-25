package irvine.math.group;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Counts from the primary rational canonical form of binary matrices.
 * @author Gregory Morse
 */
public final class BinaryLinearMatrixCounts {

  /** Restrictions on the primary partitions. */
  public enum Type {
    /** Each primary component has only blocks of size one. */
    SEMISIMPLE,
    /** Each primary component has at most one block. */
    CYCLIC,
    /** Each primary component has size at most one. */
    SQUAREFREE,
    /** Has a square root in the general linear group. */
    SQUARE,
    /** Exclude the irreducible factors of x^3 + 1. */
    AVOID_CUBE,
    /** Exclude the irreducible factors of x^5 + 1. */
    AVOID_FIFTH
  }

  private BinaryLinearMatrixCounts() { }

  private static int[] multiplicities(final int[] parts) {
    final int[] counts = new int[parts[0] + 1];
    for (final int p : parts) {
      ++counts[p];
    }
    return counts;
  }

  private static boolean isSquarePartition(final int[] parts) {
    // Squaring a Jordan block of length s gives blocks of lengths
    // ceil(s/2) and floor(s/2). Pairing adjacent sorted parts suffices.
    for (int k = 1; k < parts.length; k += 2) {
      if (parts[k - 1] > parts[k] + 1) {
        return false;
      }
    }
    return (parts.length & 1) == 0 || parts[parts.length - 1] == 1;
  }

  private static Q local(final int d, final int m, final Type type) {
    final Z q = Z.ONE.shiftLeft(d);
    switch (type) {
      case SEMISIMPLE:
        return new Q(Z.ONE, LinearGroupOrder.general(m, q));
      case CYCLIC:
        return new Q(Z.ONE, q.subtract(1).multiply(q.pow(m - 1)));
      case SQUAREFREE:
        return m == 1 ? new Q(Z.ONE, q.subtract(1)) : Q.ZERO;
      case SQUARE:
        final IntegerPartition partitions = new IntegerPartition(m);
        Q sum = Q.ZERO;
        int[] parts;
        while ((parts = partitions.next()) != null) {
          if (isSquarePartition(parts)) {
            sum = sum.add(new Q(Z.ONE, GeneralLinearCycleIndex.kung(d, multiplicities(parts), 2)));
          }
        }
        return sum;
      default:
        return new Q(q.pow((long) m * (m - 1)), LinearGroupOrder.general(m, q));
    }
  }

  private static Z irreducibles(final int d) {
    Z sum = Z.ZERO;
    for (int k = 1; k <= d; ++k) {
      if (d % k == 0) {
        sum = sum.add(Z.valueOf(Functions.MOBIUS.i(k)).shiftLeft(d / k));
      }
    }
    return sum.divide(d);
  }

  /**
   * Size of a largest conjugacy class in GL(n,2).
   * @param n dimension
   * @return class size
   */
  public static Z largestClass(final int n) {
    // At fixed primary dimension a single block minimizes the centralizer.
    // Each distinct irreducible of degree d then contributes a factor
    // 1-2^(-d). Smaller d costs less dimension and gives a larger discount.
    Z centralizer = Z.ONE.shiftLeft(n);
    int remaining = n;
    for (int d = 1; d <= remaining; ++d) {
      final int count = irreducibles(d).subtract(d == 1 ? 1 : 0).min(Z.valueOf(remaining / d)).intValueExact();
      centralizer = centralizer.shiftRight(d * count).multiply(Z.ONE.shiftLeft(d).subtract(1).pow(count));
      remaining -= d * count;
    }
    return LinearGroupOrder.general(n, Z.TWO).divide(centralizer);
  }

  /**
   * Count invertible matrices satisfying a primary-partition restriction.
   * @param n dimension
   * @param type restriction
   * @return number of matrices
   */
  public static Z count(final int n, final Type type) {
    final Q[] logarithmic = new Q[n + 1];
    Arrays.fill(logarithmic, Q.ZERO);
    for (int d = 1; d <= n; ++d) {
      Z irreducibles = irreducibles(d).subtract(d == 1 ? 1 : 0); // Exclude x.
      if ((type == Type.AVOID_CUBE && (d == 1 || d == 2)) || (type == Type.AVOID_FIFTH && (d == 1 || d == 4))) {
        irreducibles = irreducibles.subtract(1);
      }
      if (!irreducibles.isZero()) {
        final Q[] local = new Q[n / d + 1];
        final Q[] derivative = new Q[local.length];
        // Combine the factors via x times their logarithmic derivatives.
        for (int k = 1; k < local.length; ++k) {
          local[k] = local(d, k, type);
          Q value = local[k].multiply(k);
          for (int j = 1; j < k; ++j) {
            value = value.subtract(local[j].multiply(derivative[k - j]));
          }
          derivative[k] = value;
          logarithmic[d * k] = logarithmic[d * k].add(value.multiply(irreducibles.multiply(d)));
        }
      }
    }
    final Q[] coefficients = new Q[n + 1];
    coefficients[0] = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      Q value = Q.ZERO;
      for (int j = 1; j <= k; ++j) {
        value = value.add(logarithmic[j].multiply(coefficients[k - j]));
      }
      coefficients[k] = value.divide(k);
    }
    return coefficients[n].multiply(LinearGroupOrder.general(n, Z.TWO)).toZ();
  }

  /**
   * Count nonsingular matrices up to simultaneous or independent row and column permutations.
   * @param n dimension
   * @param independent true for independent permutations
   * @return orbit count
   */
  public static Z permutationOrbits(final int n, final boolean independent) {
    if (n == 0) {
      return Z.ONE;
    }
    Q sum = Q.ZERO;
    final IntegerPartition partitions = new IntegerPartition(n);
    int[] parts;
    while ((parts = partitions.next()) != null) {
      final int[] counts = multiplicities(parts);
      Z symmetricCentralizer = Z.ONE;
      final Map<Integer, int[]> primary = new HashMap<>();
      for (int length = 1; length < counts.length; ++length) {
        final int multiplicity = counts[length];
        if (multiplicity != 0) {
          symmetricCentralizer = symmetricCentralizer.multiply(Z.valueOf(length).pow(multiplicity)).multiply(Functions.FACTORIAL.z(multiplicity));
          final int block = Integer.lowestOneBit(length);
          final int odd = length / block;
          for (int order = 1; order <= odd; order += 2) {
            if (odd % order == 0) {
              primary.computeIfAbsent(order, k -> new int[Integer.highestOneBit(n) + 1])[block] += multiplicity;
            }
          }
        }
      }
      Z linearCentralizer = Z.ONE;
      for (final Map.Entry<Integer, int[]> entry : primary.entrySet()) {
        final int order = entry.getKey();
        final int degree = order == 1 ? 1 : Functions.ORDER.i(order, 2);
        linearCentralizer = linearCentralizer.multiply(GeneralLinearCycleIndex.kung(degree, entry.getValue(), 2).pow(Functions.PHI.i(order) / degree));
      }
      // Two permutation matrices are similar over GF(2) only if their
      // cycle types agree: recover the odd parts by divisor inversion at
      // each 2-power block size.
      sum = sum.add(new Q(linearCentralizer, independent ? symmetricCentralizer.square() : symmetricCentralizer));
    }
    return sum.toZ();
  }
}
