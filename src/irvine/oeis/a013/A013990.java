package irvine.oeis.a013;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.OrderedPair;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A013990 Number of edge-disjoint paths between opposite corners of n X n grid.
 * @author Sean A. Irvine
 */
public class A013990 extends Sequence0 {

  // Based loosely on the description at http://keithlynch.net/DanHoey/95.txt
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  static final class Comb extends TreeSet<OrderedPair> implements Comparable<Comb> {

    Comb(final int singleton) {
      add(new OrderedPair(-1, singleton));
    }

    Comb() {
    }

    OrderedPair add(final int a, final int b) {
      if (a == b) {
        throw new IllegalArgumentException("Cannot have a == b for a=" + a);
      }
      final OrderedPair pair = new OrderedPair(a, b);
      add(pair);
      return pair;
    }

    @Override
    public int compareTo(final Comb o) {
      final int c = Integer.compare(size(), o.size());
      if (c != 0) {
        return c;
      }
      for (final Iterator<OrderedPair> a = iterator(), b = o.iterator(); a.hasNext();) {
        final int d = a.next().compareTo(b.next());
        if (d != 0) {
          return d;
        }
      }
      return 0;
    }
  }

  private static void initCombs(final Collection<Comb> combs, final int singleton, final List<OrderedPair> pairs, final int n, final int k, final long used) {
    if (k >= n) {
      // Construct the actual comb
      final Comb comb = new Comb(singleton);
      comb.addAll(pairs);
      combs.add(comb);
      return;
    }
    // Choose not to use point k
    initCombs(combs, singleton, pairs, n, k + 1, used);
    if ((used & (1L << k)) == 0) {
      // Pair k to a later point
      for (int j = k + 1; j < n; ++j) {
        if ((used & (1L << j)) == 0) {
          // Form the pair (k, j), k < j
          final OrderedPair pair = new OrderedPair(k, j);
          pairs.add(pair);
          initCombs(combs, singleton, pairs, n, k + 1, used | (1L << k) | (1L << j));
          pairs.remove(pairs.size() - 1);
        }
      }
    }
  }

  static Collection<Comb> combs(final int height) {
    final List<OrderedPair> workspace = new ArrayList<>();
    final List<Comb> combs = new ArrayList<>();
    for (int k = 0; k < height; ++k) {
      initCombs(combs, k, workspace, height, 0, 1L << k);
    }
    return combs;
  }

  private static boolean isPermitted(final int a, final int b, final long forbidden) {
    // Test all bits from a to b
    if (a == -1) {
      return true;
    }
    if (a > b) {
      return (forbidden & (((1L << (a - b)) - 1) << b)) == 0;
    } else {
      return (forbidden & (((1L << (b - a)) - 1) << a)) == 0;
    }
  }

  private static long forbid(final int a, final int b, final long forbidden) {
    // Set all bits from a to b
    if (a == -1) {
      return forbidden;
    }
    if (a > b) {
      return forbidden | (((1L << (a - b)) - 1) << b);
    } else {
      return forbidden | (((1L << (b - a)) - 1) << a);
    }
  }

  private static void insertNewPairs(final Map<Comb, Integer> code, final Map<Integer, Integer> res, final List<OrderedPair> pairs, final int k, final boolean[] used, final long forbidden) {
    final int height = used.length;
    if (k >= height) {
      // Construct the actual comb and increment its count in the final result
      final Comb comb = new Comb();
      comb.addAll(pairs);
      res.merge(code.get(comb), 1, (x, y) -> x + y);
      return;
    }
    // Choose not to use point k
    insertNewPairs(code, res, pairs, k + 1, used, forbidden);
    // Introduce a pair from k to each possible later point in turn
    if (!used[k]) {
      // Pair k to a later point
      used[k] = true;
      for (int j = k + 1; j < height; ++j) {
        if (!used[j] && isPermitted(k, j, forbidden)) {
          // Form the new pair (k, j), k < j
          pairs.add(new OrderedPair(k, j));
          used[j] = true;
          insertNewPairs(code, res, pairs, k + 1, used, forbid(k, j, forbidden));
          used[j] = false;
          pairs.remove(pairs.size() - 1);
        }
      }
      used[k] = false;
    }
  }

  private static void extendExistingPairs(final Map<Comb, Integer> code, final Map<Integer, Integer> res, final OrderedPair[] parentPairs, final List<OrderedPair> pairs, int pos, final boolean[] used, final long forbidden) {
    while (pos < parentPairs.length && parentPairs[pos] == null) {
      ++pos;
    }
    if (pos >= parentPairs.length) {
      insertNewPairs(code, res, pairs, 0, used, forbidden);
      return;
    }
    final OrderedPair p = parentPairs[pos];
    final int k = p.left();
    final int j = p.right();
    assert j > k;
    if (k == -1) {
      // Only the j end extends, this is the "singleton" path
      for (int t = 0; t < used.length; ++t) {
        if (!used[t] && isPermitted(j, t, forbidden)) {
          // (k,j) -> (k,t)
          pairs.add(new OrderedPair(k, t));
          used[t] = true;
          extendExistingPairs(code, res, parentPairs, pairs, pos + 1, used, forbid(j, t, forbidden));
          used[t] = false;
          pairs.remove(pairs.size() - 1);
        }
      }
    } else {
      // Parent contains (k,j) consider all possible extensions (s,t) of this pair
      for (int s = 0; s < used.length; ++s) {
        if (!used[s] && isPermitted(k, s, forbidden)) {
          // k -> s, put in this constraint BEFORE considering j
          used[s] = true;
          final long f = forbid(k, s, forbidden);
          for (int t = 0; t < used.length; ++t) {
            if (!used[t] && isPermitted(j, t, f)) {
              // (k,j) -> (s,t)
              pairs.add(new OrderedPair(s, t));
              used[t] = true;
              extendExistingPairs(code, res, parentPairs, pairs, pos + 1, used, forbid(j, t, f));
              used[t] = false;
              pairs.remove(pairs.size() - 1);
            }
          }
          used[s] = false;
        }
      }
    }
  }

  private static void joinExistingPairs(final Map<Comb, Integer> code, final Map<Integer, Integer> res, final OrderedPair[] parentPairs, final int k, final int height, final long forbidden) {
    if (k >= height) {
      final List<OrderedPair> pairs = new ArrayList<>();
      extendExistingPairs(code, res, parentPairs, pairs, 0, new boolean[height], forbidden);
      return;
    }
    joinExistingPairs(code, res, parentPairs, k + 1, height, forbidden); // don't join using k
    for (int posP = 0; posP < parentPairs.length; ++posP) {
      final OrderedPair p = parentPairs[posP];
      if (p == null) {
        continue; // pair no longer in consideration
      }
      parentPairs[posP] = null;
      if (p.left() == k) {
        for (int j = k + 1; j < height; ++j) {
          for (int posQ = 0; posQ < parentPairs.length; ++posQ) {
            final OrderedPair q = parentPairs[posQ];
            if (q != null) {
              if (q.left() == j) {
                final OrderedPair r = new OrderedPair(p.right(), q.right());
                parentPairs[posQ] = r;
                joinExistingPairs(code, res, parentPairs, j + 1, height, forbid(k, j, forbidden));
                parentPairs[posQ] = q;
                break;
              } else if (q.right() == j) {
                final OrderedPair r = new OrderedPair(p.right(), q.left());
                parentPairs[posQ] = r;
                joinExistingPairs(code, res, parentPairs, j + 1, height, forbid(k, j, forbidden));
                parentPairs[posQ] = q;
                break;
              }
            }
          }
        }
      } else if (p.right() == k) {
        for (int j = k + 1; j < height; ++j) {
          for (int posQ = 0; posQ < parentPairs.length; ++posQ) {
            final OrderedPair q = parentPairs[posQ];
            if (q != null) {
              if (q.left() == j) {
                final OrderedPair r = new OrderedPair(p.left(), q.right());
                parentPairs[posQ] = r;
                joinExistingPairs(code, res, parentPairs, j + 1, height, forbid(k, j, forbidden));
                parentPairs[posQ] = q;
                break;
              } else if (q.right() == j) {
                final OrderedPair r = new OrderedPair(p.left(), q.left());
                parentPairs[posQ] = r;
                joinExistingPairs(code, res, parentPairs, j + 1, height, forbid(k, j, forbidden));
                parentPairs[posQ] = q;
                break;
              }
            }
          }
        }
      }
      parentPairs[posP] = p;
    }
  }

  static Map<Integer, Integer> successors(final Map<Comb, Integer> code, final Comb comb, final int height) {
    final Map<Integer, Integer> res = new TreeMap<>();
    joinExistingPairs(code, res, comb.toArray(new OrderedPair[0]), 0, height, 0L);
    return res;
  }

  protected static Map<Integer, Map<Integer, Integer>> successors(final Map<Comb, Integer> code, final Collection<Comb> combs, final int height) {
    // This could be done in parallel
    final Map<Integer, Map<Integer, Integer>> res = new TreeMap<>();
    for (final Comb comb : combs) {
      res.put(code.get(comb), successors(code, comb, height));
    }
    return res;
  }

  protected Map<Comb, Integer> combToCode(final Collection<Comb> combs) {
    final Map<Comb, Integer> code = new TreeMap<>();
    int c = -1;
    for (final Comb comb : combs) {
      code.put(comb, ++c);
    }
    return code;
  }

  protected int[][] packTransitions(final Map<Comb, Integer> code, final Map<Integer, Map<Integer, Integer>> transitions) {
    final int[][] pack = new int[code.size()][];
    for (final Map.Entry<Integer, Map<Integer, Integer>> combMapEntry : transitions.entrySet()) {
      final int row = combMapEntry.getKey();
      assert pack[row] == null;
      final int[] r = new int[combMapEntry.getValue().size() * 2]; // pairs code, count
      pack[row] = r;
      int k = 0;
      for (final Map.Entry<Integer, Integer> e : combMapEntry.getValue().entrySet()) {
        r[k++] = e.getKey();
        r[k++] = e.getValue();
      }
    }
    return pack;
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ONE;
    }
    final Collection<Comb> combs = combs(mN);
    if (mVerbose) {
      StringUtils.message("Combs: " + combs.size());
    }
    final Map<Comb, Integer> code = combToCode(combs);
    final Map<Integer, Map<Integer, Integer>> successors = successors(code, combs, mN);
    if (mVerbose) {
      StringUtils.message("Done successor computation");
    }
    final int[][] transitions = packTransitions(code, successors);

    Z[] counts = new Z[combs.size()];
    Arrays.fill(counts, Z.ZERO);
    counts[code.get(new Comb(0))] = Z.ONE;

    for (int k = 0; k < mN; ++k) {
      if (mVerbose) {
        StringUtils.message("Starting column: " + (k + 1) + "/" + mN);
      }
      final Z[] newCounts = new Z[counts.length];
      Arrays.fill(newCounts, Z.ZERO);
      for (int j = 0; j < counts.length; ++j) {
        final int[] t = transitions[j];
        for (int i = 0; i < t.length; i += 2) {
          newCounts[j] = newCounts[j].add(counts[t[i]].multiply(t[i + 1]));
        }
      }
      counts = newCounts;
    }
    return counts[code.get(new Comb(mN - 1))];
  }
}

