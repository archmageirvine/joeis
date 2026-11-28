package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import irvine.math.q.Q;
import irvine.math.set.IntegerPermutation;

/**
 * Root-system containment test for irreducible rational groups of degree seven.
 * @author Gregory Morse
 */
final class RationalE7Census {
  private static final int D = 8;
  private static final int N = D - 1;
  private final List<int[]> mRoots = new ArrayList<>();
  private final Map<Integer, Integer> mIndex = new HashMap<>();

  private static int encode(final int[] vector) {
    int key = 0;
    for (final int v : vector) {
      if (v < -2 || v > 2) {
        throw new IllegalArgumentException("Outside root lattice shell");
      }
      key = 5 * key + v + 2;
    }
    return key;
  }

  private void add(final int[] root) {
    if (mIndex.put(encode(root), mRoots.size()) != null) {
      throw new IllegalStateException("Duplicate root");
    }
    mRoots.add(root);
  }

  private static int[] difference(final int i, final int j) {
    final int[] v = new int[D];
    v[i] = 2;
    v[j] = -2;
    return v;
  }

  private RationalE7Census() {
    for (int i = 0; i < D; ++i) {
      for (int j = 0; j < D; ++j) {
        if (i != j) {
          add(difference(i, j));
        }
      }
    }
    for (int bits = 0; bits < (1 << D); ++bits) {
      if (Integer.bitCount(bits) == D / 2) {
        final int[] root = new int[D];
        for (int i = 0; i < D; ++i) {
          root[i] = ((bits >>> i) & 1) == 0 ? 1 : -1;
        }
        add(root);
      }
    }
  }

  private IntegerPermutation reflection(final int[] v) {
    final int[] permutation = new int[mRoots.size()];
    for (int j = 0; j < permutation.length; ++j) {
      final int[] w = mRoots.get(j);
      int dot = 0;
      for (int k = 0; k < D; ++k) {
        dot += v[k] * w[k];
      }
      if (dot % 4 != 0) {
        throw new IllegalStateException("Nonintegral reflection coefficient");
      }
      final int[] reflected = new int[D];
      for (int k = 0; k < D; ++k) {
        reflected[k] = w[k] - (dot / 4) * v[k];
      }
      permutation[j] = mIndex.get(encode(reflected));
    }
    return new IntegerPermutation(permutation);
  }

  private int order() {
    final List<IntegerPermutation> reflections = new ArrayList<>();
    for (int i = 1; i < D; ++i) {
      reflections.add(reflection(difference(i - 1, i)));
    }
    reflections.add(reflection(mRoots.get(D * (D - 1))));
    final int order = SchreierSims.calculateOrder(SchreierSims.createBSGSList(reflections)).intValueExact();
    final int[] negation = mRoots.stream().mapToInt(v -> mIndex.get(encode(Arrays.stream(v).map(x -> -x).toArray()))).toArray();
    reflections.add(new IntegerPermutation(negation));
    if (SchreierSims.calculateOrder(SchreierSims.createBSGSList(reflections)).intValueExact() != order) {
      throw new IllegalStateException("Central negation not in the root group");
    }
    return order;
  }

  private static List<Q> action(final List<Q> v, final Q[][] g) {
    final Q[] result = new Q[N];
    Arrays.fill(result, Q.ZERO);
    for (int i = 0; i < N; ++i) {
      for (int j = 0; j < N; ++j) {
        result[j] = result[j].add(v.get(i).multiply(g[i][j]));
      }
    }
    return List.of(result);
  }

  private static Q dot(final List<Q> a, final List<Q> b) {
    Q result = Q.ZERO;
    for (int i = 0; i < N; ++i) {
      result = result.add(a.get(i).multiply(b.get(i)));
    }
    return result;
  }

  private static List<Q> negative(final List<Q> v) {
    final List<Q> result = new ArrayList<>(N);
    for (final Q q : v) {
      result.add(q.negate());
    }
    return result;
  }

  private static boolean isSignedSimplex(final Q[][][] generators, final Q[][] form, final List<Q> seed) {
    final List<List<Q>> orbit = new ArrayList<>();
    final Set<List<Q>> all = new HashSet<>();
    orbit.add(seed);
    all.add(seed);
    for (int i = 0; i < orbit.size(); ++i) {
      for (final Q[][] g : generators) {
        final List<Q> v = action(orbit.get(i), g);
        if (all.add(v)) {
          orbit.add(v);
          if (orbit.size() > 2 * D) {
            return false;
          }
        }
      }
    }
    if (orbit.size() != 2 * D || !orbit.stream().allMatch(v -> all.contains(negative(v)))) {
      return false;
    }
    final List<List<Q>> picked = new ArrayList<>();
    for (final List<Q> v : orbit) {
      if (!picked.contains(v) && !picked.contains(negative(v))) {
        picked.add(dot(action(v, form), seed).signum() <= 0 || picked.isEmpty() ? v : negative(v));
      }
    }
    final Q size = dot(action(seed, form), seed);
    if (picked.size() != D || size.signum() <= 0) {
      return false;
    }
    final Q inner = size.negate().divide(new Q(N));
    for (int i = 0; i < D; ++i) {
      for (int j = 0; j < D; ++j) {
        if (!dot(action(picked.get(i), form), picked.get(j)).equals(i == j ? size : inner)) {
          return false;
        }
      }
    }
    for (final Q[][] g : generators) {
      if (!picked.stream().allMatch(v -> picked.contains(action(v, g)))
        && !picked.stream().allMatch(v -> picked.contains(negative(action(v, g))))) {
        return false;
      }
    }
    return true;
  }

  static final class Input {
    private final Matcher mTokens;
    String mToken;

    Input(final String input) {
      mTokens = Pattern.compile("\\[|\\]|-?\\d+(?:/\\d+)?").matcher(input);
      next();
    }

    void next() {
      mToken = mTokens.find() ? mTokens.group() : "";
    }

    void require(final String expected) {
      if (!expected.equals(mToken)) {
        throw new IllegalArgumentException("Invalid structural fixture");
      }
      next();
    }

    List<Q> vector() {
      require("[");
      final List<Q> v = new ArrayList<>();
      while (!"]".equals(mToken)) {
        v.add(Q.valueOf(mToken));
        next();
      }
      require("]");
      return v;
    }

    Q[][] matrix() {
      require("[");
      final List<Q[]> rows = new ArrayList<>();
      while (!"]".equals(mToken)) {
        rows.add(vector().toArray(new Q[0]));
      }
      require("]");
      return rows.toArray(new Q[0][]);
    }
  }

  static int maximal(final String data) {
    final RationalE7Census e7 = new RationalE7Census();
    final int rootGroup = e7.order();
    final String fixture = data.lines().filter(s -> s.startsWith("IMF_GENERATORS ")).findFirst().orElseThrow();
    final Input input = new Input(fixture.substring("IMF_GENERATORS ".length()));
    final List<Integer> candidates = new ArrayList<>();
    final List<Integer> simplex = new ArrayList<>();
    input.require("[");
    while (!"]".equals(input.mToken)) {
      input.require("[");
      final int order = Integer.parseInt(input.mToken);
      input.next();
      input.require("[");
      final List<Q[][]> generators = new ArrayList<>();
      while (!"]".equals(input.mToken)) {
        generators.add(input.matrix());
      }
      input.require("]");
      final Q[][] form = input.matrix();
      final List<Q> seed = input.vector();
      input.require("]");
      candidates.add(order);
      if (order < rootGroup && rootGroup % order == 0 && isSignedSimplex(generators.toArray(new Q[0][][]), form, seed)) {
        simplex.add(candidates.size() - 1);
      }
    }
    if (candidates.stream().filter(x -> x == rootGroup).count() != 1) {
      throw new AssertionError("The root model does not identify a unique catalogue class");
    }
    for (int i = simplex.size() - 1; i >= 0; --i) {
      candidates.remove((int) simplex.get(i));
    }
    for (int i = 0; i < candidates.size(); ++i) {
      for (int j = 0; j < candidates.size(); ++j) {
        if (i != j && candidates.get(j) % candidates.get(i) == 0) {
          throw new AssertionError("Unresolved possible containment");
        }
      }
    }
    return candidates.size();
  }
}
