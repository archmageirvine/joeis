package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Maximal invariant subspaces of finite-field representations of small degree.
 * @author Gregory Morse
 */
final class ModularInvariantSubspaces {

  private static final class Limit extends RuntimeException { }

  private final int mPrime;
  private final int[] mInverse;
  private long mBudget;

  private ModularInvariantSubspaces(final int prime, final long budget) {
    mPrime = prime;
    mBudget = budget;
    mInverse = new int[prime];
    mInverse[1] = 1;
    for (int x = 2; x < prime; ++x) {
      mInverse[x] = prime - (prime / x * mInverse[prime % x]) % prime;
    }
  }

  private int mod(final int x) {
    final int r = x % mPrime;
    return r < 0 ? r + mPrime : r;
  }

  private void charge(final int steps) {
    mBudget -= steps;
    if (mBudget < 0) {
      throw new Limit();
    }
  }

  private final class Space {
    private final int[][] mRows;
    private int mRank = 0;

    private Space(final int n) {
      mRows = new int[n][];
    }

    private boolean add(final int[] row) {
      for (int j = 0; j < row.length; ++j) {
        if (row[j] != 0) {
          final int[] pivot = mRows[j];
          charge(row.length - j);
          if (pivot == null) {
            final int reciprocal = mInverse[row[j]];
            for (int k = j; k < row.length; ++k) {
              row[k] = mod(row[k] * reciprocal);
            }
            mRows[j] = row;
            ++mRank;
            return true;
          }
          final int c = row[j];
          for (int k = j; k < row.length; ++k) {
            row[k] = mod(row[k] - c * pivot[k]);
          }
        }
      }
      return false;
    }

    private int[][] basis() {
      final int[][] b = new int[mRank][];
      int index = mRank;
      for (int j = mRows.length - 1; j >= 0; --j) {
        if (mRows[j] != null) {
          final int[] row = mRows[j].clone();
          for (int k = index; k < mRank; ++k) {
            final int[] pivot = b[k];
            int l = j + 1;
            while (pivot[l] == 0) {
              ++l;
            }
            final int c = row[l];
            if (c != 0) {
              for (int q = l; q < row.length; ++q) {
                row[q] = mod(row[q] - c * pivot[q]);
              }
            }
          }
          b[--index] = row;
        }
      }
      return b;
    }

    private List<int[]> kernel() {
      final List<int[]> result = new ArrayList<>();
      for (int j = 0; j < mRows.length; ++j) {
        if (mRows[j] == null) {
          final int[] v = new int[mRows.length];
          v[j] = 1;
          for (int k = j - 1; k >= 0; --k) {
            if (mRows[k] != null) {
              int sum = 0;
              for (int q = k + 1; q <= j; ++q) {
                sum += mRows[k][q] * v[q];
              }
              v[k] = mod(-sum);
            }
          }
          result.add(v);
        }
      }
      return result;
    }
  }

  private static int[] unit(final int n, final int i) {
    final int[] row = new int[n];
    row[i] = 1;
    return row;
  }

  private static int[][] transpose(final int[][] a) {
    final int[][] t = new int[a.length][a.length];
    for (int i = 0; i < a.length; ++i) {
      for (int j = 0; j < a.length; ++j) {
        t[j][i] = a[i][j];
      }
    }
    return t;
  }

  private int[] action(final int[] v, final int[][] a) {
    final int[] w = new int[v.length];
    charge(v.length * v.length);
    for (int i = 0; i < v.length; ++i) {
      if (v[i] != 0) {
        for (int j = 0; j < v.length; ++j) {
          w[j] += v[i] * a[i][j];
        }
      }
    }
    for (int j = 0; j < w.length; ++j) {
      w[j] = mod(w[j]);
    }
    return w;
  }

  private int[][] product(final int[][] a, final int[][] b) {
    return Arrays.stream(a).map(row -> action(row, b)).toArray(int[][]::new);
  }

  private Space cyclic(final int[] v, final int[][][] generators) {
    final Space space = new Space(v.length);
    final List<int[]> queue = new ArrayList<>();
    if (space.add(v.clone())) {
      queue.add(v);
    }
    for (int j = 0; j < queue.size() && space.mRank < v.length; ++j) {
      for (final int[][] g : generators) {
        final int[] w = action(queue.get(j), g);
        if (space.add(w.clone())) {
          queue.add(w);
        }
      }
    }
    return space;
  }

  private List<int[]> eigenvectors(final int[][] a, final int lambda) {
    final Space equations = new Space(a.length);
    for (int j = 0; j < a.length; ++j) {
      final int[] row = new int[a.length];
      for (int i = 0; i < a.length; ++i) {
        row[i] = a[i][j];
      }
      row[j] = mod(row[j] - lambda);
      equations.add(row);
    }
    return equations.kernel();
  }

  private boolean fullAlgebra(final int[][][] generators, final int n) {
    final Space algebra = new Space(n * n);
    final List<int[][]> queue = new ArrayList<>();
    final int[][] identity = new int[n][];
    for (int i = 0; i < n; ++i) {
      identity[i] = unit(n, i);
    }
    algebra.add(Arrays.stream(identity).flatMapToInt(Arrays::stream).toArray());
    queue.add(identity);
    for (int i = 0; i < queue.size(); ++i) {
      for (final int[][] g : generators) {
        final int[][] a = product(queue.get(i), g);
        if (algebra.add(Arrays.stream(a).flatMapToInt(Arrays::stream).toArray())) {
          if (algebra.mRank > n * n - n + 1) {
            // An invariant k-space confines the algebra to a parabolic
            // matrix algebra of codimension k(n-k), at least n-1.
            return true;
          }
          queue.add(a);
        }
      }
    }
    return false;
  }

  private final class KernelCertificate {
    private final Space mProper;

    private KernelCertificate(final Space proper) {
      mProper = proper;
    }
  }

  private KernelCertificate kernelCertificate(final int[][] matrix, final int eigenvalue, final List<int[]> kernel,
                                              final int[][][] generators, final int[][][] dual) {
    final int n = matrix.length;
    if (kernel.isEmpty() || kernel.size() > 3) {
      return null;
    }
    final Space dualSpan = cyclic(eigenvectors(transpose(matrix), eigenvalue).get(0), dual);
    if (dualSpan.mRank < n) {
      final Space annihilator = new Space(n);
      for (final int[] v : dualSpan.kernel()) {
        annihilator.add(v);
      }
      return new KernelCertificate(annihilator);
    }
    int combinations = 1;
    for (int first = kernel.size() - 1; first >= 0; --first) {
      for (int code = 0; code < combinations; ++code) {
        int x = code;
        final int[] v = kernel.get(first).clone();
        for (int j = first + 1; j < kernel.size(); ++j) {
          final int alpha = x % mPrime;
          x /= mPrime;
          for (int k = 0; k < n; ++k) {
            v[k] = mod(v[k] + alpha * kernel.get(j)[k]);
          }
        }
        final Space span = cyclic(v, generators);
        if (span.mRank < n) {
          return new KernelCertificate(span);
        }
      }
      if (first > 0) {
        if (combinations > 512 / mPrime) {
          return null;
        }
        combinations *= mPrime;
      }
    }
    // If a proper invariant U intersects the kernel, its nonzero
    // intersection vector cannot be cyclic. Otherwise U(A-lambda)=U,
    // so U is orthogonal to the entire cyclic dual kernel span.
    return new KernelCertificate(null);
  }

  private Space proper(final int[][][] generators, final int n) {
    for (int i = 0; i < n; ++i) {
      final Space space = cyclic(unit(n, i), generators);
      if (space.mRank < n) {
        return space;
      }
    }
    final int[][][] dual = Arrays.stream(generators).map(ModularInvariantSubspaces::transpose).toArray(int[][][]::new);
    final List<int[][]> words = new ArrayList<>(Arrays.asList(generators));
    for (final int[][] a : generators) {
      for (final int[][] b : generators) {
        words.add(product(a, b));
      }
    }
    for (final int[][] a : words) {
      for (int lambda = 0; lambda < mPrime; ++lambda) {
        final List<int[]> eigen = eigenvectors(a, lambda);
        for (final int[] v : eigen) {
          final Space space = cyclic(v, generators);
          if (space.mRank < n) {
            return space;
          }
        }
        final KernelCertificate certificate = kernelCertificate(a, lambda, eigen, generators, dual);
        if (certificate != null) {
          return certificate.mProper;
        }
      }
    }
    if (mPrime <= 7) {
      // A cyclic kernel can be defined by a quadratic factor,
      // even when every group word lacks a usable ground-field eigenline.
      for (int index = 0; index < Math.min(20, words.size()); ++index) {
        final int[][] a = words.get(index);
        final int[][] square = product(a, a);
        for (int c = 0; c < mPrime; ++c) {
          for (int d = 1; d < mPrime; ++d) {
            final int[][] polynomial = new int[n][n];
            for (int i = 0; i < n; ++i) {
              for (int j = 0; j < n; ++j) {
                polynomial[i][j] = mod(square[i][j] + c * a[i][j] + (i == j ? d : 0));
              }
            }
            final KernelCertificate certificate = kernelCertificate(polynomial, 0, eigenvectors(polynomial, 0), generators, dual);
            if (certificate != null) {
              return certificate.mProper;
            }
          }
        }
      }
    }
    if (fullAlgebra(generators, n)) {
      return null;
    }
    // Complete fallback, using exactly one vector on each projective line.
    long combinations = 1;
    for (int first = n - 1; first >= 0; --first) {
      for (long code = 0; code < combinations; ++code) {
        long x = code;
        final int[] v = unit(n, first);
        for (int j = first + 1; j < n; ++j) {
          v[j] = (int) (x % mPrime);
          x /= mPrime;
        }
        final Space space = cyclic(v, generators);
        if (space.mRank < n) {
          return space;
        }
      }
      if (first > 0) {
        if (combinations > Long.MAX_VALUE / mPrime) {
          throw new Limit();
        }
        combinations *= mPrime;
      }
    }
    return null;
  }

  private int[][] inverse(final int[][] a) {
    final int n = a.length;
    final Space augmented = new Space(2 * n);
    for (int i = 0; i < n; ++i) {
      final int[] row = Arrays.copyOf(a[i], 2 * n);
      row[n + i] = 1;
      augmented.add(row);
    }
    final int[][] basis = augmented.basis();
    final int[][] result = new int[n][];
    for (int i = 0; i < n; ++i) {
      result[i] = Arrays.copyOfRange(basis[i], n, 2 * n);
    }
    return result;
  }

  private boolean scalarCommutant(final int[][][] generators) {
    final int n = generators[0].length;
    final Space orbit = new Space(n);
    final List<int[]> rows = new ArrayList<>();
    final List<int[][]> words = new ArrayList<>();
    final int[][] identity = new int[n][];
    for (int i = 0; i < n; ++i) {
      identity[i] = unit(n, i);
    }
    rows.add(identity[0]);
    orbit.add(identity[0].clone());
    words.add(identity);
    for (int i = 0; i < rows.size() && orbit.mRank < n; ++i) {
      for (final int[][] g : generators) {
        final int[] v = action(rows.get(i), g);
        if (orbit.add(v.clone())) {
          rows.add(v);
          words.add(product(words.get(i), g));
        }
      }
    }
    if (orbit.mRank < n) {
      return false;
    }
    final int[][] basis = rows.toArray(int[][]::new);
    final int[][] back = inverse(basis);
    final Space equations = new Space(n);
    for (final int[][] g : generators) {
      final int[][] coefficients = product(product(basis, g), back);
      for (int i = 0; i < n; ++i) {
        final int[][] a = product(words.get(i), g);
        // For a commuting matrix X, write u = e_0 X. Its value on the
        // chosen cyclic basis is u w_i, where e_0 w_i is basis row i.
        // Commutation with g gives these linear constraints on u.
        for (int j = 0; j < n; ++j) {
          final int[] equation = new int[n];
          for (int k = 0; k < n; ++k) {
            int entry = a[k][j];
            for (int l = 0; l < n; ++l) {
              entry -= coefficients[i][l] * words.get(l)[k][j];
            }
            equation[k] = mod(entry);
          }
          equations.add(equation);
          if (equations.mRank == n - 1) {
            return true;
          }
        }
      }
    }
    return n == 1;
  }

  private void factors(final int[][][] generators, final int n, final List<int[][][]> factors) {
    factors(generators, n, factors, null);
  }

  private void factors(final int[][][] generators, final int n, final List<int[][][]> factors, final Space suppliedSplit) {
    final Space split = suppliedSplit != null ? suppliedSplit : n > 1 ? proper(generators, n) : null;
    if (split == null) {
      factors.add(generators);
      return;
    }
    final int k = split.mRank;
    final int[][] basis = Arrays.copyOf(split.basis(), n);
    int next = k;
    for (int j = 0; j < n; ++j) {
      if (split.mRows[j] == null) {
        basis[next++] = unit(n, j);
      }
    }
    final int[][] back = inverse(basis);
    final int[][][] sub = new int[generators.length][k][];
    final int[][][] quo = new int[generators.length][n - k][];
    for (int j = 0; j < generators.length; ++j) {
      final int[][] h = product(product(basis, generators[j]), back);
      for (int i = 0; i < k; ++i) {
        sub[j][i] = Arrays.copyOf(h[i], k);
      }
      for (int i = k; i < n; ++i) {
        quo[j][i - k] = Arrays.copyOfRange(h[i], k, n);
      }
    }
    factors(sub, k, factors);
    factors(quo, n - k, factors);
  }

  private void homs(final int[][][] source, final int[][][] target, final Map<String, int[][]> spaces) {
    final int d = source[0].length;
    final int n = target[0].length;
    final Space equations = new Space(d * n);
    for (int k = 0; k < source.length; ++k) {
      for (int i = 0; i < d; ++i) {
        for (int j = 0; j < n; ++j) {
          final int[] row = new int[d * n];
          for (int s = 0; s < d; ++s) {
            row[s * n + j] = source[k][i][s];
          }
          for (int t = 0; t < n; ++t) {
            row[i * n + t] = mod(row[i * n + t] - target[k][t][j]);
          }
          equations.add(row);
        }
      }
    }
    final List<int[]> homs = equations.kernel();
    long combinations = 1;
    for (int first = homs.size() - 1; first >= 0; --first) {
      for (long code = 0; code < combinations; ++code) {
        final int[] map = homs.get(first).clone();
        long x = code;
        for (int j = first + 1; j < homs.size(); ++j) {
          final int a = (int) (x % mPrime);
          x /= mPrime;
          for (int k = 0; k < map.length; ++k) {
            map[k] = mod(map[k] + a * homs.get(j)[k]);
          }
        }
        charge(map.length);
        final Space image = new Space(n);
        for (int j = 0; j < d; ++j) {
          image.add(Arrays.copyOfRange(map, j * n, (j + 1) * n));
        }
        if (image.mRank != d) {
          throw new IllegalStateException("A nonzero map from a simple module was not injective");
        }
        final String key = Arrays.deepToString(image.basis());
        if (!spaces.containsKey(key)) {
          final Space annihilator = new Space(n);
          for (final int[] row : image.kernel()) {
            annihilator.add(row);
          }
          spaces.put(key, annihilator.basis());
        }
      }
      if (first > 0) {
        if (combinations > Long.MAX_VALUE / mPrime) {
          throw new Limit();
        }
        combinations *= mPrime;
      }
    }
  }

  private Space commutingSplit(final int[][][] generators, final int[][] operator) {
    if (operator == null) {
      return null;
    }
    for (final int[][] g : generators) {
      if (!Arrays.deepEquals(product(g, operator), product(operator, g))) {
        return null;
      }
    }
    final int n = operator.length;
    for (int eigenvalue = 0; eigenvalue < mPrime; ++eigenvalue) {
      final Space equations = new Space(n);
      for (int j = 0; j < n; ++j) {
        final int[] column = new int[n];
        for (int i = 0; i < n; ++i) {
          column[i] = mod(operator[i][j] - (i == j ? eigenvalue : 0));
        }
        equations.add(column);
      }
      if (equations.mRank > 0 && equations.mRank < n) {
        final Space split = new Space(n);
        for (final int[] row : equations.kernel()) {
          split.add(row);
        }
        return split;
      }
    }
    return null;
  }

  static Optional<List<int[][]>> maximal(final int[][][] generators, final int prime, final long budget) {
    return maximal(generators, prime, budget, null);
  }

  static Optional<List<int[][]>> maximal(final int[][][] generators, final int prime, final long budget, final int[][] commutingOperator) {
    final ModularInvariantSubspaces algebra = new ModularInvariantSubspaces(prime, budget);
    try {
      final int[][][] dual = Arrays.stream(generators).map(ModularInvariantSubspaces::transpose).toArray(int[][][]::new);
      final List<int[][][]> simple = new ArrayList<>();
      final Space split = algebra.commutingSplit(dual, commutingOperator == null ? null : transpose(commutingOperator));
      algebra.factors(dual, dual[0].length, simple, split);
      if (simple.size() == 1) {
        return Optional.of(Collections.singletonList(new int[0][]));
      }
      final Map<String, int[][]> maximal = new LinkedHashMap<>();
      for (final int[][][] module : simple) {
        algebra.homs(module, dual, maximal);
      }
      return Optional.of(new ArrayList<>(maximal.values()));
    } catch (final Limit e) {
      return Optional.empty();
    }
  }

  static boolean hasScalarCommutant(final int[][][] generators, final int prime, final long budget) {
    try {
      return new ModularInvariantSubspaces(prime, budget).scalarCommutant(generators);
    } catch (final Limit e) {
      return false;
    }
  }

  // A finite-characteristic commutant dimension is an upper bound
  // for the rational one. At each depth every tested matrix is a
  // word in the corresponding derived group; completeness is not
  // necessary for this upper bound.
  static boolean derivedCommutantAtMost(final int[][][] generators, final int prime, final long budget,
                                        final int depth, final int bound) {
    final ModularInvariantSubspaces algebra = new ModularInvariantSubspaces(prime, budget);
    try {
      final int[][][] inverse = Arrays.stream(generators).map(algebra::inverse).toArray(int[][][]::new);
      final List<int[][]> words = new ArrayList<>(Arrays.asList(generators));
      for (int d = 0; d < depth; ++d) {
        final List<int[][]> previous = new ArrayList<>(words.subList(0, Math.min(words.size(), 24)));
        final List<int[][]> back = new ArrayList<>();
        for (final int[][] m : previous) {
          back.add(algebra.inverse(m));
        }
        words.clear();
        final Set<String> distinct = new HashSet<>();
        for (int i = 0; i < previous.size() && words.size() < 48; ++i) {
          for (int j = 0; j < i && words.size() < 48; ++j) {
            final int[][] m = algebra.product(algebra.product(back.get(i), back.get(j)), algebra.product(previous.get(i), previous.get(j)));
            if (distinct.add(Arrays.deepToString(m))) {
              words.add(m);
            }
          }
        }
        for (int i = 0; i < words.size() && words.size() < 64; ++i) {
          for (int j = 0; j < generators.length && words.size() < 64; ++j) {
            final int[][] m = algebra.product(algebra.product(inverse[j], words.get(i)), generators[j]);
            if (distinct.add(Arrays.deepToString(m))) {
              words.add(m);
            }
          }
        }
      }
      // Sparse commuting equations on the upper-left to lower-right
      // coordinates; stop as soon as rank certifies the bound.
      final int n = generators[0].length;
      final Space equations = algebra.new Space(n * n);
      for (final int[][] g : words) {
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < n; ++j) {
            final int[] row = new int[n * n];
            for (int k = 0; k < n; ++k) {
              row[k * n + j] = g[i][k];
            }
            for (int k = 0; k < n; ++k) {
              row[i * n + k] = algebra.mod(row[i * n + k] - g[k][j]);
            }
            equations.add(row);
            if (equations.mRank >= n * n - bound) {
              return true;
            }
          }
        }
      }
      return false;
    } catch (final Limit e) {
      return false;
    }
  }

  static boolean derivedExcludesDimension(final int[][][] generators, final int prime, final long budget, final int dimension) {
    final ModularInvariantSubspaces algebra = new ModularInvariantSubspaces(prime, budget);
    try {
      final int[][][] inverses = Arrays.stream(generators).map(algebra::inverse).toArray(int[][][]::new);
      final List<int[][]> words = new ArrayList<>();
      final Set<String> distinct = new HashSet<>();
      for (int i = 0; i < generators.length; ++i) {
        for (int j = 0; j < i; ++j) {
          final int[][] m = algebra.product(algebra.product(inverses[i], inverses[j]), algebra.product(generators[i], generators[j]));
          if (distinct.add(Arrays.deepToString(m))) {
            words.add(m);
          }
        }
      }
      for (int i = 0; i < words.size() && words.size() < 48; ++i) {
        for (int j = 0; j < generators.length && words.size() < 48; ++j) {
          final int[][] m = algebra.product(algebra.product(inverses[j], words.get(i)), generators[j]);
          if (distinct.add(Arrays.deepToString(m))) {
            words.add(m);
          }
        }
      }
      if (words.isEmpty()) {
        return false;
      }
      final List<int[][][]> simple = new ArrayList<>();
      algebra.factors(words.toArray(new int[0][][]), generators[0].length, simple);
      final boolean[] degrees = new boolean[dimension + 1];
      degrees[0] = true;
      for (final int[][][] factor : simple) {
        final int d = factor[0].length;
        for (int j = dimension; j >= d; --j) {
          degrees[j] |= degrees[j - d];
        }
      }
      return !degrees[dimension];
    } catch (final Limit e) {
      return false;
    }
  }

  static boolean derivedHasScalarCommutant(final int[][][] generators, final int prime, final long budget) {
    try {
      final ModularInvariantSubspaces algebra = new ModularInvariantSubspaces(prime, budget);
      final int[][][] inverses = Arrays.stream(generators).map(algebra::inverse).toArray(int[][][]::new);
      final List<int[][]> commutators = new ArrayList<>();
      for (int i = 0; i < generators.length; ++i) {
        for (int j = 0; j < i; ++j) {
          final int[][] a = algebra.product(inverses[i], inverses[j]);
          final int[][] b = algebra.product(generators[i], generators[j]);
          commutators.add(algebra.product(a, b));
        }
      }
      if (commutators.isEmpty()) {
        return false;
      }
      if (algebra.scalarCommutant(commutators.toArray(int[][][]::new))) {
        return true;
      }
      final Set<String> seen = new HashSet<>();
      for (final int[][] a : commutators) {
        seen.add(Arrays.deepToString(a));
      }
      for (int i = 0; i < commutators.size() && commutators.size() < 128; ++i) {
        for (int j = 0; j < generators.length; ++j) {
          final int[][] a = algebra.product(algebra.product(inverses[j], commutators.get(i)), generators[j]);
          if (seen.add(Arrays.deepToString(a))) {
            commutators.add(a);
          }
        }
      }
      // All tested generators belong to the derived group. A scalar
      // centralizer modulo p also certifies a scalar centralizer over Q.
      return algebra.scalarCommutant(commutators.toArray(int[][][]::new));
    } catch (final Limit e) {
      return false;
    }
  }
}
