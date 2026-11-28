package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToLongFunction;

/**
 * Extension-field structures normalized by an irreducible binary matrix group.
 * @author Gregory Morse
 */
final class BinaryNormalizedFields {

  private static final int DIMENSION = 6;
  private static final int BITS = DIMENSION * DIMENSION;
  private static final long CONSTANT = 1L << BITS;
  private static final long IDENTITY = BinaryLinearActions.identity(DIMENSION);

  private BinaryNormalizedFields() { }

  private static long product(final long a, final long b) {
    return BinaryLinearActions.multiply(a, b, DIMENSION);
  }

  private static void impose(final long[] basis, long row) {
    while ((row & (CONSTANT - 1)) != 0) {
      final int k = Long.SIZE - 1 - Long.numberOfLeadingZeros(row & (CONSTANT - 1));
      if (basis[k] == 0) {
        basis[k] = row;
        return;
      }
      row ^= basis[k];
    }
    basis[BITS] |= row;
  }

  private static void commute(final long[] basis, final long g, final int phase) {
    for (int c = 0; c < DIMENSION; ++c) {
      final int col = BinaryLinearActions.column(g, c, DIMENSION);
      for (int i = 0; i < DIMENSION; ++i) {
        long row = (((col >>> i) & phase) == 0) ? 0 : CONSTANT;
        for (int j = 0; j < DIMENSION; ++j) {
          if (((col >>> j) & 1) != 0) {
            row ^= 1L << (DIMENSION * j + i);
          }
          if (((BinaryLinearActions.column(g, j, DIMENSION) >>> i) & 1) != 0) {
            row ^= 1L << (DIMENSION * c + j);
          }
        }
        impose(basis, row);
      }
    }
  }

  private static long solve(final long[] equations, long x, final boolean affine) {
    final long rhs = affine ? CONSTANT : 0;
    for (int k = 0; k < BITS; ++k) {
      if ((Long.bitCount(equations[k] & (x | rhs)) & 1) != 0) {
        x ^= 1L << k;
      }
    }
    return x;
  }

  private static void roots(final long[] equations, final int degree, final long[] generators, final int[] phase, final List<Long> result) {
    if (equations[BITS] != 0) {
      return;
    }
    final List<Long> basis = new ArrayList<>();
    for (int k = 0; k < BITS; ++k) {
      if (equations[k] == 0) {
        basis.add(solve(equations, 1L << k, false));
      }
    }
    long x = solve(equations, 0, true);
    for (long i = 0; i < (1L << basis.size()); ++i) {
      if (i != 0) {
        x ^= basis.get(Long.numberOfTrailingZeros(i));
      }
      final long square = product(x, x);
      if (x > square || (degree == 2 ? square ^ x ^ IDENTITY : product(square, x) ^ x ^ IDENTITY) != 0) {
        continue;
      }
      if (degree == 3) {
        final long fourth = product(square, square);
        if (x > fourth) {
          continue;
        }
        final long[] powers = {x, square, fourth};
        boolean stable = true;
        for (int j = 0; j < generators.length; ++j) {
          if (product(generators[j], x) != product(powers[phase[j]], generators[j])) {
            stable = false;
            break;
          }
        }
        if (!stable) {
          continue;
        }
      }
      result.add(x);
    }
  }

  private static void quadratic(final long[] generators, final int j, final long[] basis, final List<Long> result) {
    if (basis[BITS] != 0) {
      return;
    }
    if (j == generators.length) {
      roots(basis, 2, generators, null, result);
      return;
    }
    final long[] fixed = basis.clone();
    commute(fixed, generators[j], 0);
    quadratic(generators, j + 1, fixed, result);
    final long[] conjugated = basis.clone();
    commute(conjugated, generators[j], 1);
    quadratic(generators, j + 1, conjugated, result);
  }

  static List<Long> quadratic(final long[] generators) {
    // For a quadratic field, the Frobenius action on a root x is x+1.
    // Thus each choice of the action on generators gives affine equations.
    final List<Long> result = new ArrayList<>();
    quadratic(generators, 0, new long[BITS + 1], result);
    return result;
  }

  static List<Long> cubic(final int[] elements, final int[] gens, final int identity,
                         final IntBinaryOperator multiply, final IntToLongFunction matrix) {
    final List<Long> result = new ArrayList<>();
    final int[] index = new int[Arrays.stream(elements).max().orElseThrow() + 1];
    for (int i = 0; i < elements.length; ++i) {
      index[elements[i]] = i;
    }
    final int[][] next = new int[elements.length][gens.length];
    final long[] generators = Arrays.stream(gens).mapToLong(matrix).toArray();
    final int[] choices = new int[gens.length];
    int assignments = 1;
    for (int j = 0; j < gens.length; ++j) {
      int order = 1;
      for (int x = gens[j]; x != identity; x = multiply.applyAsInt(x, gens[j])) {
        ++order;
      }
      choices[j] = order % 3 == 0 ? 3 : 1;
      assignments = Math.multiplyExact(assignments, choices[j]);
    }
    for (int i = 0; i < elements.length; ++i) {
      for (int j = 0; j < gens.length; ++j) {
        next[i][j] = index[multiply.applyAsInt(elements[i], gens[j])];
      }
    }
    final int[] phase = new int[gens.length];
    final int[] values = new int[elements.length];
    final int[] orbit = new int[elements.length];
    for (int f = 0; f < assignments; ++f) {
      int code = f;
      for (int j = 0; j < choices.length; ++j) {
        phase[j] = code % choices[j];
        code /= choices[j];
      }
      Arrays.fill(values, -1);
      orbit[0] = index[identity];
      values[orbit[0]] = 0;
      int end = 1;
      boolean valid = true;
      for (int i = 0; i < end && valid; ++i) {
        for (int j = 0; j < gens.length; ++j) {
          final int x = next[orbit[i]][j];
          final int value = (values[orbit[i]] + phase[j]) % 3;
          if (values[x] < 0) {
            values[x] = value;
            orbit[end++] = x;
          } else if (values[x] != value) {
            valid = false;
            break;
          }
        }
      }
      if (valid) {
        if (end != elements.length) {
          throw new IllegalStateException("Incomplete subgroup orbit");
        }
        final long[] equations = new long[BITS + 1];
        // The zero fiber is the kernel of the action on the field.
        for (int i = 0; i < elements.length; ++i) {
          if (values[i] == 0 && elements[i] != identity) {
            commute(equations, matrix.applyAsLong(elements[i]), 0);
          }
        }
        roots(equations, 3, generators, phase, result);
      }
    }
    return result;
  }

  static long basis(final long field, final int degree) {
    final int[] independent = new int[DIMENSION];
    int vector = 1;
    long basis = 0;
    for (int i = 0; i < DIMENSION; i += degree) {
      while (BinarySplitSubgroups.reduce(independent, vector) == 0) {
        ++vector;
      }
      int next = vector;
      for (int j = 0; j < degree; ++j) {
        BinarySplitSubgroups.insert(independent, next);
        basis |= (long) next << (DIMENSION * (i + j));
        next = BinaryLinearActions.apply(field, next, DIMENSION);
      }
    }
    return basis;
  }
}
