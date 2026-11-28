package irvine.math.group;

import java.util.Optional;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Verify invariant Gram matrices and certify uniqueness over the rationals.
 * @author Gregory Morse
 */
final class RationalGroupForms {

  private RationalGroupForms() { }

  private static Q[][] product(final Q[][] a, final Q[][] b, final boolean transpose) {
    final int n = a.length;
    final Q[][] result = new Q[n][n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        Q sum = Q.ZERO;
        for (int k = 0; k < n; ++k) {
          final Q right = transpose ? b[j][k] : b[k][j];
          if (a[i][k].signum() != 0 && right.signum() != 0) {
            sum = sum.add(a[i][k].multiply(right));
          }
        }
        result[i][j] = sum;
      }
    }
    return result;
  }

  private static Q[] diagonalize(final Q[][] form) {
    final int n = form.length;
    final Q[][] rows = new Q[n][];
    for (int i = 0; i < n; ++i) {
      rows[i] = form[i].clone();
    }
    final Q[] result = new Q[n];
    for (int k = 0; k < n; ++k) {
      final Q pivot = rows[k][k];
      if (pivot.signum() <= 0) {
        throw new IllegalArgumentException("Gram matrix is not positive definite");
      }
      result[k] = pivot;
      for (int i = k + 1; i < n; ++i) {
        if (rows[i][k].signum() != 0) {
          final Q v = rows[i][k].divide(pivot);
          for (int j = k + 1; j < n; ++j) {
            if (rows[k][j].signum() != 0) {
              rows[i][j] = rows[i][j].subtract(v.multiply(rows[k][j]));
            }
          }
        }
      }
    }
    return result;
  }

  private static int[][] reduce(final Q[][] a, final int p) {
    final int n = a.length;
    final int[][] data = new int[n][n];
    final Z modulus = Z.valueOf(p);
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        final Q value = a[i][j];
        if (value.den().mod(p) == 0) {
          return null;
        }
        data[i][j] = value.num().mod(modulus).multiply(value.den().modPow(p - 2L, modulus)).mod(modulus).intValueExact();
      }
    }
    return data;
  }

  private static boolean insert(final int[][] basis, final int[] row, final int p) {
    for (int pivot = 0; pivot < row.length; ++pivot) {
      if (row[pivot] != 0) {
        if (basis[pivot] == null) {
          final int inverse = (int) Z.valueOf(row[pivot]).modPow(p - 2L, p).longValueExact();
          for (int j = pivot; j < row.length; ++j) {
            row[j] = inverse * row[j] % p;
          }
          basis[pivot] = row;
          return true;
        }
        final int scale = row[pivot];
        for (int j = pivot; j < row.length; ++j) {
          row[j] = Math.floorMod(row[j] - scale * basis[pivot][j], p);
        }
      }
    }
    return false;
  }

  private static boolean unique(final Q[][][] generators, final int n, final int p) {
    final int dimension = n * (n + 1) / 2;
    if (dimension == 1) {
      return true;
    }
    final int[][] basis = new int[dimension][];
    int rank = 0;
    for (final Q[][] generator : generators) {
      final int[][] a = reduce(generator, p);
      if (a == null) {
        // This prime does not define a reduction of the representation.
        return false;
      }
      for (int i = 0; i < n; ++i) {
        for (int j = i; j < n; ++j) {
          final int[] row = new int[dimension];
          int k = 0;
          for (int x = 0; x < n; ++x) {
            for (int y = x; y < n; ++y) {
              final int v = a[i][x] * a[j][y] + (x == y ? 0 : a[i][y] * a[j][x]);
              row[k++] = Math.floorMod(v - (x == i && y == j ? 1 : 0), p);
            }
          }
          if (insert(basis, row, p) && ++rank == dimension - 1) {
            // Reduction gives a lower bound on the rational rank.
            // The verified nonzero form supplies the opposite bound.
            return true;
          }
        }
      }
    }
    return false;
  }

  static Q[] checkInvariant(final Q[][] form, final Q[][][] generators) {
    final int n = form.length;
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < i; ++j) {
        if (!form[i][j].equals(form[j][i])) {
          throw new IllegalArgumentException("Gram matrix is not symmetric");
        }
      }
    }
    final Q[] diagonal = diagonalize(form);
    for (final Q[][] generator : generators) {
      final Q[][] invariant = product(product(generator, form, false), generator, true);
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
          if (!invariant[i][j].equals(form[i][j])) {
            throw new IllegalArgumentException("Gram matrix is not invariant");
          }
        }
      }
    }
    return diagonal;
  }

  static Optional<RationalInvariantForms> certify(final Q[][] form, final Q[][][] generators, final int[] localPrimes) {
    final int n = form.length;
    final Q[] diagonal = checkInvariant(form, generators);
    for (final int p : new int[] {101, 103, 107}) {
      if (unique(generators, n, p)) {
        return Optional.of(new RationalInvariantForms(diagonal, localPrimes));
      }
    }
    return Optional.empty();
  }
}
