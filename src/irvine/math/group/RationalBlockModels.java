package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import irvine.math.q.Q;

/**
 * Recover a block-coordinate action from a cyclic vector in a rational representation.
 * @author Gregory Morse
 */
final class RationalBlockModels {

  private RationalBlockModels() { }

  static final class Model {
    private final Q[][][] mGenerators;
    private final Q[][] mGram;
    private final int mRank;

    private Model(final Q[][][] generators, final Q[][] gram, final int rank) {
      mGenerators = generators;
      mGram = gram;
      mRank = rank;
    }

    Q[][][] generators() {
      return mGenerators;
    }

    Q[][] form() {
      return mGram;
    }

    int rank() {
      return mRank;
    }
  }

  static boolean insert(final Q[][] pivots, final Q[] row) {
    final Q[] w = row.clone();
    for (int i = 0; i < pivots.length; ++i) {
      if (w[i].signum() != 0) {
        if (pivots[i] == null) {
          final Q leading = w[i];
          for (int j = i; j < w.length; ++j) {
            w[j] = w[j].divide(leading);
          }
          pivots[i] = w;
          return true;
        }
        final Q leading = w[i];
        for (int j = i; j < w.length; ++j) {
          w[j] = w[j].subtract(leading.multiply(pivots[i][j]));
        }
      }
    }
    return false;
  }

  static Q[][] inverse(final Q[][] basis) {
    final int n = basis.length;
    final Q[][] pivots = new Q[n][];
    for (int i = 0; i < n; ++i) {
      final Q[] row = Arrays.copyOf(basis[i], 2 * n);
      Arrays.fill(row, n, row.length, Q.ZERO);
      row[n + i] = Q.ONE;
      if (!insert(pivots, row)) {
        throw new IllegalArgumentException("Orbit bases must be independent");
      }
    }
    for (int i = n - 1; i >= 0; --i) {
      for (int j = 0; j < i; ++j) {
        final Q leading = pivots[j][i];
        if (leading.signum() != 0) {
          pivots[j][i] = Q.ZERO;
          for (int k = n; k < 2 * n; ++k) {
            pivots[j][k] = pivots[j][k].subtract(leading.multiply(pivots[i][k]));
          }
        }
      }
    }
    return Arrays.stream(pivots).map(row -> Arrays.copyOfRange(row, n, 2 * n)).toArray(Q[][]::new);
  }

  static Q[] action(final Q[] vector, final Q[][] matrix) {
    final Q[] result = new Q[vector.length];
    Arrays.fill(result, Q.ZERO);
    for (int i = 0; i < vector.length; ++i) {
      if (vector[i].signum() != 0) {
        for (int j = 0; j < vector.length; ++j) {
          if (matrix[i][j].signum() != 0) {
            result[j] = result[j].add(vector[i].multiply(matrix[i][j]));
          }
        }
      }
    }
    return result;
  }

  static Optional<Model> orbit(final Q[][][] group, final Q[][] form, final List<Q> seed) {
    if (seed == null || seed.size() != form.length) {
      return Optional.empty();
    }
    final int n = form.length;
    final List<Q[]> vectors = new ArrayList<>();
    final Q[][] pivots = new Q[n][];
    final Q[] start = seed.toArray(new Q[0]);
    if (!insert(pivots, start)) {
      return Optional.empty();
    }
    vectors.add(start);
    for (int i = 0; i < vectors.size() && vectors.size() < n; ++i) {
      for (final Q[][] g : group) {
        final Q[] next = action(vectors.get(i), g);
        if (insert(pivots, next)) {
          vectors.add(next);
          if (vectors.size() == n) {
            break;
          }
        }
      }
    }
    if (vectors.size() != n) {
      return Optional.empty();
    }
    // Every selected vector is in the seed orbit. If that orbit
    // lies in a union of blocks, the basis does so as well.
    final Q[][] basis = vectors.toArray(Q[][]::new);
    final Q[][] back = inverse(basis);
    final Q[][] transposed = new Q[n][n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        transposed[i][j] = basis[j][i];
      }
    }
    final Q[][] gram = RationalGroupContainment.product(RationalGroupContainment.product(basis, form), transposed);
    final Q[][][] generators = new Q[group.length][][];
    for (int i = 0; i < group.length; ++i) {
      generators[i] = RationalGroupContainment.product(RationalGroupContainment.product(basis, group[i]), back);
    }
    final int rank = RationalBlockSpectra.coordinateBlock(generators, gram);
    return rank > 0 ? Optional.of(new Model(generators, gram, rank)) : Optional.empty();
  }
}
