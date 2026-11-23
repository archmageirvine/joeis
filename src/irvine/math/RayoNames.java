package irvine.math;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Upper bounds on exact-length singleton definitions through 30 symbols.
 * The quantified variables range over all sets, not just ordinals.
 * @author Gregory Morse
 */
public final class RayoNames {
  private RayoNames() { }

  private static int bit(final int kind, final int i, final int j) {
    return 1 << (9 * kind + 3 * i + j);
  }

  private static int ifBit(final boolean present, final int kind, final int i, final int j) {
    return present ? bit(kind, i, j) : 0;
  }

  private static boolean has(final int diagram, final int kind, final int i, final int j) {
    return (diagram & bit(kind, i, j)) != 0;
  }

  private static int pair(final boolean same, final boolean yInX, final boolean xInY) {
    return bit(0, 0, 0) | bit(0, 1, 1)
      | ifBit(same, 0, 0, 1) | ifBit(same, 0, 1, 0)
      | ifBit(yInX, 1, 1, 0) | ifBit(xInY, 1, 0, 1);
  }

  private static int other(final int pair, final boolean zInX, final boolean zInY, final boolean xInZ, final boolean yInZ) {
    return pair | bit(0, 2, 2) | ifBit(zInX, 1, 2, 0) | ifBit(zInY, 1, 2, 1)
      | ifBit(xInZ, 1, 0, 2) | ifBit(yInZ, 1, 1, 2);
  }

  private static int copy(final int pair, final int which) {
    int diagram = pair | bit(0, 2, 2);
    for (int k = 0; k < 2; ++k) {
      for (int i = 0; i < 2; ++i) {
        diagram |= ifBit(has(pair, k, i, which), k, i, 2);
        diagram |= ifBit(has(pair, k, which, i), k, 2, i);
      }
    }
    return diagram;
  }

  private static Set<Integer> extensions(final int base) {
    final Set<Integer> triples = new TreeSet<>();
    triples.add(copy(base, 0));
    triples.add(copy(base, 1));
    // There are fresh sets not in x or y, with any chosen pattern of
    // containing x and y. Add a fresh high-rank member to ensure this.
    for (int f = 0; f < 4; ++f) {
      final boolean x = (f & 1) != 0;
      final boolean y = (f & 2) != 0;
      if (!has(base, 0, 0, 1) || x == y) {
        triples.add(other(base, false, false, x, y));
      }
    }
    return triples;
  }

  private static final class Types {
    final List<List<Integer>> mDiagrams = List.of(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    final List<int[]> mRootChildren = new ArrayList<>();
    final List<int[]> mPairChildren = new ArrayList<>();
    private final Map<Integer, Integer> mLeafIds = new HashMap<>();
    private final Map<Set<Integer>, Integer> mPairIds = new HashMap<>();

    Types() {
      // The case n=3 represents all n>=3. Looking one more set deep
      // detects whether there is an ordinal member below/above y, not
      // how many; and a subset of x can meet both sides iff n>=2.
      for (int n = 0; n <= 3; ++n) {
        mDiagrams.get(0).add(bit(0, 0, 0));
        final List<Integer> children = new ArrayList<>();
        final int same = pair(true, false, false);
        final Set<Integer> reflexive = extensions(same);
        if (n > 0) {
          reflexive.add(other(same, true, true, false, false));
        }
        children.add(addPair(same, reflexive));
        for (int y = 0; y < n; ++y) {
          // y is itself a finite ordinal when it belongs to x.
          final int below = pair(false, true, false);
          final Set<Integer> triples = extensions(below);
          for (int z = 0; z < n; ++z) {
            if (z != y) {
              triples.add(other(below, true, z < y, false, y < z));
            }
          }
          children.add(addPair(below, triples));
        }
        for (int flags = 0; flags < 32; ++flags) {
          final boolean xInY = (flags & 1) != 0;
          final boolean someCommon = (flags & 2) != 0;
          final boolean someXOnly = (flags & 4) != 0;
          final boolean outsideWithoutX = (flags & 8) != 0;
          final boolean outsideWithX = (flags & 16) != 0;
          // Here y is distinct from x and does not belong to x.
          if ((n == 0) == (someCommon || someXOnly) || n == 1 && someCommon && someXOnly
            || !someXOnly && !xInY && !outsideWithoutX && !outsideWithX) {
            continue;
          }
          // Construct y from any subset of x with the indicated
          // in/out flags, optionally x, and optionally fresh elements
          // of rank above x with each of the two x-membership flags.
          final int general = pair(false, false, xInY);
          final Set<Integer> triples = extensions(general);
          if (someCommon) {
            triples.add(other(general, true, true, false, false));
          }
          if (someXOnly) {
            triples.add(other(general, true, false, false, false));
          }
          if (outsideWithoutX) {
            triples.add(other(general, false, true, false, false));
          }
          if (outsideWithX) {
            triples.add(other(general, false, true, true, false));
          }
          children.add(addPair(general, triples));
        }
        mRootChildren.add(children.stream().mapToInt(i -> i).toArray());
      }
      // All nonordinals in V_4 are explicit further counterwitnesses.
      // No claim is made that V_4 is a universe for satisfaction.
      for (int code = 0; code < 16; ++code) {
        if (code != 0 && code != 1 && code != 3 && code != 11) {
          finiteRoot(code);
        }
      }
    }

    // Ackermann codes: the i-th binary bit encodes membership of i.
    private static boolean member(final int element, final int set) {
      return (set & (1 << element)) != 0;
    }

    private void finiteRoot(final int x) {
      final List<Integer> children = new ArrayList<>();
      mDiagrams.get(0).add(bit(0, 0, 0));
      int support = 1 << x;
      for (int y = x; y >= 0; --y) {
        if (member(y, support)) {
          support |= y;
        }
      }
      for (int y = 0; y <= x; ++y) {
        if (member(y, support)) {
          final int base = pair(x == y, member(y, x), member(x, y));
          final Set<Integer> triples = extensions(base);
          for (int z = 0; z <= x; ++z) {
            if (member(z, support) && z != x && z != y) {
              triples.add(other(base, member(z, x), member(z, y), member(x, z), member(y, z)));
            }
          }
          children.add(addPair(base, triples));
        }
      }
      for (int selection = support;; selection = (selection - 1) & support) {
        for (int fresh = 0; fresh < 4; ++fresh) {
          // An outside y has arbitrary members from the transitive
          // closure, and optional fresh members of each x-incidence
          // type. With no fresh members, avoid reproducing a known y.
          if (fresh == 0 && selection <= x && member(selection, support)) {
            continue;
          }
          final int base = pair(false, false, member(x, selection));
          final Set<Integer> triples = extensions(base);
          for (int z = 0; z <= x; ++z) {
            if (member(z, support) && z != x) {
              triples.add(other(base, member(z, x), member(z, selection), member(x, z), false));
            }
          }
          if ((fresh & 1) != 0) {
            triples.add(other(base, false, true, false, false));
          }
          if ((fresh & 2) != 0) {
            triples.add(other(base, false, true, true, false));
          }
          children.add(addPair(base, triples));
        }
        if (selection == 0) {
          break;
        }
      }
      mRootChildren.add(children.stream().mapToInt(Integer::intValue).distinct().toArray());
    }

    private int addPair(final int diagram, final Set<Integer> triples) {
      final Integer existing = mPairIds.get(triples);
      if (existing != null) {
        return existing;
      }
      final int id = mDiagrams.get(1).size();
      mPairIds.put(triples, id);
      mDiagrams.get(1).add(diagram);
      mPairChildren.add(triples.stream().mapToInt(t -> mLeafIds.computeIfAbsent(t, k -> {
        final int i = mDiagrams.get(2).size();
        mDiagrams.get(2).add(k);
        return i;
      })).toArray());
      return id;
    }
  }

  private static BitSet literal(final List<Integer> types, final int mask) {
    final BitSet value = new BitSet(types.size());
    for (int i = 0; i < types.size(); ++i) {
      if ((types.get(i) & mask) != 0) {
        value.set(i);
      }
    }
    return value;
  }

  private static BitSet exists(final List<int[]> children, final BitSet inner) {
    final BitSet value = new BitSet(children.size());
    for (int i = 0; i < children.size(); ++i) {
      for (final int child : children.get(i)) {
        if (inner.get(child)) {
          value.set(i);
          break;
        }
      }
    }
    return value;
  }

  private static int[] atMostTwo(final int limit) {
    final Types types = new Types();
    final List<List<Set<BitSet>>> truth = new ArrayList<>();
    for (int d = 0; d < 3; ++d) {
      final List<Set<BitSet>> rows = new ArrayList<>();
      for (int n = 0; n <= limit; ++n) {
        rows.add(new HashSet<>());
      }
      truth.add(rows);
    }
    for (int n = 3; n <= limit; ++n) {
      for (int d = 0; d < 3; ++d) {
        final List<Set<BitSet>> rows = truth.get(d);
        final Set<BitSet> out = rows.get(n);
        final List<Integer> diagrams = types.mDiagrams.get(d);
        if (n == 3) {
          for (int k = 0; k < 2; ++k) {
            for (int i = 0; i <= d; ++i) {
              for (int j = 0; j <= d; ++j) {
                out.add(literal(diagrams, bit(k, i, j)));
              }
            }
          }
        }
        if (n >= 6) {
          for (final BitSet a : rows.get(n - 3)) {
            final BitSet b = (BitSet) a.clone();
            b.flip(0, diagrams.size());
            out.add(b);
          }
        }
        if (n >= 7 && d < 2) {
          for (final BitSet a : truth.get(d + 1).get(n - 4)) {
            out.add(exists(d == 0 ? types.mRootChildren : types.mPairChildren, a));
          }
        }
        if (n >= 7) {
          // Any number of extra vacuous quantifiers is permitted;
          // they cost symbols but do not consume a semantic depth.
          out.addAll(rows.get(n - 4));
        }
        for (int l = 3; l <= (n - 3) / 2; ++l) {
          for (final BitSet a : rows.get(l)) {
            for (final BitSet b : rows.get(n - 3 - l)) {
              final BitSet both = (BitSet) a.clone();
              both.and(b);
              out.add(both);
            }
          }
        }
      }
    }
    final int[] bound = new int[limit + 1];
    for (int n = 0; n <= limit; ++n) {
      int largestSingleton = -1;
      for (final BitSet value : truth.get(0).get(n)) {
        if (!value.get(3) && value.cardinality() == 1) {
          largestSingleton = Math.max(largestSingleton, value.nextSetBit(0));
        }
      }
      bound[n] = largestSingleton + 1;
    }
    return bound;
  }

  private static int not(final int size) {
    return 3 + size;
  }

  private static int exists(final int size) {
    return 4 + size;
  }

  private static int and(final int left, final int right) {
    return 3 + left + right;
  }

  // See RAYO_PROOF.md for the three-atom lemma. After erasing
  // vacuous binders, a deeper formula needs at least three bound
  // variables. Two atoms can then only give a one-test ordinal
  // predicate. Three atoms allow at most one negation; in that
  // case no singleton ordinal >= 2 can be defined.
  private static int deeperBound(final int n) {
    int bound = 0;
    for (int atoms = 2; 6 * atoms - 3 + 12 <= n; ++atoms) {
      for (int quantifiers = 3; 6 * atoms - 3 + 4 * quantifiers <= n; ++quantifiers) {
        final int left = n - (6 * atoms - 3 + 4 * quantifiers);
        if (left > 0 && left % 3 == 0) {
          bound = Math.max(bound, atoms - 1);
        }
      }
    }
    return bound;
  }

  /**
   * Compute the exact-length maxima through length 30.
   * @return one plus each largest singleton, or zero if there is none
   */
  public static int[] terms() {
    final int limit = 30;
    final int atom = 3;
    final int[] upper = atMostTwo(limit);
    final int[] lower = new int[limit + 1];
    // Empty(x): not exists y (y in x).
    lower[not(exists(atom))] = 1;
    // Same predicate, with the always-true guard not(y in y).
    lower[not(exists(and(atom, not(atom))))] = 1;
    // Nonempty(x) and no length-two membership chain below x.
    lower[and(exists(atom), not(exists(exists(and(atom, atom)))))] = 2;
    for (int n = 0; n <= limit; ++n) {
      if (n >= 4) {
        lower[n] = Math.max(lower[n], lower[n - 4]); // Vacuous quantifier.
      }
      if (n >= 6) {
        lower[n] = Math.max(lower[n], lower[n - 6]); // Double negation.
      }
      if (lower[n] != Math.max(upper[n], deeperBound(n))) {
        throw new IllegalStateException("The bounds disagree at length " + n + ": "
          + lower[n] + " <= result <= " + Math.max(upper[n], deeperBound(n)));
      }
    }
    return lower;
  }

  /**
   * Print the verified finite prefix.
   * @param args unused
   */
  public static void main(final String[] args) {
    final int[] terms = terms();
    for (int n = 0; n < terms.length; ++n) {
      System.out.printf("%d %d%n", n, terms[n]);
    }
  }
}
