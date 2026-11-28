package irvine.math.group;

import java.util.Arrays;
import java.util.Optional;

import irvine.math.q.Q;

/**
 * Exact comparison of two generator-marked irreducible rational representations.
 * @author Gregory Morse
 */
final class RationalGroupIntertwiner {

  private RationalGroupIntertwiner() { }

  private static boolean insert(final Q[][] basis, final Q[] row) {
    for (int j = 0; j < row.length; ++j) {
      final Q scale = row[j];
      if (scale.signum() != 0) {
        if (basis[j] == null) {
          for (int i = j; i < row.length; ++i) {
            if (row[i].signum() != 0) {
              row[i] = row[i].divide(scale);
            }
          }
          basis[j] = row;
          return true;
        }
        for (int i = j; i < row.length; ++i) {
          if (basis[j][i].signum() != 0) {
            row[i] = row[i].subtract(scale.multiply(basis[j][i]));
          }
        }
      }
    }
    return false;
  }

  private static void shapes(final Q[][][] matrices, final int generators, final int dimension) {
    if (matrices.length != generators || Arrays.stream(matrices)
      .anyMatch(m -> m.length != dimension || Arrays.stream(m).anyMatch(row -> row.length != dimension))) {
      throw new IllegalArgumentException("Incompatible rational representations");
    }
  }

  static Optional<Q[][]> find(final Q[][][] source, final Q[][][] target) {
    if (source.length == 0 || source[0].length == 0) {
      throw new IllegalArgumentException("A nonempty marked representation is required");
    }
    final int n = source[0].length;
    shapes(source, source.length, n);
    shapes(target, source.length, n);
    final int variables = Math.multiplyExact(n, n);
    final Q[][] basis = new Q[variables][];
    int rank = 0;
    for (int g = 0; g < source.length; ++g) {
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
          final Q[] row = new Q[variables];
          Arrays.fill(row, Q.ZERO);
          for (int k = 0; k < n; ++k) {
            row[n * i + k] = row[n * i + k].add(source[g][k][j]);
            row[n * k + j] = row[n * k + j].subtract(target[g][i][k]);
          }
          if (insert(basis, row) && ++rank == variables) {
            return Optional.empty();
          }
        }
      }
    }
    final Q[] vector = new Q[variables];
    boolean chosen = false;
    for (int i = variables - 1; i >= 0; --i) {
      if (basis[i] == null) {
        vector[i] = chosen ? Q.ZERO : Q.ONE;
        chosen = true;
      } else {
        Q tail = Q.ZERO;
        for (int j = i + 1; j < variables; ++j) {
          if (basis[i][j].signum() != 0 && vector[j].signum() != 0) {
            tail = tail.add(basis[i][j].multiply(vector[j]));
          }
        }
        vector[i] = tail.negate();
      }
    }
    final Q[][] witness = new Q[n][];
    final Q[][] independent = new Q[n][];
    for (int i = 0; i < n; ++i) {
      witness[i] = Arrays.copyOfRange(vector, i * n, (i + 1) * n);
      // A nonzero intertwiner from an irreducible source has zero kernel.
      if (!insert(independent, witness[i].clone())) {
        throw new IllegalArgumentException("The source is not irreducible, or the matrices are not a marked representation");
      }
    }
    return Optional.of(witness);
  }

  static boolean hasCommonSignLine(final Q[][][] generators, final int n) {
    return hasCommonSignLine(generators, 0, new Q[n][], 0);
  }

  private static boolean hasCommonSignLine(final Q[][][] generators, final int g, final Q[][] basis, final int rank) {
    if (g == generators.length) {
      return true;
    }
    for (final Q sign : new Q[] {Q.ONE, Q.NEG_ONE}) {
      final Q[][] next = basis.clone();
      int r = rank;
      for (int i = 0; i < next.length; ++i) {
        final Q[] row = generators[g][i].clone();
        row[i] = row[i].subtract(sign);
        if (insert(next, row) && ++r == next.length) {
          break;
        }
      }
      if (r < next.length && hasCommonSignLine(generators, g + 1, next, r)) {
        return true;
      }
    }
    return false;
  }
}
