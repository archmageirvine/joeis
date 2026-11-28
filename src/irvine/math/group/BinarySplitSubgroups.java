package irvine.math.group;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Subgroup lifts through an elementary abelian kernel in a split extension.
 * @author Gregory Morse
 */
public final class BinarySplitSubgroups {

  private BinarySplitSubgroups() { }

  private static final BigInteger ZERO = BigInteger.ZERO;

  private static BigInteger[] zeros(final int n) {
    final BigInteger[] v = new BigInteger[n];
    Arrays.fill(v, ZERO);
    return v;
  }

  static boolean insert(final BigInteger[] basis, BigInteger x) {
    while (x.signum() != 0) {
      final int h = x.bitLength() - 1;
      if (basis[h] == null) {
        basis[h] = x;
        return true;
      }
      x = x.xor(basis[h]);
    }
    return false;
  }

  static int apply(final int[] columns, int x) {
    int y = 0;
    while (x != 0) {
      y ^= columns[Integer.numberOfTrailingZeros(x)];
      x &= x - 1;
    }
    return y;
  }

  static int reduce(final int[] basis, int x) {
    for (int i = basis.length - 1; i >= 0; --i) {
      if ((x & (1 << i)) != 0) {
        x ^= basis[i];
      }
    }
    return x;
  }

  static void insert(final int[] basis, int x) {
    while (x != 0) {
      final int h = Integer.SIZE - 1 - Integer.numberOfLeadingZeros(x);
      if (basis[h] == 0) {
        basis[h] = x;
        return;
      }
      x ^= basis[h];
    }
  }

  static BigInteger key(final int[] basis) {
    BigInteger key = ZERO;
    final int n = basis.length;
    for (int i = 0; i < n; ++i) {
      if (basis[i] != 0) {
        for (int j = i + 1; j < n; ++j) {
          if ((basis[j] & (1 << i)) != 0) {
            basis[j] ^= basis[i];
          }
        }
      }
      key = key.or(BigInteger.valueOf(basis[i]).shiftLeft(n * i));
    }
    return key;
  }

  static final class Presentation {
    final Map<Integer, BigInteger[]> mWords;
    final List<BigInteger[]> mRelations;

    private Presentation(final Map<Integer, BigInteger[]> words, final List<BigInteger[]> relations) {
      mWords = words;
      mRelations = relations;
    }
  }

  static Presentation present(final int n, final int identity, final int[] generators,
                              final IntBinaryOperator multiply, final IntFunction<int[]> action) {
    final int variables = n * generators.length;
    final Map<Integer, BigInteger[]> values = new HashMap<>();
    final BigInteger[] basis = new BigInteger[n * variables];
    final List<BigInteger[]> rel = new ArrayList<>();
    final List<Integer> elements = new ArrayList<>();
    elements.add(identity);
    values.put(identity, zeros(n));
    for (int i = 0; i < elements.size(); ++i) {
      final int g = elements.get(i);
      final int[] columns = action.apply(g);
      for (int k = 0; k < generators.length; ++k) {
        final int h = multiply.applyAsInt(g, generators[k]);
        final BigInteger[] row = values.get(g).clone();
        // f(g s) = f(g) + g.f(s) for a cocycle f on the projection.
        for (int j = 0; j < n; ++j) {
          for (int b = columns[j]; b != 0; b &= b - 1) {
            final int l = Integer.numberOfTrailingZeros(b);
            row[l] = row[l].flipBit(k * n + j);
          }
        }
        final BigInteger[] previous = values.putIfAbsent(h, row);
        if (previous == null) {
          elements.add(h);
        } else {
          BigInteger flat = ZERO;
          for (int j = 0; j < n; ++j) {
            row[j] = row[j].xor(previous[j]);
            flat = flat.or(row[j].shiftLeft(variables * j));
          }
          if (insert(basis, flat)) {
            rel.add(row);
          }
        }
      }
    }
    return new Presentation(values, rel);
  }

  static int quotientEquations(final List<BigInteger[]> relations, final int[] space, final BigInteger[] basis) {
    final int n = space.length;
    final int[] projection = new int[n];
    for (int j = 0; j < n; ++j) {
      projection[j] = reduce(space, 1 << j);
    }
    int rank = 0;
    for (final BigInteger[] e : relations) {
      final BigInteger[] row = zeros(n);
      for (int j = 0; j < n; ++j) {
        for (int b = projection[j]; b != 0; b &= b - 1) {
          final int k = Integer.numberOfTrailingZeros(b);
          row[k] = row[k].xor(e[j]);
        }
      }
      for (final BigInteger r : row) {
        if (insert(basis, r)) {
          ++rank;
        }
      }
    }
    return rank;
  }

  /**
   * Count subgroups mapping onto the specified projection.
   * @param n dimension of the binary kernel
   * @param identity identity of the projection
   * @param generators generators of the projection
   * @param multiply multiplication in the projection
   * @param action columns of the action of a projection element on the kernel
   * @return count of lifts, over all possible intersections with the kernel
   */
  public static Z count(final int n, final int identity, final int[] generators,
                        final IntBinaryOperator multiply, final IntFunction<int[]> action) {
    if (n < 0 || n > 15) {
      throw new IllegalArgumentException("Binary kernel dimension must be in 0..15");
    }
    if (generators.length == 0) {
      Z sum = Z.ZERO;
      for (int k = 0; k <= n; ++k) {
        sum = sum.add(Binomial.gaussianBinomial(n, k, 2));
      }
      return sum;
    }
    return count(n, generators, present(n, identity, generators, multiply, action).mRelations, action);
  }

  static Z count(final int n, final int[] generators, final List<BigInteger[]> rel, final IntFunction<int[]> action) {
    if (generators.length == 0) {
      Z sum = Z.ZERO;
      for (int k = 0; k <= n; ++k) {
        sum = sum.add(Binomial.gaussianBinomial(n, k, 2));
      }
      return sum;
    }
    final int variables = n * generators.length;
    Z sum = Z.ZERO;
    for (final int[] space : invariantSpaces(n, Arrays.stream(generators).mapToObj(action).toArray(int[][]::new))) {
      int codimension = 0;
      for (final int pivot : space) {
        if (pivot == 0) {
          ++codimension;
        }
      }
      final int degrees = codimension * generators.length - quotientEquations(rel, space, new BigInteger[variables]);
      if (degrees < 0) {
        throw new IllegalStateException("Inconsistent rank on the quotient");
      }
      sum = sum.add(Z.ONE.shiftLeft(degrees));
    }
    return sum;
  }

  static List<int[]> invariantSpaces(final int n, final int[][] actions) {
    final List<int[]> spaces = new ArrayList<>();
    final Set<BigInteger> seen = new HashSet<>();
    spaces.add(new int[n]);
    seen.add(ZERO);
    final boolean[] visited = new boolean[1 << n];
    final int[] orbit = new int[1 << n];
    for (int i = 0; i < spaces.size(); ++i) {
      final int[] space = spaces.get(i);
      int free = 0;
      for (int j = 0; j < n; ++j) {
        if (space[j] == 0) {
          free |= 1 << j;
        }
      }
      // Every invariant super-space is generated by adding successive
      // spans of orbits in the quotient. Use each quotient orbit once.
      Arrays.fill(visited, false);
      for (int x = free; x != 0; x = (x - 1) & free) {
        if (!visited[x]) {
          final int[] extension = space.clone();
          int end = 1;
          orbit[0] = x;
          visited[x] = true;
          for (int j = 0; j < end; ++j) {
            insert(extension, orbit[j]);
            for (final int[] a : actions) {
              final int y = reduce(space, apply(a, orbit[j]));
              if (!visited[y]) {
                visited[y] = true;
                orbit[end++] = y;
              }
            }
          }
          if (seen.add(key(extension))) {
            spaces.add(extension);
          }
        }
      }
    }
    return spaces;
  }
}
