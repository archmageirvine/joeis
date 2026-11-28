package irvine.math.group;

import java.util.ArrayList;
import java.util.List;

/**
 * Packed-column binary matrices and reduced subspace bases.
 * @author Gregory Morse
 */
final class BinaryLinearActions {

  private BinaryLinearActions() { }

  static int column(final long matrix, final int column, final int n) {
    return (int) (matrix >>> (n * column)) & ((1 << n) - 1);
  }

  static int apply(final long matrix, int vector, final int n) {
    int result = 0;
    while (vector != 0) {
      result ^= column(matrix, Integer.numberOfTrailingZeros(vector), n);
      vector &= vector - 1;
    }
    return result;
  }

  static long multiply(final long left, final long right, final int n) {
    long result = 0;
    for (int j = 0; j < n; ++j) {
      result |= (long) apply(left, column(right, j, n), n) << (n * j);
    }
    return result;
  }

  static long identity(final int n) {
    long result = 0;
    for (int i = 0; i < n; ++i) {
      result |= 1L << ((n + 1) * i);
    }
    return result;
  }

  static long inverse(final long matrix, final int n) {
    final int[] pivots = new int[n];
    final int[] preimages = new int[n];
    for (int j = 0; j < n; ++j) {
      int x = column(matrix, j, n);
      int y = 1 << j;
      while (x != 0) {
        final int i = Integer.numberOfTrailingZeros(x);
        if (pivots[i] == 0) {
          pivots[i] = x;
          preimages[i] = y;
          break;
        }
        x ^= pivots[i];
        y ^= preimages[i];
      }
      if (x == 0) {
        throw new IllegalArgumentException("Singular binary matrix");
      }
    }
    long result = 0;
    for (int j = 0; j < n; ++j) {
      int x = 1 << j;
      int y = 0;
      while (x != 0) {
        final int i = Integer.numberOfTrailingZeros(x);
        x ^= pivots[i];
        y ^= preimages[i];
      }
      result |= (long) y << (n * j);
    }
    return result;
  }

  static long conjugate(final long matrix, final long transport, final int n) {
    return multiply(multiply(transport, matrix, n), inverse(transport, n), n);
  }

  static long dual(final long matrix, final int n, final int a) {
    final long inv = inverse(matrix, n);
    long result = 0;
    for (int j = 0; j < n; ++j) {
      for (int i = 0; i < n; ++i) {
        if (((inv >>> (n * i + j)) & 1) != 0) {
          result |= 1L << (n * ((j + n - a) % n) + (i + n - a) % n);
        }
      }
    }
    return result;
  }

  static long completeBasis(final int[] space) {
    final int n = space.length;
    final int[] full = space.clone();
    long result = 0;
    int j = 0;
    for (final int x : space) {
      if (x != 0) {
        result |= (long) x << (n * j++);
      }
    }
    for (int i = 0; i < n; ++i) {
      if (BinarySplitSubgroups.reduce(full, 1 << i) != 0) {
        BinarySplitSubgroups.insert(full, 1 << i);
        result |= 1L << (n * j++ + i);
      }
    }
    return result;
  }

  static boolean invariant(final long[] generators, final int[] space) {
    for (final long g : generators) {
      for (final int x : space) {
        if (x != 0 && BinarySplitSubgroups.reduce(space, apply(g, x, space.length)) != 0) {
          return false;
        }
      }
    }
    return true;
  }

  private static void spaces(final List<int[]> result, final int[] basis, final int pivots, final int i, final int rank) {
    if (i == basis.length) {
      result.add(basis.clone());
      return;
    }
    if (((pivots >>> i) & 1) == 0) {
      basis[i] = 0;
      spaces(result, basis, pivots, i + 1, rank);
    } else {
      final int free = ((1 << i) - 1) & ~pivots;
      for (int mask = free; ; mask = (mask - 1) & free) {
        basis[i] = (1 << i) | mask;
        spaces(result, basis, pivots, i + 1, rank);
        if (mask == 0) {
          break;
        }
      }
    }
  }

  static List<int[]> spaces(final int n, final int rank) {
    final List<int[]> result = new ArrayList<>();
    for (int p = 0; p < (1 << n); ++p) {
      if (Integer.bitCount(p) == rank) {
        spaces(result, new int[n], p, 0, rank);
      }
    }
    return result;
  }

  static long[] generators(final int n) {
    if (n == 1) {
      return new long[0];
    }
    long rotation = 0;
    for (int j = 0; j < n; ++j) {
      rotation |= 1L << (n * j + (j + 1) % n);
    }
    return new long[] {rotation, identity(n) ^ 2};
  }
}
