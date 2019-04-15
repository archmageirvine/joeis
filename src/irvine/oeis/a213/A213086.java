package irvine.oeis.a213;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A213086 Square array read by antidiagonals: <code>T(n</code>,m) <code>(n&gt;=1,</code> m&gt;=0) is the number of partitions of mn that are the sum of m not necessarily distinct partitions of n.
 * @author Sean A. Irvine
 */
public class A213086 implements Sequence {

  private int mN = 0;
  private int mPos = 0;

  private final HashMap<Point, Collection<ArrayList<Integer>>> mG = new HashMap<>();

  private ArrayList<Integer> merge(final List<Integer> a, final List<Integer> b) {
    final ArrayList<Integer> c = new ArrayList<>(a);
    c.addAll(b);
    Collections.sort(c);
    return c;
  }

  private static final ArrayList<Integer> EMPTY = new ArrayList<>();

  private Collection<ArrayList<Integer>> g(final int n, final int m) {
    final Point key = new Point(n, m);
    final Collection<ArrayList<Integer>> r = mG.get(key);
    if (r != null) {
      return r;
    }
    final HashSet<ArrayList<Integer>> res = new HashSet<>();
    if (m > 1) {
      final Collection<ArrayList<Integer>> g1 = g(n, 1);
      final Collection<ArrayList<Integer>> g2 = g(n, m - 1);
      for (final ArrayList<Integer> x : g1) {
        for (final ArrayList<Integer> y : g2) {
          res.add(merge(x, y));
        }
      }
    } else if (m == 1) {
      final IntegerPartition part = new IntegerPartition(n);
      int[] p;
      while ((p = part.next()) != null) {
        final ArrayList<Integer> g = new ArrayList<>();
        for (final int piece : p) {
          if (piece > 1) {
            g.add(piece - 1);
          }
        }
        res.add(g);
      }
    } else {
      res.add(EMPTY);
    }
    mG.put(key, res);
    return res;
  }

  protected int t(final int n, final int m) {
    return g(n, m).size();
  }

  @Override
  public Z next() {
    if (++mPos >= mN) {
      ++mN;
      mPos = 0;
    }
    return Z.valueOf(t(mN - mPos, mPos));
  }
}
