package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.group.Gl2SubgroupModel.Generated;
import irvine.math.group.Gl2SubgroupModel.Group;
import irvine.math.group.Gl2SubgroupModel.IntKey;
import irvine.math.group.Gl2SubgroupModel.Subgroup;

/**
 * Goursat's lemma for the residue-ring subgroup census.
 * @author Gregory Morse
 */
final class Gl2SubgroupProduct {

  static final class Local {
    final Group mGroup;
    final List<Subgroup> mClasses;
    final int mPrime;

    Local(final Group group, final List<Subgroup> classes, final int prime) {
      mGroup = group;
      mClasses = classes;
      mPrime = prime;
    }
  }

  private static IntKey key(final int[] elements) {
    final int[] sorted = elements.clone();
    Arrays.sort(sorted);
    return new IntKey(sorted);
  }

  private static int[] addNormal(final Group g, final int[] group, final int[] inverse, final int[] seed, final int x) {
    final List<Integer> elements = new ArrayList<>();
    final Set<Integer> known = new HashSet<>();
    for (final int y : seed) {
      elements.add(y);
      known.add(y);
    }
    for (int i = 0; i < elements.size(); ++i) {
      final int y = elements.get(i);
      final int product = g.multiply(y, x);
      if (known.add(product)) {
        elements.add(product);
      }
      for (int j = 0; j < group.length; ++j) {
        final int z = g.conjugate(y, group[j], inverse[j]);
        if (known.add(z)) {
          elements.add(z);
        }
      }
    }
    return Gl2SubgroupModel.toArray(elements);
  }

  private static final class Section {
    private final int[][] mTable;
    private final IntKey mTableKey;
    private final int[] mOrders;
    private final List<int[]> mAction = new ArrayList<>();
    private final long mWeight;

    private Section(final Group group, final int[] subgroup, final int[] normal, final int[] stabilizer, final long weight) {
      mWeight = weight;
      final Map<Integer, Integer> ids = new HashMap<>();
      final int[] reps = new int[subgroup.length / normal.length];
      int end = 0;
      for (final int x : subgroup) {
        if (!ids.containsKey(x)) {
          for (final int y : normal) {
            ids.put(group.multiply(x, y), end);
          }
          reps[end++] = x;
        }
      }
      final int m = reps.length;
      mTable = new int[m][m];
      mOrders = new int[m];
      final int[] tableKey = new int[m * m];
      for (int i = 0; i < m; ++i) {
        for (int j = 0; j < m; ++j) {
          mTable[i][j] = ids.get(group.multiply(reps[i], reps[j]));
          tableKey[i * m + j] = mTable[i][j];
        }
        int order = 1;
        for (int x = i; x != 0; x = mTable[i][x]) {
          ++order;
        }
        mOrders[i] = order;
      }
      mTableKey = new IntKey(tableKey);
      final Set<IntKey> actions = new HashSet<>();
      for (final int s : stabilizer) {
        final int inverse = group.inverse(s);
        final int[] action = new int[m];
        boolean changed = false;
        for (int i = 0; i < m; ++i) {
          action[i] = ids.get(group.conjugate(reps[i], s, inverse));
          changed |= action[i] != i;
        }
        if (changed && actions.add(new IntKey(action))) {
          mAction.add(action);
        }
      }
    }
  }

  private static List<Section> sections(final Local local, final int compatible, final boolean classes) {
    final List<Section> sections = new ArrayList<>();
    final Group group = local.mGroup;
    for (final Subgroup p : local.mClasses) {
      final int[] elements = Gl2SubgroupModel.elements(group, p.mGenerators);
      final int[] inverses = Arrays.stream(p.mGenerators).map(group::inverse).toArray();
      final List<int[]> normals = new ArrayList<>();
      normals.add(new int[] {group.mIdentity});
      final Set<IntKey> known = new HashSet<>();
      known.add(key(normals.get(0)));
      for (int i = 0; i < normals.size(); ++i) {
        final int[] old = normals.get(i);
        final Set<Integer> contained = new HashSet<>();
        for (final int z : old) {
          contained.add(z);
        }
        for (final int x : elements) {
          if (!contained.contains(x)) {
            final int[] next = addNormal(group, p.mGenerators, inverses, old, x);
            if (known.add(key(next))) {
              normals.add(next);
            }
          }
        }
      }
      final Set<IntKey> seen = new HashSet<>();
      for (final int[] n : normals) {
        final int index = elements.length / n.length;
        if (compatible % index != 0) {
          continue;
        }
        final long weight = group.mOrder / p.mNormalizerOrder;
        if (!classes) {
          sections.add(new Section(group, elements, n, new int[0], weight));
          continue;
        }
        final IntKey root = key(n);
        if (!seen.add(root)) {
          continue;
        }
        final List<int[]> orbit = new ArrayList<>();
        final List<Integer> lifts = new ArrayList<>();
        final Map<IntKey, Integer> transport = new HashMap<>();
        final Generated stabilizer = new Generated(group);
        orbit.add(n);
        lifts.add(group.mIdentity);
        transport.put(root, group.mIdentity);
        for (int i = 0; i < orbit.size(); ++i) {
          for (final int s : p.mNormalizer) {
            final int si = group.inverse(s);
            final int[] next = Arrays.stream(orbit.get(i)).map(x -> group.conjugate(x, s, si)).toArray();
            final IntKey k = key(next);
            final int t = group.multiply(s, lifts.get(i));
            final Integer old = transport.putIfAbsent(k, t);
            if (old == null) {
              orbit.add(next);
              lifts.add(t);
              seen.add(k);
            } else {
              stabilizer.add(group.multiply(group.inverse(old), t));
            }
          }
        }
        if ((long) orbit.size() * stabilizer.mElements.size() != p.mNormalizerOrder) {
          throw new IllegalStateException("Incorrect projection-section orbit");
        }
        sections.add(new Section(group, elements, n, stabilizer.generators(), weight * orbit.size()));
      }
    }
    return sections;
  }

  private static final class Step {
    private final int mOrder;
    private final int mOld;
    private final int mSize;
    private final int[][] mDerive;
    private final int[][] mCheck;

    private Step(final int order, final int old, final int size, final List<int[]> derive, final List<int[]> check) {
      mOrder = order;
      mOld = old;
      mSize = size;
      mDerive = derive.toArray(new int[0][]);
      mCheck = check.toArray(new int[0][]);
    }
  }

  private static final class Domain {
    private final int mSize;
    private final List<Step> mSteps = new ArrayList<>();
    private final List<int[][]> mPrecomposition = new ArrayList<>();

    private Domain(final Local local, final Subgroup projection, final boolean strip, final boolean classes) {
      final Group g = local.mGroup;
      final int prime = local.mPrime;
      final int[] generators;
      final int[] normalizer;
      if (strip && projection.mOrder % prime == 0) {
        // Targets of order prime to p kill all unipotent generators.
        // The surviving determinant or diagonal quotient is fixed by
        // the projection's ambient normalizer.
        final int sl = prime * (prime * prime - 1);
        generators = Arrays.copyOfRange(projection.mGenerators, projection.mOrder % sl == 0 ? 2 : 1,
          projection.mGenerators.length);
        normalizer = new int[0];
      } else {
        generators = projection.mGenerators;
        normalizer = classes ? projection.mNormalizer : new int[0];
      }
      final List<Integer> es = new ArrayList<>();
      final List<int[]> words = new ArrayList<>();
      final Map<Integer, Integer> ids = new HashMap<>();
      final List<Integer> prefix = new ArrayList<>();
      es.add(g.mIdentity);
      words.add(new int[0]);
      ids.put(g.mIdentity, 0);
      for (final int x : generators) {
        if (ids.containsKey(x)) {
          continue;
        }
        final int j = prefix.size();
        prefix.add(x);
        final int oldLength = es.size();
        final List<int[]> derive = new ArrayList<>();
        final List<int[]> check = new ArrayList<>();
        for (int i = 0; i < es.size(); ++i) {
          for (int k = i < oldLength ? j : 0; k <= j; ++k) {
            final int y = g.multiply(es.get(i), prefix.get(k));
            final Integer old = ids.putIfAbsent(y, es.size());
            if (old == null) {
              es.add(y);
              words.add(Gl2SubgroupModel.append(words.get(i), k));
              derive.add(new int[] {i, k});
            } else {
              check.add(new int[] {i, k, old});
            }
          }
        }
        int order = 1;
        for (int t = x; t != g.mIdentity; t = g.multiply(t, x)) {
          ++order;
        }
        mSteps.add(new Step(order, oldLength, es.size(), derive, check));
      }
      mSize = es.size();
      for (final int s : normalizer) {
        final int si = g.inverse(s);
        final int[][] action = new int[prefix.size()][];
        boolean changed = false;
        for (int j = 0; j < action.length; ++j) {
          action[j] = words.get(ids.get(g.conjugate(prefix.get(j), si, s)));
          changed |= action[j].length != 1 || action[j][0] != j;
        }
        if (changed) {
          mPrecomposition.add(action);
        }
      }
    }

    private void search(final Section target, final int i, final int[] previous, final int[] gens,
                        final int[][] values, final List<int[]> result) {
      if (i == mSteps.size()) {
        result.add(gens.clone());
        return;
      }
      final Step step = mSteps.get(i);
      final int[] a = values[i];
      final int[][] table = target.mTable;
      final BitSet image = new BitSet(table.length);
      System.arraycopy(previous, 0, a, 0, step.mOld);
      candidate: for (int h = 0; h < table.length; ++h) {
        if (step.mOrder % target.mOrders[h] == 0) {
          gens[i] = h;
          int j = step.mOld;
          for (final int[] k : step.mDerive) {
            a[j++] = table[a[k[0]]][gens[k[1]]];
          }
          for (final int[] k : step.mCheck) {
            if (table[a[k[0]]][gens[k[1]]] != a[k[2]]) {
              continue candidate;
            }
          }
          image.clear();
          for (final int x : a) {
            image.set(x);
          }
          // The index of a prefix image divides the index of the
          // prefix subgroup whenever the final map is surjective.
          if ((long) image.cardinality() * (mSize / step.mSize) % table.length == 0) {
            search(target, i + 1, a, gens, values, result);
          }
        }
      }
    }

    private List<int[]> epimorphisms(final Section target) {
      final List<int[]> result = new ArrayList<>();
      if (mSize % target.mTable.length == 0) {
        final int[][] values = new int[mSteps.size()][];
        for (int i = 0; i < values.length; ++i) {
          values[i] = new int[mSteps.get(i).mSize];
        }
        search(target, 0, new int[] {0}, new int[values.length], values, result);
      }
      return result;
    }

    private long orbits(final Section target, final List<int[]> es) {
      if (es.size() <= 1 || (mPrecomposition.isEmpty() && target.mAction.isEmpty())) {
        return es.size();
      }
      final Set<IntKey> seen = new HashSet<>();
      long count = 0;
      for (final int[] x : es) {
        if (seen.add(new IntKey(x))) {
          ++count;
          final List<int[]> orbit = new ArrayList<>();
          orbit.add(x);
          for (int i = 0; i < orbit.size(); ++i) {
            final int[] v = orbit.get(i);
            for (final int[] a : target.mAction) {
              final int[] y = new int[v.length];
              for (int j = 0; j < y.length; ++j) {
                y[j] = a[v[j]];
              }
              if (seen.add(new IntKey(y))) {
                orbit.add(y);
              }
            }
            for (final int[][] a : mPrecomposition) {
              final int[] y = new int[v.length];
              for (int j = 0; j < y.length; ++j) {
                for (final int h : a[j]) {
                  y[j] = target.mTable[y[j]][v[h]];
                }
              }
              if (seen.add(new IntKey(y))) {
                orbit.add(y);
              }
            }
          }
        }
      }
      if (seen.size() != es.size()) {
        throw new IllegalStateException("Incorrect epimorphism orbits");
      }
      return count;
    }
  }

  private Gl2SubgroupProduct() { }

  static long count(final Local a, final Local b, final boolean conjugacy) {
    final Local small = a.mGroup.mOrder <= b.mGroup.mOrder ? a : b;
    final Local big = small == a ? b : a;
    final List<Section> sections = sections(small, big.mGroup.mOrder, conjugacy);
    final boolean strip = big.mPrime >= 5 && big.mPrime == big.mGroup.mModulus
      && small.mGroup.mOrder % big.mPrime != 0;
    long total = 0;
    // A subgroup with projections P and Q is specified by a normal
    // subgroup N of P and a surjection Q -> P/N. The projection
    // normalizers give precisely the conjugations of this data.
    for (final Subgroup q : big.mClasses) {
      final Domain domain = new Domain(big, q, strip, conjugacy);
      final Map<IntKey, List<int[]>> cache = new HashMap<>();
      for (final Section s : sections) {
        final int size = s.mTable.length;
        if (domain.mSize % size == 0) {
          if (size == 1) {
            total += conjugacy ? 1 : s.mWeight * (big.mGroup.mOrder / q.mNormalizerOrder);
          } else {
            final List<int[]> epis = cache.computeIfAbsent(s.mTableKey, k -> domain.epimorphisms(s));
            total += conjugacy ? domain.orbits(s, epis)
              : s.mWeight * (big.mGroup.mOrder / q.mNormalizerOrder) * epis.size();
          }
        }
      }
    }
    return total;
  }
}
