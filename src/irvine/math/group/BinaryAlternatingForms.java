package irvine.math.group;

import java.util.ArrayList;
import java.util.List;

/**
 * Invariant nondegenerate alternating forms of binary linear groups in dimension six.
 * @author Gregory Morse
 */
final class BinaryAlternatingForms {

  private static final int N = 6;
  private static final int VARIABLES = N * (N - 1) / 2;

  private BinaryAlternatingForms() { }

  private static int formRow(final int v, final int w) {
    int row = 0;
    int bit = 0;
    for (int i = 0; i < N; ++i) {
      for (int j = i + 1; j < N; ++j) {
        final int coefficient = (((v >>> i) & (w >>> j)) ^ ((v >>> j) & (w >>> i))) & 1;
        row |= coefficient << bit++;
      }
    }
    return row;
  }

  private static boolean nondegenerate(int form) {
    final int[] columns = new int[N];
    final int[] columnBasis = new int[N];
    for (int i = 0; i < N; ++i) {
      for (int j = i + 1; j < N; ++j) {
        if ((form & 1) != 0) {
          columns[i] |= 1 << j;
          columns[j] |= 1 << i;
        }
        form >>>= 1;
      }
    }
    for (final int column : columns) {
      if (BinarySplitSubgroups.reduce(columnBasis, column) == 0) {
        return false;
      }
      BinarySplitSubgroups.insert(columnBasis, column);
    }
    return true;
  }

  private static int pairing(final int form, final int v, final int w) {
    return Integer.bitCount(form & formRow(v, w)) & 1;
  }

  static long basis(final int form) {
    final int[] columns = new int[N];
    long matrix = 0;
    for (int i = 0; i < N; ++i) {
      for (int v = 1; v < (1 << N); ++v) {
        int j = 0;
        while (j < i && pairing(form, columns[j], v) == ((i ^ j) == 1 ? 1 : 0)) {
          ++j;
        }
        if (j == i) {
          // The next even-indexed vector is orthogonal to all previous
          // hyperbolic pairs; a nonzero vector in that complement is new.
          columns[i] = v;
          matrix |= (long) v << (N * i);
          break;
        }
      }
      if (columns[i] == 0) {
        throw new IllegalArgumentException("Degenerate alternating form");
      }
    }
    return matrix;
  }

  static List<Integer> forms(final long[] generators) {
    final int[] equations = new int[VARIABLES];
    for (final long generator : generators) {
      int bit = 0;
      for (int i = 0; i < N; ++i) {
        final int v = BinaryLinearActions.column(generator, i, N);
        for (int j = i + 1; j < N; ++j) {
          final int w = BinaryLinearActions.column(generator, j, N);
          BinarySplitSubgroups.insert(equations, formRow(v, w) ^ (1 << bit++));
        }
      }
    }
    final List<Integer> nullspace = new ArrayList<>();
    for (int j = 0; j < VARIABLES; ++j) {
      if (equations[j] == 0) {
        int v = 1 << j;
        for (int k = j + 1; k < VARIABLES; ++k) {
          if ((Integer.bitCount(equations[k] & v) & 1) != 0) {
            v |= 1 << k;
          }
        }
        nullspace.add(v);
      }
    }
    final List<Integer> result = new ArrayList<>();
    int v = 0;
    for (int i = 1; i < (1 << nullspace.size()); ++i) {
      v ^= nullspace.get(Integer.numberOfTrailingZeros(i));
      if (nondegenerate(v)) {
        result.add(v);
      }
    }
    return result;
  }
}
