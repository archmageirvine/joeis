package irvine.oeis.a028;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028311.
 * @author Sean A. Irvine
 */
public class A028311 implements Sequence {

  // Could be done with the Group framework

  protected int mN = 1;

  protected List<Set<Integer>> cosets(final int n) {
    final boolean[] used = new boolean[n];
    final ArrayList<Set<Integer>> cosets = new ArrayList<>();
    for (int start = 1; start < n; ++start) {
      if (!used[start]) {
        final TreeSet<Integer> set = new TreeSet<>();
        cosets.add(set);
        int e = start;
        do {
          used[e] = true;
          set.add(e);
          e = (4 * e) % n;
        } while (!used[e]);
      }
    }
    return cosets;
  }

  private Set<Integer> negate(final Set<Integer> set, final int n) {
    final TreeSet<Integer> res = new TreeSet<>();
    for (final Integer s : set) {
      res.add(n - s);
    }
    return res;
  }

  private Set<Integer> multiply2(final Set<Integer> set, final int n) {
    final TreeSet<Integer> res = new TreeSet<>();
    for (final Integer s : set) {
      res.add((2 * s) % n);
    }
    return res;
  }

  private Set<Integer> union(final List<Set<Integer>> cosets, long s) {
    final Set<Integer> res = new TreeSet<>();
    int k = 0;
    while (s != 0) {
      if ((s & 1) == 1) {
        res.addAll(cosets.get(k));
      }
      ++k;
      s >>>= 1;
    }
    return res;
  }

  private Set<Integer> union(final Set<Integer> a, final Set<Integer> b) {
    final Set<Integer> union = new TreeSet<>();
    union.addAll(a);
    union.addAll(b);
    return union;
  }

  private Set<Integer> intersect(final Set<Integer> a, final Set<Integer> b) {
    final Set<Integer> intersection = new TreeSet<>();
    for (final Integer s : a) {
      if (b.contains(s)) {
        intersection.add(s);
      }
    }
    return intersection;
  }

  protected boolean isA028311(final List<Set<Integer>> cosets) {
    for (long i = 1; i < 1L << cosets.size(); ++i) {
      final Set<Integer> setI = union(cosets, i);
      for (long j = 1; j < 1L << cosets.size(); ++j) {
        if (i != j) {
          final Set<Integer> setJ = union(cosets, j);
          if (setI.size() == setJ.size() && intersect(setI, setJ).isEmpty() && union(setI, setJ).size() == mN - 1) {
            if (multiply2(setI, mN).equals(negate(setJ, mN))) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final List<Set<Integer>> cosets = cosets(mN);
      //System.out.println("cosets: " + cosets);
      if (isA028311(cosets)) {
        return Z.valueOf(mN);
      }
    }
  }
}
