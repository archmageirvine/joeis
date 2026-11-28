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
import java.util.function.Predicate;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Exact element characteristic-polynomial counts in small matrix groups and their index-two subgroups.
 * @author Gregory Morse
 */
final class RationalIndexTwoSpectra {

  private static final int PRIME = 67;
  private static final Z MODULUS = Z.valueOf(PRIME);
  private static final int ORBIT_LIMIT = 3000;
  static final int GROUP_LIMIT = 200000;
  static final int STREAM_LIMIT = 4000000;

  private RationalIndexTwoSpectra() { }

  private static final class Key {
    private final char[] mWord;
    private final int mHash;

    private Key(final char[] word) {
      mWord = word;
      mHash = Arrays.hashCode(word);
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Key && Arrays.equals(mWord, ((Key) obj).mWord);
    }
  }

  private static int mod(final int a) {
    return Math.floorMod(a, PRIME);
  }

  private static int inverse(final int a) {
    int result = 1;
    for (int i = 0; i < PRIME - 2; ++i) {
      result = mod(result * a);
    }
    return result;
  }

  private static char[] action(final char[] v, final int[][] a) {
    final char[] result = new char[v.length];
    for (int i = 0; i < v.length; ++i) {
      int value = 0;
      for (int j = 0; j < v.length; ++j) {
        value += v[j] * a[j][i];
      }
      result[i] = (char) mod(value);
    }
    return result;
  }

  private static int insert(final int[][] basis, final int[] w) {
    for (int i = 0; i < basis.length; ++i) {
      if (w[i] != 0) {
        if (basis[i] == null) {
          final int scale = inverse(w[i]);
          for (int j = i; j < w.length; ++j) {
            w[j] = mod(w[j] * scale);
          }
          basis[i] = w;
          return i;
        }
        final int scale = w[i];
        for (int j = i; j < w.length; ++j) {
          w[j] = mod(w[j] - scale * basis[i][j]);
        }
      }
    }
    return -1;
  }

  private static final class Orbit {
    private final char[][] mGenerators;
    private final int[] mBasisPoints;
    private final int[][] mCoordinates;
    private final List<char[]> mVectors;
    private final Map<Key, Integer> mPoints;

    private Orbit(final char[][] generators, final int[] basisPoints, final int[][] coordinates) {
      this(generators, basisPoints, coordinates, List.of(), Map.of());
    }

    private Orbit(final char[][] generators, final int[] basisPoints, final int[][] coordinates,
                  final List<char[]> vectors, final Map<Key, Integer> points) {
      mGenerators = generators;
      mBasisPoints = basisPoints;
      mCoordinates = coordinates;
      mVectors = vectors;
      mPoints = points;
    }

    private Key spectrum(final char[] permutation) {
      final int n = mBasisPoints.length;
      final int[] positions = mBasisPoints.clone();
      final char[] traces = new char[n];
      for (int k = 0; k < n; ++k) {
        int v = 0;
        for (int j = 0; j < n; ++j) {
          positions[j] = permutation[positions[j]];
          v += mCoordinates[positions[j]][j];
        }
        // Trace of a finite rational matrix is an integer of absolute
        // value at most n. With p > 2n a residue is its exact signature.
        traces[k] = (char) mod(v);
        if (traces[k] > n && PRIME - traces[k] > n) {
          throw new IllegalStateException("Trace is not that of a finite rational matrix");
        }
      }
      return new Key(traces);
    }
  }

  private static Orbit orbit(final int[][][] generators, final char[] seed, final int limit) {
    final int n = seed.length;
    final char[][] permutation = new char[generators.length][limit];
    final List<char[]> vectors = new ArrayList<>();
    final Map<Key, Integer> index = new HashMap<>();
    vectors.add(seed);
    index.put(new Key(seed), 0);
    for (int q = 0; q < vectors.size(); ++q) {
      for (int j = 0; j < generators.length; ++j) {
        final char[] next = action(vectors.get(q), generators[j]);
        final Integer old = index.putIfAbsent(new Key(next), vectors.size());
        if (old == null) {
          if (vectors.size() >= limit) {
            return null;
          }
          permutation[j][q] = (char) vectors.size();
          vectors.add(next);
        } else {
          permutation[j][q] = (char) old.intValue();
        }
      }
    }
    final int[] points = new int[n];
    final int[][] inverse = new int[n][];
    int rank = 0;
    for (int i = 0; i < vectors.size() && rank < n; ++i) {
      final int[] row = new int[2 * n];
      for (int j = 0; j < n; ++j) {
        row[j] = vectors.get(i)[j];
      }
      row[n + rank] = 1;
      if (insert(inverse, row) >= 0) {
        points[rank++] = i;
      }
    }
    if (rank != n) {
      return null;
    }
    for (int k = n - 1; k >= 0; --k) {
      for (int i = 0; i < k; ++i) {
        final int scale = inverse[i][k];
        for (int j = k; j < 2 * n; ++j) {
          inverse[i][j] = mod(inverse[i][j] - scale * inverse[k][j]);
        }
      }
    }
    final int[][] coordinates = new int[vectors.size()][n];
    for (int i = 0; i < vectors.size(); ++i) {
      for (int j = 0; j < n; ++j) {
        int s = 0;
        for (int k = 0; k < n; ++k) {
          s += vectors.get(i)[k] * inverse[k][n + j];
        }
        coordinates[i][j] = mod(s);
      }
    }
    return new Orbit(Arrays.stream(permutation).map(p -> Arrays.copyOf(p, vectors.size())).toArray(char[][]::new), points, coordinates, vectors, index);
  }

  private static int[][][] reduce(final Q[][][] a) {
    final int n = a[0].length;
    final int[][][] result = new int[a.length][n][n];
    for (int k = 0; k < a.length; ++k) {
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
          if (!a[k][i][j].isInteger()) {
            return null;
          }
          result[k][i][j] = a[k][i][j].toZ().mod(MODULUS).intValueExact();
        }
      }
    }
    return result;
  }

  static Optional<Census> sylow(final Q[][][] group, final List<Q> seed, final Q[][][] suggested,
                                 final Z order, final int prime) {
    if (!prime(prime) || group[0].length >= PRIME / 2 || suggested.length == 0 || suggested.length > 32
      || seed.stream().anyMatch(v -> !v.isInteger())) {
      return Optional.empty();
    }
    final int[][][] g = reduce(group);
    final int[][][] s = reduce(suggested);
    if (g == null || s == null) {
      return Optional.empty();
    }
    final char[] vector = new char[seed.size()];
    for (int i = 0; i < vector.length; ++i) {
      vector[i] = (char) seed.get(i).toZ().mod(MODULUS).intValueExact();
    }
    final Orbit orbit = orbit(g, vector, 4500);
    if (orbit == null) {
      return Optional.empty();
    }
    int cardinality = 1;
    Z cofactor = order;
    while (cofactor.mod(prime) == 0) {
      cofactor = cofactor.divide(prime);
      if ((long) cardinality * prime * orbit.mVectors.size() > 100000000) {
        return Optional.empty();
      }
      cardinality *= prime;
    }
    final int size = orbit.mVectors.size();
    final char[][] images = new char[s.length][size];
    for (int k = 0; k < s.length; ++k) {
      final BitSet seen = new BitSet();
      for (int i = 0; i < size; ++i) {
        final Integer other = orbit.mPoints.get(new Key(action(orbit.mVectors.get(i), s[k])));
        if (other == null || seen.get(other)) {
          return Optional.empty();
        }
        seen.set(other);
        images[k][i] = (char) other.intValue();
      }
    }
    final Optional<RationalOrbitStabilizers> chain = RationalOrbitStabilizers.certify(orbit.mGenerators, orbit.mBasisPoints, order);
    if (chain.isEmpty() || Arrays.stream(images).anyMatch(p -> !chain.orElseThrow().contains(p))) {
      return Optional.empty();
    }
    // The computed ambient order equals the rational group order.
    // Hence the reduction is faithful and membership sifting certifies
    // that every suggested generator is in the image.
    final Orbit subgroup = new Orbit(images, orbit.mBasisPoints, orbit.mCoordinates);
    return Optional.of(new Census(subgroup, cardinality, false, false));
  }

  private static char[] compose(final char[] a, final char[] b) {
    final char[] result = new char[a.length];
    for (int i = 0; i < a.length; ++i) {
      result[i] = b[a[i]];
    }
    return result;
  }

  private static char[] power(final char[] x, int exponent) {
    char[] result = new char[x.length];
    for (int i = 0; i < result.length; ++i) {
      result[i] = (char) i;
    }
    char[] base = x;
    while (exponent != 0) {
      if ((exponent & 1) != 0) {
        result = compose(result, base);
      }
      exponent >>>= 1;
      if (exponent != 0) {
        base = compose(base, base);
      }
    }
    return result;
  }

  private static char[] inverse(final char[] x) {
    final char[] result = new char[x.length];
    for (int i = 0; i < result.length; ++i) {
      result[x[i]] = (char) i;
    }
    return result;
  }

  private static boolean intertwines(final Orbit orbit, final char[] a, final char[] x, final char[] b) {
    for (final int p : orbit.mBasisPoints) {
      if (x[a[p]] != b[x[p]]) {
        return false;
      }
    }
    return true;
  }

  private static final class Conjugation implements RationalOrbitStabilizers.ImageConstraint {
    private final Orbit mOrbit;
    private final int mPeriod;
    private final int[][] mDependencies;
    private final char[][] mPowers;

    private Conjugation(final Orbit orbit, final int[] base, final char[] from, final char[] to, final int period) {
      mOrbit = orbit;
      mPeriod = period;
      mPowers = new char[period][];
      mPowers[0] = power(to, 0);
      for (int k = 1; k < period; ++k) {
        mPowers[k] = compose(mPowers[k - 1], to);
      }
      final int n = mOrbit.mBasisPoints.length;
      final int[][] pivots = new int[n][];
      mDependencies = new int[n][];
      for (int i = 0; i < n; ++i) {
        final int[] relation = augmented(orbit.mVectors.get(base[i]), n * (period + 1));
        for (int j = 0; j < n; ++j) {
          if (relation[j] != 0) {
            if (pivots[j] == null) {
              break;
            }
            final int c = relation[j];
            for (int k = j; k < relation.length; ++k) {
              relation[k] = mod(relation[k] - c * pivots[j][k]);
            }
          }
        }
        if (Arrays.stream(relation, 0, n).allMatch(x -> x == 0)) {
          mDependencies[i] = Arrays.copyOfRange(relation, n, n + period * i);
        } else {
          int point = base[i];
          for (int j = 0; j < period; ++j) {
            final int[] row = augmented(orbit.mVectors.get(point), relation.length);
            row[n + i * period + j] = 1;
            insert(pivots, row);
            point = from[point];
          }
        }
      }
    }

    private static int[] orderedBase(final Orbit orbit, final char[] x, final int period) {
      final int n = orbit.mBasisPoints.length;
      final int[][] rows = new int[n][];
      final int[] base = new int[n];
      int rank = 0;
      for (final int start : orbit.mBasisPoints) {
        int point = start;
        for (int i = 0; i < period; ++i) {
          if (insert(rows, augmented(orbit.mVectors.get(point), n)) >= 0) {
            base[rank++] = point;
            if (rank == n) {
              return base;
            }
          }
          point = x[point];
        }
      }
      throw new IllegalStateException("Orbit basis does not span");
    }

    private static int[] augmented(final char[] vector, final int length) {
      final int[] row = new int[length];
      for (int i = 0; i < vector.length; ++i) {
        row[i] = vector[i];
      }
      return row;
    }

    @Override
    public int image(final int level, final int[] images) {
      final int[] relation = mDependencies[level];
      if (relation == null) {
        return -2;
      }
      final int n = mOrbit.mBasisPoints.length;
      final int[] vector = new int[n];
      for (int r = 0; r < relation.length; ++r) {
        if (relation[r] != 0) {
          final char[] point = mOrbit.mVectors.get(mPowers[r % mPeriod][images[r / mPeriod]]);
          for (int i = 0; i < n; ++i) {
            vector[i] -= relation[r] * point[i];
          }
        }
      }
      final char[] v = new char[n];
      for (int i = 0; i < n; ++i) {
        v[i] = (char) mod(vector[i]);
      }
      return mOrbit.mPoints.getOrDefault(new Key(v), -1);
    }
  }

  private static void addRelation(final int[] relations, int e) {
    while (e != 0) {
      final int b = Integer.numberOfTrailingZeros(e);
      if (relations[b] == 0) {
        relations[b] = e;
        return;
      }
      e ^= relations[b];
    }
  }

  static final class Census {
    private final Map<Key, Integer> mSpectrum = new HashMap<>();
    private final List<Map<Key, Integer>> mIndexTwo = new ArrayList<>();
    private final Detailed mDetailed;
    private final boolean mIndexKnown;

    private Census() {
      mDetailed = null;
      mIndexKnown = false;
    }

    private Census(final Orbit orbit, final int order, final boolean detailed, final boolean indexKernels) {
      mIndexKnown = indexKernels;
      final char[][] permutations = orbit.mGenerators;
      final int generators = permutations.length;
      final int[] relations = new int[generators];
      final int[] words = new int[order];
      final List<char[]> elements = new ArrayList<>();
      final Map<Key, Integer> known = new HashMap<>();
      final char[] identity = new char[permutations[0].length];
      for (int i = 0; i < identity.length; ++i) {
        identity[i] = (char) i;
      }
      elements.add(identity);
      known.put(new Key(identity), 0);
      for (int i = 0; i < elements.size(); ++i) {
        for (int j = 0; j < generators; ++j) {
          final char[] next = compose(elements.get(i), permutations[j]);
          final Integer old = known.putIfAbsent(new Key(next), elements.size());
          final int word = indexKernels ? words[i] ^ (1 << j) : 0;
          if (old == null) {
            if (elements.size() >= order) {
              throw new IllegalStateException("Permutation action exceeds the stated group order");
            }
            words[elements.size()] = word;
            elements.add(next);
          } else if (indexKernels) {
            addRelation(relations, word ^ words[old]);
          }
        }
      }
      if (elements.size() != order) {
        throw new IllegalStateException("Spanning modular action did not attain the stated group order");
      }
      final List<Integer> characters = new ArrayList<>();
      for (int chi = 1; indexKernels && chi < (1 << generators); ++chi) {
        boolean valid = true;
        for (final int relation : relations) {
          if ((Integer.bitCount(chi & relation) & 1) != 0) {
            valid = false;
            break;
          }
        }
        if (valid) {
          characters.add(chi);
          mIndexTwo.add(new HashMap<>());
        }
      }
      final int[] kernelSizes = new int[characters.size()];
      final Key[] signatures = detailed ? new Key[order] : null;
      for (int i = 0; i < elements.size(); ++i) {
        final Key signature = orbit.spectrum(elements.get(i));
        if (signatures != null) {
          signatures[i] = signature;
        }
        mSpectrum.merge(signature, 1, Integer::sum);
        for (int j = 0; j < characters.size(); ++j) {
          if ((Integer.bitCount(words[i] & characters.get(j)) & 1) == 0) {
            mIndexTwo.get(j).merge(signature, 1, Integer::sum);
            ++kernelSizes[j];
          }
        }
      }
      if (Arrays.stream(kernelSizes).anyMatch(x -> 2 * x != order)) {
        throw new IllegalStateException("A nonzero binary character has the wrong kernel size");
      }
      mDetailed = detailed ? new Detailed(orbit, elements, known, words, characters, signatures) : null;
    }

    boolean excludes(final Census candidate, final boolean indexTwo) {
      if (indexTwo && mIndexKnown) {
        return mIndexTwo.stream().noneMatch(candidate.mSpectrum::equals);
      }
      return candidate.mSpectrum.entrySet().stream().anyMatch(e -> e.getValue() > mSpectrum.getOrDefault(e.getKey(), 0));
    }

    boolean hasSpectrum(final Predicate<int[]> test) {
      for (final Key k : mSpectrum.keySet()) {
        if (test.test(traces(k))) {
          return true;
        }
      }
      return false;
    }

    boolean exceeds(final RationalBlockSpectra.SpectrumTable table) {
      return mSpectrum.entrySet().stream().anyMatch(e -> table.frequency(traces(e.getKey())).compareTo(Z.valueOf(e.getValue())) < 0);
    }

    private static int[] traces(final Key k) {
      final int[] t = new int[k.mWord.length];
      for (int i = 0; i < t.length; ++i) {
        t[i] = k.mWord[i] <= t.length ? k.mWord[i] : k.mWord[i] - PRIME;
      }
      return t;
    }

    boolean excludesTwoBlockAction(final RationalBlockSpectra.LocalHull target) {
      if (!mIndexKnown) {
        return false;
      }
      final Map<Key, Integer> possible = new HashMap<>();
      for (final Map<Key, Integer> kernel : mIndexTwo) {
        boolean viable = true;
        for (final Map.Entry<Key, Integer> entry : mSpectrum.entrySet()) {
          final Key k = entry.getKey();
          final int inside = kernel.getOrDefault(k, 0);
          final int verdict = possible.computeIfAbsent(k, key -> {
            final int[] t = traces(key);
            return (target.fitsTwo(t, false) ? 1 : 0) | (target.fitsTwo(t, true) ? 2 : 0);
          });
          if (inside != 0 && (verdict & 1) == 0 || inside < entry.getValue() && (verdict & 2) == 0) {
            viable = false;
            break;
          }
        }
        if (viable) {
          return false;
        }
      }
      // A rationally irreducible action on two blocks is transitive,
      // so it would provide a nonzero binary character on the source.
      return true;
    }

    int frequency(final int[] trace) {
      final char[] residues = new char[trace.length];
      for (int i = 0; i < trace.length; ++i) {
        residues[i] = (char) mod(trace[i]);
      }
      return mSpectrum.getOrDefault(new Key(residues), 0);
    }
  }

  static Optional<Census> census(final Q[][][] group, final List<Q> seed, final int order) {
    return census(group, seed, order, false);
  }

  static Optional<Census> streamed(final Q[][][] group, final List<Q> seed, final int order) {
    if (order > STREAM_LIMIT || group[0].length >= PRIME / 2 || seed == null || seed.stream().anyMatch(v -> !v.isInteger())) {
      return Optional.empty();
    }
    final int[][][] g = reduce(group);
    if (g == null) {
      return Optional.empty();
    }
    final char[] vector = new char[seed.size()];
    for (int i = 0; i < vector.length; ++i) {
      vector[i] = (char) seed.get(i).toZ().mod(MODULUS).intValueExact();
    }
    final Orbit orbit = orbit(g, vector, 4500);
    if (orbit == null) {
      return Optional.empty();
    }
    return RationalOrbitStabilizers.certify(orbit.mGenerators, orbit.mBasisPoints, Z.valueOf(order)).map(chain -> {
      final Census result = new Census();
      chain.forEach(x -> result.mSpectrum.merge(orbit.spectrum(x), 1, Integer::sum));
      if (result.mSpectrum.values().stream().mapToInt(Integer::intValue).sum() != order) {
        throw new IllegalStateException("The streamed spectrum has the wrong number of elements");
      }
      return result;
    });
  }

  private static Optional<Census> census(final Q[][][] group, final List<Q> seed, final int order, final boolean detailed) {
    final int n = group[0].length;
    if (n >= PRIME / 2 || group.length > 12 || order < 1 || order > GROUP_LIMIT) {
      return Optional.empty();
    }
    // A stored permutation has two bytes per orbit point. Bound the
    // retained permutation words before attempting larger vector orbits.
    final int limit = Math.min(ORBIT_LIMIT, 165000000 / order);
    final int[][][] modular = reduce(group);
    if (modular == null) {
      return Optional.empty();
    }
    if (seed != null && seed.stream().allMatch(Q::isInteger)) {
      final char[] reduced = new char[n];
      for (int j = 0; j < n; ++j) {
        reduced[j] = (char) seed.get(j).toZ().mod(MODULUS).intValueExact();
      }
      final Orbit o = orbit(modular, reduced, limit);
      if (o != null) {
        return Optional.of(new Census(o, order, detailed, true));
      }
    }
    for (int i = 0; i < Math.min(n, 4); ++i) {
      final char[] e = new char[n];
      e[i] = 1;
      final Orbit o = orbit(modular, e, limit);
      if (o != null) {
        return Optional.of(new Census(o, order, detailed, true));
      }
    }
    return Optional.empty();
  }

  private static final class Detailed {
    private final Orbit mOrbit;
    private final List<char[]> mElements;
    private final Map<Key, Integer> mKnown;
    private final int[] mWords;
    private final List<Integer> mCharacters;
    private final Key[] mSignatures;

    private Detailed(final Orbit orbit, final List<char[]> elements, final Map<Key, Integer> known, final int[] words,
                     final List<Integer> characters, final Key[] signatures) {
      mOrbit = orbit;
      mElements = elements;
      mKnown = known;
      mWords = words;
      mCharacters = characters;
      mSignatures = signatures;
    }

    private int multiply(final int a, final int b) {
      return mKnown.get(new Key(compose(mElements.get(a), mElements.get(b))));
    }

    private int trace(final int x) {
      return mSignatures[x].mWord[0];
    }

    private int traceProduct(final int a, final int b) {
      final char[] x = mElements.get(a);
      final char[] y = mElements.get(b);
      int v = 0;
      for (int k = 0; k < mOrbit.mBasisPoints.length; ++k) {
        v += mOrbit.mCoordinates[y[x[mOrbit.mBasisPoints[k]]]][k];
      }
      return mod(v);
    }

    private boolean inKernel(final int x, final int character) {
      return (Integer.bitCount(mWords[x] & character) & 1) == 0;
    }

    private boolean hasPrimeCyclotomicSpectrum(final int x) {
      for (final char trace : mSignatures[x].mWord) {
        if (trace != PRIME - 1) {
          return false;
        }
      }
      return true;
    }

    private int sylowGenerator(final int character, final int prime) {
      final int degree = mOrbit.mBasisPoints.length;
      for (int i = 1; i < mElements.size(); ++i) {
        if (inKernel(i, character)) {
          // Trace n occurs only at the identity. In degree p-1 the
          // characteristic polynomial Phi_p instead determines order p.
          if (prime <= degree ? mSignatures[i].mWord[prime - 1] == degree
            : hasPrimeCyclotomicSpectrum(i)) {
            return i;
          }
        }
      }
      return -1;
    }

    private int negation() {
      final int minusN = mod(-mOrbit.mBasisPoints.length);
      for (int i = 0; i < mElements.size(); ++i) {
        if (trace(i) == minusN) {
          return i;
        }
      }
      return -1;
    }

    private int[] powers(final int x, final int p) {
      final int[] result = new int[p];
      for (int i = 1; i < p; ++i) {
        result[i] = multiply(result[i - 1], x);
      }
      return result;
    }
  }

  private static final class Marking {
    private final int[] mGenerators;
    private final int[] mQueue;
    private final int[] mParent;
    private final int[] mLetter;
    private final int[][] mEdges;

    private Marking(final Detailed group, final int z, final int x, final int y) {
      this(group, new int[] {z, x, y});
    }

    private Marking(final Detailed group, final int[] generators) {
      final int size = group.mElements.size();
      mGenerators = generators;
      final int[] queue = new int[size];
      final BitSet seen = new BitSet(size);
      mParent = new int[size];
      mLetter = new int[size];
      mEdges = new int[size][mGenerators.length];
      int end = 1;
      seen.set(0);
      for (int i = 0; i < end; ++i) {
        final int v = queue[i];
        for (int j = 0; j < mGenerators.length; ++j) {
          final int w = group.multiply(v, mGenerators[j]);
          mEdges[v][j] = w;
          if (!seen.get(w)) {
            seen.set(w);
            mParent[w] = v;
            mLetter[w] = j;
            queue[end++] = w;
          }
        }
      }
      mQueue = Arrays.copyOf(queue, end);
    }

    private boolean sameCharacter(final Detailed source, final Orbit orbit, final char[][] generators) {
      final char[][] images = new char[mQueue.length][];
      images[0] = power(generators[0], 0);
      final Set<Key> seen = new HashSet<>();
      seen.add(new Key(images[0]));
      for (int i = 1; i < mQueue.length; ++i) {
        final int v = mQueue[i];
        final char[] x = compose(images[mParent[v]], generators[mLetter[v]]);
        if (!seen.add(new Key(x)) || !source.mSignatures[v].equals(orbit.spectrum(x))) {
          return false;
        }
        images[v] = x;
      }
      for (int i = 0; i < images.length; ++i) {
        for (int j = 0; j < generators.length; ++j) {
          for (final int p : orbit.mBasisPoints) {
            if (generators[j][images[i][p]] != images[mEdges[i][j]][p]) {
              return false;
            }
          }
        }
      }
      return true;
    }

    private boolean sameCharacter(final Detailed source, final Detailed target, final int[] targetGenerators) {
      final int[] map = new int[mQueue.length];
      final BitSet seen = new BitSet();
      seen.set(0);
      for (int i = 1; i < mQueue.length; ++i) {
        final int v = mQueue[i];
        final int image = target.multiply(map[mParent[v]], targetGenerators[mLetter[v]]);
        if (seen.get(image) || source.trace(v) != target.trace(image)) {
          return false;
        }
        seen.set(image);
        map[v] = image;
      }
      for (int i = 0; i < map.length; ++i) {
        for (int j = 0; j < targetGenerators.length; ++j) {
          if (target.multiply(map[i], targetGenerators[j]) != map[mEdges[i][j]]) {
            return false;
          }
        }
      }
      return true;
    }
  }

  private static int gcd(int a, int b) {
    while (b != 0) {
      final int t = a % b;
      a = b;
      b = t;
    }
    return a;
  }

  private static final class TorusMarking {
    private final Detailed mSource;
    private final Marking mMarking;
    private final int[] mPowers;
    private final int[] mExponents;
    private final int mPeriod;

    private TorusMarking(final Detailed source, final Marking marking, final int[] powers, final int[] exponents, final int period) {
      mSource = source;
      mMarking = marking;
      mPowers = powers;
      mExponents = exponents;
      mPeriod = period;
    }

    private boolean possible(final Orbit target, final RationalOrbitStabilizers chain, final char[] x) {
      final char[][] generators = {x, null, null};
      final List<List<char[]>> choices = new ArrayList<>();
      for (int i = 1; i < generators.length; ++i) {
        final List<char[]> matches = new ArrayList<>();
        final Key signature = mSource.mSignatures[mMarking.mGenerators[i]];
        final char[] conjugate = power(x, mExponents[mMarking.mGenerators[i]]);
        if (!chain.forEach(new Conjugation(target, target.mBasisPoints, x, conjugate, mPeriod), g -> {
          if (intertwines(target, x, g, conjugate) && target.spectrum(g).equals(signature)) {
            matches.add(g);
          }
        }, 100000) || matches.size() > 1000) {
          return true;
        }
        if (matches.isEmpty()) {
          return false;
        }
        choices.add(matches);
      }
      if ((long) choices.get(0).size() * choices.get(1).size() > 20000) {
        return true;
      }
      for (final char[] y : choices.get(0)) {
        generators[1] = y;
        for (final char[] z : choices.get(1)) {
          generators[2] = z;
          if (mMarking.sameCharacter(mSource, target, generators)) {
            return true;
          }
        }
      }
      return false;
    }
  }

  private static TorusMarking torusMarking(final Detailed group, final int period) {
    final int size = group.mElements.size();
    if (size != 4 * period) {
      return null;
    }
    for (int x = 1; x < size; ++x) {
      final int[] powers = group.powers(x, period + 1);
      if (powers[period] != 0 || Arrays.stream(powers, 1, period).anyMatch(y -> y == 0)) {
        continue;
      }
      final int[] exponents = new int[size];
      Arrays.fill(exponents, -1);
      boolean normal = true;
      for (int y = 0; y < size; ++y) {
        final int xy = group.multiply(x, y);
        for (int r = 1; r < period; ++r) {
          if (gcd(r, period) == 1 && group.multiply(y, powers[r]) == xy) {
            exponents[y] = r;
            break;
          }
        }
        if (exponents[y] < 0) {
          normal = false;
          break;
        }
      }
      if (!normal) {
        continue;
      }
      for (final char[] y : group.mOrbit.mGenerators) {
        for (final char[] z : group.mOrbit.mGenerators) {
          final Marking marking = new Marking(group, new int[] {x, group.mKnown.get(new Key(y)), group.mKnown.get(new Key(z))});
          if (marking.mQueue.length == size) {
            return new TorusMarking(group, marking, powers, exponents, period);
          }
        }
      }
    }
    return null;
  }

  private static List<char[]> enumerateSubgroup(final Orbit orbit, final RationalOrbitStabilizers chain,
                                                final int[][][] generators, final int order) {
    final List<char[]> moves = new ArrayList<>();
    for (final int[][] matrix : generators) {
      final char[] g = new char[orbit.mVectors.size()];
      final BitSet seen = new BitSet();
      for (int i = 0; i < g.length; ++i) {
        final Integer index = orbit.mPoints.get(new Key(action(orbit.mVectors.get(i), matrix)));
        if (index == null || seen.get(index)) {
          return List.of();
        }
        seen.set(index);
        g[i] = (char) index.intValue();
      }
      if (!chain.contains(g)) {
        return List.of();
      }
      moves.add(g);
    }
    final List<char[]> group = new ArrayList<>();
    final Set<Key> known = new HashSet<>();
    group.add(power(orbit.mGenerators[0], 0));
    known.add(new Key(group.get(0)));
    for (int i = 0; i < group.size(); ++i) {
      for (final char[] g : moves) {
        final char[] w = compose(group.get(i), g);
        if (known.add(new Key(w))) {
          if (group.size() >= order) {
            return List.of();
          }
          group.add(w);
        }
      }
    }
    return group.size() == order ? group : List.of();
  }

  private static char[] permutationOf(final Orbit orbit, final Q[][] matrix) {
    final int[][][] reduced = reduce(new Q[][][] {matrix});
    if (reduced == null) {
      return null;
    }
    final char[] p = new char[orbit.mVectors.size()];
    final BitSet used = new BitSet();
    for (int i = 0; i < p.length; ++i) {
      final Integer j = orbit.mPoints.get(new Key(action(orbit.mVectors.get(i), reduced[0])));
      if (j == null || used.get(j)) {
        return null;
      }
      used.set(j);
      p[i] = (char) j.intValue();
    }
    return p;
  }

  static final class QuotientClass {
    private final Q[][] mLift;
    private final Z mMultiplicity;

    QuotientClass(final Q[][] lift, final Z multiplicity) {
      mLift = lift;
      mMultiplicity = multiplicity;
    }
  }

  private static Z fibreMass(final Orbit orbit, final RationalOrbitStabilizers chain, final Z order, final Key signature,
                             final Q[][][] radical, final int radicalOrder, final List<QuotientClass> classes) {
    if (radical.length == 0 || classes.isEmpty()) {
      return null;
    }
    final int[][][] reduced = reduce(radical);
    if (reduced == null || radicalOrder <= 0 || order.mod(radicalOrder) != 0) {
      return null;
    }
    final List<char[]> group = enumerateSubgroup(orbit, chain, reduced, radicalOrder);
    if (group.isEmpty()) {
      return null;
    }
    final Set<Key> normal = new HashSet<>();
    for (final char[] r : group) {
      normal.add(new Key(r));
    }
    for (final char[] g : orbit.mGenerators) {
      final char[] back = inverse(g);
      for (final Q[][] matrix : radical) {
        final char[] r = permutationOf(orbit, matrix);
        if (!normal.contains(new Key(compose(compose(back, r), g)))) {
          return null;
        }
      }
    }
    final Z quotient = order.divide(radicalOrder);
    Z mass = Z.ZERO;
    Z visited = Z.ZERO;
    final List<char[]> previous = new ArrayList<>();
    for (final QuotientClass c : classes) {
      if (c.mMultiplicity.signum() <= 0 || !quotient.mod(c.mMultiplicity).isZero()) {
        return null;
      }
      final char[] lift = permutationOf(orbit, c.mLift);
      if (lift == null || !chain.contains(lift)) {
        return null;
      }
      final char[] back = inverse(lift);
      for (final char[] other : previous) {
        if (normal.contains(new Key(compose(other, back)))) {
          return null;
        }
      }
      previous.add(lift);
      visited = visited.add(c.mMultiplicity);
      int count = 0;
      for (final char[] r : group) {
        if (orbit.spectrum(compose(r, lift)).equals(signature)) {
          ++count;
        }
      }
      mass = mass.add(c.mMultiplicity.multiply(count));
    }
    // Conjugate quotient elements have conjugate entire fibres.
    // A complete quotient class inventory therefore supplies the
    // weight for each enumerated fibre, not a target character value.
    return visited.equals(quotient) ? mass : null;
  }

  static boolean excludesCoveredCyclic(final Q[][][] source, final List<Q> sourceSeed, final int order,
                                       final Q[][][] target, final List<Q> seed, final Z targetOrder, final Q[][] marked,
                                       final int period, final Z characterMass, final Q[][][] radical, final int radicalOrder,
                                       final List<QuotientClass> classes) {
    final Optional<Census> a = census(source, sourceSeed, order, true);
    final int[][][] g = reduce(target);
    if (a.isEmpty() || g == null || seed.stream().anyMatch(x -> !x.isInteger())) {
      return false;
    }
    final TorusMarking marking = torusMarking(a.orElseThrow().mDetailed, period);
    if (marking == null) {
      return false;
    }
    final char[] vector = new char[seed.size()];
    for (int i = 0; i < vector.length; ++i) {
      vector[i] = (char) seed.get(i).toZ().mod(MODULUS).intValueExact();
    }
    final Orbit b = orbit(g, vector, 4500);
    if (b == null) {
      return cyclicNotProved(targetOrder, "vector orbit did not close");
    }
    final char[] x = permutationOf(b, marked);
    final Key signature = marking.mSource.mSignatures[marking.mMarking.mGenerators[0]];
    if (x == null || !b.spectrum(x).equals(signature)) {
      return cyclicNotProved(targetOrder, "marked spectrum does not match");
    }
    final Optional<RationalOrbitStabilizers> maybeChain = RationalOrbitStabilizers.certify(b.mGenerators, b.mBasisPoints, targetOrder);
    if (maybeChain.isEmpty()) {
      return cyclicNotProved(targetOrder, "stabilizer order did not certify");
    }
    final RationalOrbitStabilizers chain = maybeChain.orElseThrow();
    if (!chain.contains(x)) {
      return cyclicNotProved(targetOrder, "marked element did not sift");
    }
    final Z mass = characterMass == null ? fibreMass(b, chain, targetOrder, signature, radical, radicalOrder, classes) : characterMass;
    if (mass == null || mass.signum() == 0) {
      return cyclicNotProved(targetOrder, "no certified character mass");
    }
    int normalizer = 0;
    final List<char[]> primitive = new ArrayList<>();
    for (int e = 1; e < period; ++e) {
      if (gcd(e, period) == 1) {
        final char[] power = power(x, e);
        primitive.add(power);
        final int[] count = {0};
        if (!chain.forEach(new Conjugation(b, b.mBasisPoints, x, power, period), h -> {
          if (intertwines(b, x, h, power)) {
            ++count[0];
          }
        }, 160000)) {
          return cyclicNotProved(targetOrder, "normalizer search budget exceeded");
        }
        normalizer = Math.addExact(normalizer, count[0]);
      }
    }
    // Distinct cyclic subgroups have disjoint sets of generators.
    // Orbit-stabilizer gives the entire mass of this cyclic class.
    if (normalizer <= 0 || targetOrder.mod(normalizer) != 0
      || !targetOrder.divide(normalizer).multiply(primitive.size()).equals(mass)) {
      return cyclicNotProved(targetOrder, "normalizer " + normalizer + " does not cover mass " + mass);
    }
    for (final char[] y : primitive) {
      if (marking.possible(b, chain, y)) {
        return cyclicNotProved(targetOrder, "a marked generator assignment was not excluded");
      }
    }
    return true;
  }

  private static boolean cyclicNotProved(final Z targetOrder, final String reason) {
    if (Boolean.getBoolean("joeis.rational.audit.cyclicDetails")) {
      System.out.println("CYCLIC " + targetOrder + ": " + reason);
    }
    return false;
  }

  private static int root(final int[] parent, int x) {
    while (parent[x] != x) {
      parent[x] = parent[parent[x]];
      x = parent[x];
    }
    return x;
  }

  static boolean excludesPlaneInduction(final Q[][][] generators, final List<Q> seed, final int order,
                                        final int prime, final int index) {
    final Optional<Census> census = census(generators, seed, order, true);
    if (census.isEmpty() || order % index != 0 || order / index % prime != 0) {
      return false;
    }
    final Detailed group = census.orElseThrow().mDetailed;
    final int p = group.sylowGenerator(0, prime);
    final int neg = group.negation();
    if (p < 0 || neg < 0) {
      return false;
    }
    final int[] powers = group.powers(p, prime);
    final char[] x = group.mElements.get(p);
    final int[] coset = new int[order];
    Arrays.fill(coset, -1);
    final List<Integer> reps = new ArrayList<>();
    for (int i = 0; i < order; ++i) {
      if (coset[i] < 0) {
        final char[] g = group.mElements.get(i);
        for (int k = 1; k < powers.length; ++k) {
          if (intertwines(group.mOrbit, x, g, group.mElements.get(powers[k]))) {
            for (final int j : powers) {
              coset[group.multiply(i, j)] = reps.size();
            }
            reps.add(i);
            break;
          }
        }
      }
    }
    final int size = reps.size();
    if (size != order / index / prime || coset[neg] < 0 || size > 256) {
      return false;
    }
    final int[][] table = new int[size][size];
    for (int i = 0; i < size; ++i) {
      for (int j = 0; j < size; ++j) {
        table[i][j] = coset[group.multiply(reps.get(i), reps.get(j))];
        if (table[i][j] < 0) {
          return false;
        }
      }
    }
    final int[] parent = java.util.stream.IntStream.range(0, order).toArray();
    for (final char[] g : group.mOrbit.mGenerators) {
      final char[] inverse = inverse(g);
      for (int i = 0; i < order; ++i) {
        final int other = group.mKnown.get(new Key(compose(compose(inverse, group.mElements.get(i)), g)));
        parent[root(parent, i)] = root(parent, other);
      }
    }
    final Map<Integer, Integer> classes = new HashMap<>();
    for (int i = 0; i < order; ++i) {
      final int representative = root(parent, i);
      classes.putIfAbsent(representative, classes.size());
    }
    final int[][] counts = new int[classes.size()][size];
    final int[] required = new int[classes.size()];
    for (int i = 0; i < order; ++i) {
      final int c = classes.get(root(parent, i));
      final int residue = group.trace(i);
      required[c] += residue <= generators[0].length ? residue : residue - PRIME;
      if (coset[i] >= 0) {
        ++counts[c][coset[i]];
      }
    }
    return RationalPlaneInduction.excludes(table, coset[neg], counts, required, index);
  }

  private static void addElement(final int x, final BitSet seen, final List<Integer> elements) {
    if (!seen.get(x)) {
      seen.set(x);
      elements.add(x);
    }
  }

  private static BitSet generated(final Detailed group, final List<Integer> generators) {
    final BitSet seen = new BitSet();
    final List<Integer> queue = new ArrayList<>();
    addElement(0, seen, queue);
    for (int i = 0; i < queue.size(); ++i) {
      for (final int g : generators) {
        addElement(group.multiply(queue.get(i), g), seen, queue);
      }
    }
    return seen;
  }

  private static List<Integer> perfectCore(final Detailed group) {
    return derivedCore(group, false);
  }

  static boolean exceedsDerivedOrder(final Q[][][] source, final List<Q> seed, final int order, final int bound) {
    return census(source, seed, order, true).map(c -> derivedCore(c.mDetailed, true).size() > bound).orElse(false);
  }

  private static List<Integer> derivedCore(final Detailed group, final boolean firstOnly) {
    final List<Integer> generators = new ArrayList<>();
    for (final char[] g : group.mOrbit.mGenerators) {
      generators.add(group.mKnown.get(new Key(g)));
    }
    int previous = group.mElements.size();
    for (;;) {
      final List<Integer> inverses = new ArrayList<>();
      for (final int g : generators) {
        inverses.add(group.mKnown.get(new Key(inverse(group.mElements.get(g)))));
      }
      final List<Integer> commutators = new ArrayList<>();
      for (int i = 0; i < generators.size(); ++i) {
        for (int j = 0; j < i; ++j) {
          commutators.add(group.multiply(group.multiply(inverses.get(i), inverses.get(j)), group.multiply(generators.get(i), generators.get(j))));
        }
      }
      final List<Integer> core = new ArrayList<>();
      final BitSet seen = new BitSet();
      addElement(0, seen, core);
      for (int i = 0; i < core.size(); ++i) {
        final int x = core.get(i);
        for (final int c : commutators) {
          addElement(group.multiply(x, c), seen, core);
        }
        // Closure under conjugation and multiplication by the
        // commutators gives their entire normal closure.
        for (int j = 0; j < generators.size(); ++j) {
          addElement(group.multiply(group.multiply(inverses.get(j), x), generators.get(j)), seen, core);
        }
      }
      if (firstOnly || core.size() == previous || core.size() == 1) {
        return core;
      }
      previous = core.size();
      generators.clear();
      BitSet known = new BitSet();
      known.set(0);
      for (final int x : core) {
        if (!known.get(x)) {
          generators.add(x);
          known = generated(group, generators);
        }
      }
    }
  }

  private static Map<Key, Integer> subgroupSpectrum(final Detailed group, final List<Integer> subgroup) {
    final Map<Key, Integer> histogram = new HashMap<>();
    for (final int x : subgroup) {
      histogram.merge(group.mSignatures[x], 1, Integer::sum);
    }
    return histogram;
  }

  static boolean excludesInNormalizer(final Q[][][] source, final List<Q> sourceSeed, final Q[][][] normalizer,
                                      final List<Q> seed, final int order, final int coreOrder) {
    final Optional<Census> a = census(source, sourceSeed, order, true);
    final Optional<Census> b = census(normalizer, seed, order, true);
    if (a.isEmpty() || b.isEmpty()) {
      return false;
    }
    final Detailed src = a.orElseThrow().mDetailed;
    final Detailed dst = b.orElseThrow().mDetailed;
    final List<Integer> left = perfectCore(src);
    final List<Integer> right = perfectCore(dst);
    return left.size() == coreOrder && right.size() == coreOrder
      && (!a.orElseThrow().mSpectrum.equals(b.orElseThrow().mSpectrum)
        || !subgroupSpectrum(src, left).equals(subgroupSpectrum(dst, right)));
  }

  private static boolean excludesByCyclicClasses(final TorusMarking marking, final Orbit b,
                                                final RationalOrbitStabilizers chain, final Key signature) {
    final Map<Key, char[]> matches = new HashMap<>();
    final boolean[] overflow = {false};
    chain.forEach(x -> {
      if (!overflow[0] && b.spectrum(x).equals(signature)) {
        if ((long) matches.size() * x.length >= 40000000) {
          overflow[0] = true;
        } else {
          matches.put(new Key(x), x);
        }
      }
    });
    if (overflow[0]) {
      return false;
    }
    final char[][] back = Arrays.stream(b.mGenerators).map(RationalIndexTwoSpectra::inverse).toArray(char[][]::new);
    while (!matches.isEmpty()) {
      final char[] x = matches.remove(matches.keySet().iterator().next());
      if (marking.possible(b, chain, x)) {
        return false;
      }
      // A conjugate also supplies a possible embedding exactly when
      // this representative does. Remove just its verified orbit.
      final List<char[]> conjugates = new ArrayList<>();
      conjugates.add(x);
      for (int i = 0; i < conjugates.size(); ++i) {
        for (int g = 0; g < back.length; ++g) {
          final char[] y = matches.remove(new Key(compose(compose(back[g], conjugates.get(i)), b.mGenerators[g])));
          if (y != null) {
            conjugates.add(y);
          }
        }
      }
    }
    return true;
  }

  static boolean excludesNormalCyclic(final Q[][][] source, final List<Q> sourceSeed, final int sourceOrder,
                                      final Q[][][] target, final List<Q> seed, final Z targetOrder,
                                      final Q[][][] sylowGenerators, final int period, final int prime) {
    final Optional<Census> a = census(source, sourceSeed, sourceOrder, true);
    if (a.isEmpty() || !prime(prime) || period % prime != 0 || period % (prime * prime) == 0) {
      return false;
    }
    final TorusMarking marking = torusMarking(a.orElseThrow().mDetailed, period);
    final int[][][] g = reduce(target);
    final int[][][] s = reduce(sylowGenerators);
    if (marking == null || g == null || s == null || seed.stream().anyMatch(v -> !v.isInteger())) {
      return false;
    }
    final char[] vector = new char[seed.size()];
    for (int i = 0; i < vector.length; ++i) {
      vector[i] = (char) seed.get(i).toZ().mod(MODULUS).intValueExact();
    }
    final Orbit b = orbit(g, vector, 4500);
    if (b == null) {
      return false;
    }
    final Optional<RationalOrbitStabilizers> chain = RationalOrbitStabilizers.certify(b.mGenerators, b.mBasisPoints, targetOrder);
    if (chain.isEmpty()) {
      return false;
    }
    final Detailed src = marking.mSource;
    final Key fullSignature = src.mSignatures[marking.mMarking.mGenerators[0]];
    if (targetOrder.compareTo(Z.valueOf(600000)) <= 0) {
      return excludesByCyclicClasses(marking, b, chain.orElseThrow(), fullSignature);
    }
    int cardinality = 1;
    Z cofactor = targetOrder;
    while (cofactor.mod(prime) == 0) {
      cofactor = cofactor.divide(prime);
      cardinality *= prime;
      if (cardinality > 2000) {
        return false;
      }
    }
    final List<char[]> sylow = enumerateSubgroup(b, chain.orElseThrow(), s, cardinality);
    if (sylow.isEmpty()) {
      return false;
    }
    final int aPrime = marking.mPowers[period / prime];
    final Set<Key> checked = new HashSet<>();
    final char[] id = sylow.get(0);
    for (final char[] z : sylow) {
      if (!src.mSignatures[aPrime].equals(b.spectrum(z)) || !Arrays.equals(power(z, prime), id)
        || !checked.add(new Key(z))) {
        continue;
      }
      // Every image of the marked prime-order element is conjugate into
      // this Sylow subgroup. All nonidentity powers have one centralizer.
      for (int k = 2; k < prime; ++k) {
        checked.add(new Key(power(z, k)));
      }
      final int[] centralBase = Conjugation.orderedBase(b, z, prime);
      final Optional<RationalOrbitStabilizers> centralChain = Arrays.equals(centralBase, b.mBasisPoints) ? chain
        : RationalOrbitStabilizers.certify(b.mGenerators, centralBase, targetOrder);
      if (centralChain.isEmpty()) {
        return false;
      }
      final boolean[] possible = {false};
      if (!centralChain.orElseThrow().forEach(new Conjugation(b, centralBase, z, z, prime), x -> {
        if (!possible[0] && intertwines(b, z, x, z) && fullSignature.equals(b.spectrum(x))) {
          final char[] xPrime = power(x, period / prime);
          for (int k = 1; k < prime; ++k) {
            if (Arrays.equals(xPrime, power(z, k))) {
              possible[0] = marking.possible(b, chain.orElseThrow(), x);
              break;
            }
          }
        }
      }, 500000) || possible[0]) {
        return false;
      }
    }
    return true;
  }

  private static boolean prime(final int n) {
    for (int i = 2; i * i <= n; ++i) {
      if (n % i == 0) {
        return false;
      }
    }
    return n > 1;
  }

  static boolean markedExclusion(final Q[][][] source, final List<Q> sourceSeed, final Q[][][] target,
                                 final List<Q> targetSeed, final int order) {
    int p = source[0].length + 1;
    while (p > 2 && (!prime(p) || order % p != 0 || order % (p * p) == 0)) {
      --p;
    }
    if (p == 2 || 2 * order > 75000) {
      return false;
    }
    final int prime = p;
    final Optional<Census> ac = census(source, sourceSeed, order, true);
    final Optional<Census> bc = census(target, targetSeed, 2 * order, true);
    if (ac.isEmpty() || bc.isEmpty()) {
      return false;
    }
    final Detailed a = ac.orElseThrow().mDetailed;
    final Detailed b = bc.orElseThrow().mDetailed;
    final int x = a.sylowGenerator(0, prime);
    final int za = a.negation();
    final int zb = b.negation();
    if (x < 0 || za < 0 || zb < 0) {
      return false;
    }
    Marking marking = null;
    for (final char[] generator : a.mOrbit.mGenerators) {
      final int y = a.mKnown.get(new Key(generator));
      final Marking attempt = new Marking(a, za, x, y);
      if (attempt.mQueue.length == order) {
        marking = attempt;
        break;
      }
    }
    for (int y = 1; marking == null && y < Math.min(order, 96); ++y) {
      final Marking attempt = new Marking(a, za, x, y);
      if (attempt.mQueue.length == order) {
        marking = attempt;
      }
    }
    if (marking == null) {
      return false;
    }
    final int y = marking.mGenerators[2];
    final int[] xa = a.powers(x, prime);
    final int[] required = Arrays.stream(xa).map(power -> a.traceProduct(y, power)).toArray();
    int tested = 0;
    for (int i = 0; i < b.mCharacters.size(); ++i) {
      final int character = b.mCharacters.get(i);
      if (!b.inKernel(zb, character) || !bc.orElseThrow().mIndexTwo.get(i).equals(ac.orElseThrow().mSpectrum)) {
        continue;
      }
      final int u = b.sylowGenerator(character, prime);
      if (u < 0) {
        return false;
      }
      final int[] ub = b.powers(u, prime);
      // Sylow conjugacy in the index-two group fixes the image of <x>
      // up to automorphisms of this prime-order cyclic subgroup.
      for (int k = 1; k < prime; ++k) {
        for (int j = 0; j < b.mElements.size(); ++j) {
          if (b.inKernel(j, character) && a.mSignatures[y].equals(b.mSignatures[j])) {
            boolean fits = true;
            for (int power = 1; power < prime; ++power) {
              if (b.traceProduct(j, ub[(k * power) % prime]) != required[power]) {
                fits = false;
                break;
              }
            }
            if (fits && (++tested > 2000 || marking.sameCharacter(a, b, new int[] {zb, ub[k], j}))) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }
}
