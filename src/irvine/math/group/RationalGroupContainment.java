package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

import irvine.math.q.Q;

/**
 * Exhaustive conjugate containment in an explicitly enumerable rational matrix group.
 * @author Gregory Morse
 */
final class RationalGroupContainment {

  private static final class MatrixKey {
    private final Q[][] mValue;
    private final int mHash;

    private MatrixKey(final Q[][] value) {
      mValue = value;
      mHash = Arrays.deepHashCode(value);
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object other) {
      return other instanceof MatrixKey && Arrays.deepEquals(mValue, ((MatrixKey) other).mValue);
    }
  }

  private RationalGroupContainment() { }

  static final class Target {
    private final List<Q[][]> mElements;
    private final Set<MatrixKey> mMembers = new HashSet<>();
    private Map<List<Q>, List<Q[][]>> mSpectra;
    private final Q[][][] mGenerators;

    Target(final Q[][][] generators, final int dimension, final int order) {
      mGenerators = generators;
      mElements = elements(generators, dimension, order, mMembers);
    }

    private Map<List<Q>, List<Q[][]>> spectra() {
      if (mSpectra == null) {
        mSpectra = new HashMap<>();
        for (final Q[][] element : mElements) {
          mSpectra.computeIfAbsent(List.of(spectrum(element)), key -> new ArrayList<>()).add(element);
        }
      }
      return mSpectra;
    }

    boolean spectraFit(final Target target) {
      final Map<List<Q>, List<Q[][]>> spectra = target.spectra();
      return spectra().entrySet().stream().allMatch(e -> e.getValue().size() <= spectra.getOrDefault(e.getKey(), List.of()).size());
    }

    boolean contains(final Q[][] matrix) {
      return mMembers.contains(new MatrixKey(matrix));
    }
  }

  static boolean isFullSignedPermutationGroup(final Q[][][] generators, final int order) {
    final int n = generators[0].length;
    long full = 1;
    for (int j = 1; j <= n; ++j) {
      full *= 2L * j;
      if (full > order) {
        return false;
      }
    }
    if (full != order) {
      return false;
    }
    for (final Q[][] matrix : generators) {
      final BitSet columns = new BitSet();
      for (final Q[] row : matrix) {
        int column = -1;
        for (int j = 0; j < n; ++j) {
          if (row[j].signum() != 0) {
            if (column >= 0 || !row[j].abs().equals(Q.ONE) || columns.get(j)) {
              return false;
            }
            column = j;
          }
        }
        if (column < 0) {
          return false;
        }
        columns.set(column);
      }
    }
    return true;
  }

  static boolean hasSignedPermutationModel(final Target source) {
    final int order = source.mElements.size();
    final int n = source.mGenerators[0].length;
    if (order % n != 0) {
      return false;
    }
    final Map<MatrixKey, Integer> indices = new HashMap<>();
    final int[] ids = new int[order];
    for (int j = 0; j < order; ++j) {
      indices.put(new MatrixKey(source.mElements.get(j)), j);
      ids[j] = j;
    }
    final int[][] multiplication = new int[order][order];
    final int[] inverse = new int[order];
    for (int i = 0; i < order; ++i) {
      for (int j = 0; j < order; ++j) {
        final int k = indices.get(new MatrixKey(product(source.mElements.get(i), source.mElements.get(j))));
        multiplication[i][j] = k;
        if (k == 0) {
          inverse[i] = j;
        }
      }
    }
    final int[] generators = Arrays.stream(source.mGenerators).mapToInt(g -> indices.get(new MatrixKey(g))).toArray();
    final BinaryParabolicSubgroups classes = BinaryParabolicSubgroups.explicit(0, ids, generators, (a, b) -> multiplication[a][b], a -> inverse[a]);
    for (final BinaryParabolicSubgroups.Entry subgroup : classes.mRepresentatives) {
      if (subgroup.mOrder == order / n) {
        final Q[][][] matrices = Arrays.stream(subgroup.mGenerators).mapToObj(source.mElements::get).toArray(Q[][][]::new);
        if (RationalGroupIntertwiner.hasCommonSignLine(matrices, n)) {
          // By irreducibility a rational line spans under the whole group.
          // Its orbit has at most n lines, so it consists of exactly n
          // independent lines and yields a signed permutation basis.
          return true;
        }
      }
    }
    return false;
  }

  static Q[][] product(final Q[][] a, final Q[][] b) {
    final int n = a.length;
    final Q[][] result = new Q[n][n];
    for (int i = 0; i < n; ++i) {
      Arrays.fill(result[i], Q.ZERO);
      for (int k = 0; k < n; ++k) {
        if (a[i][k].signum() != 0) {
          for (int j = 0; j < n; ++j) {
            if (b[k][j].signum() != 0) {
              result[i][j] = result[i][j].add(a[i][k].multiply(b[k][j]));
            }
          }
        }
      }
    }
    return result;
  }

  private static Q trace(final Q[][] a) {
    Q sum = Q.ZERO;
    for (int i = 0; i < a.length; ++i) {
      sum = sum.add(a[i][i]);
    }
    return sum;
  }

  private static Q traceProduct(final Q[][] a, final Q[][] b) {
    Q sum = Q.ZERO;
    for (int i = 0; i < a.length; ++i) {
      for (int j = 0; j < a.length; ++j) {
        if (a[i][j].signum() != 0 && b[j][i].signum() != 0) {
          sum = sum.add(a[i][j].multiply(b[j][i]));
        }
      }
    }
    return sum;
  }

  private static Q[] integralSpectrum(final Q[][] a) {
    final int n = a.length;
    final int[] entries = new int[n * n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        if (!a[i][j].isInteger() || a[i][j].num().bitLength() >= 16) {
          return null;
        }
        entries[n * i + j] = a[i][j].num().intValue();
      }
    }
    final Q[] traces = new Q[n];
    int[] power = entries.clone();
    int[] next = new int[entries.length];
    for (int k = 0; k < n; ++k) {
      long trace = 0;
      for (int i = 0; i < n; ++i) {
        trace += power[n * i + i];
      }
      traces[k] = new Q(trace);
      if (k + 1 < n) {
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < n; ++j) {
            long sum = 0;
            for (int h = 0; h < n; ++h) {
              sum += (long) power[n * i + h] * entries[n * h + j];
            }
            // Preserve the integer accumulator bound at every next power.
            if (sum < Short.MIN_VALUE || sum > Short.MAX_VALUE) {
              return null;
            }
            next[n * i + j] = (int) sum;
          }
        }
        final int[] swap = power;
        power = next;
        next = swap;
      }
    }
    return traces;
  }

  private static Q[] spectrum(final Q[][] a) {
    final Q[] integers = integralSpectrum(a);
    if (integers != null) {
      return integers;
    }
    final Q[] traces = new Q[a.length];
    Q[][] power = a;
    for (int i = 0; i < a.length; ++i) {
      traces[i] = trace(power);
      if (i + 1 < a.length) {
        power = product(power, a);
      }
    }
    return traces;
  }

  private static List<Q[][]> elements(final Q[][][] generators, final int n, final int order, final Set<MatrixKey> seen) {
    final Q[][] id = new Q[n][n];
    for (int i = 0; i < n; ++i) {
      Arrays.fill(id[i], Q.ZERO);
      id[i][i] = Q.ONE;
    }
    final List<Q[][]> result = new ArrayList<>();
    seen.add(new MatrixKey(id));
    result.add(id);
    for (int i = 0; i < result.size(); ++i) {
      for (final Q[][] g : generators) {
        final Q[][] next = product(result.get(i), g);
        if (seen.add(new MatrixKey(next))) {
          if (result.size() >= order) {
            throw new IllegalArgumentException("The target group exceeds the supplied order");
          }
          result.add(next);
        }
      }
    }
    if (result.size() != order) {
      throw new IllegalArgumentException("The target generators do not attain the supplied order");
    }
    return result;
  }

  private static Optional<Q[][]> select(final Q[][][] source, final List<List<Q[][]>> candidates,
                                        final int[] order, final Q[][] pairTraces, final int depth, final Q[][][] target) {
    if (depth == order.length) {
      return RationalGroupIntertwiner.find(source, target);
    }
    final int index = order[depth];
    for (final Q[][] matrix : candidates.get(index)) {
      boolean compatible = true;
      for (int i = 0; i < depth; ++i) {
        if (!traceProduct(matrix, target[order[i]]).equals(pairTraces[index][order[i]])) {
          compatible = false;
          break;
        }
      }
      if (compatible) {
        target[index] = matrix;
        final Optional<Q[][]> witness = select(source, candidates, order, pairTraces, depth + 1, target);
        if (witness.isPresent()) {
          return witness;
        }
      }
    }
    return Optional.empty();
  }

  static Optional<Q[][]> find(final Q[][][] source, final Q[][][] target, final int targetOrder) {
    return find(source, new Target(target, source[0].length, targetOrder));
  }

  static Optional<Q[][]> find(final Q[][][] source, final Target target) {
    if (Arrays.stream(source).allMatch(g -> target.mMembers.contains(new MatrixKey(g)))) {
      return Optional.of(target.mElements.get(0));
    }
    final List<List<Q[][]>> candidates = new ArrayList<>();
    final Q[][] pairTraces = new Q[source.length][source.length];
    for (int i = 0; i < source.length; ++i) {
      final List<Q[][]> images = target.spectra().getOrDefault(List.of(spectrum(source[i])), List.of());
      if (images.isEmpty()) {
        return Optional.empty();
      }
      candidates.add(images);
      for (int j = 0; j < i; ++j) {
        pairTraces[i][j] = pairTraces[j][i] = traceProduct(source[i], source[j]);
      }
    }
    // A conjugating matrix must transport each marked generator into the
    // target. Testing all surviving tuples proves both outcomes; no abstract
    // subgroup labels or precomputed conjugacy answers are needed.
    final int[] order = IntStream.range(0, source.length).boxed()
      .sorted((a, b) -> Integer.compare(candidates.get(a).size(), candidates.get(b).size())).mapToInt(Integer::intValue).toArray();
    return select(source, candidates, order, pairTraces, 0, new Q[source.length][][]);
  }
}
