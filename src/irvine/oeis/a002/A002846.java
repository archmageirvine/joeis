package irvine.oeis.a002;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002846 Number of ways of transforming a set of n indistinguishable objects into n singletons via a sequence of n-1 refinements.
 * @author Sean A. Irvine
 */
public class A002846 extends Sequence1 {

  private static class MyComparator implements Comparator<int[]>, Serializable {
    @Override
    public int compare(final int[] a, final int[] b) {
      final int c = Integer.compare(a.length, b.length);
      if (c != 0) {
        return c;
      }
      for (int k = 0; k < a.length; ++k) {
        final int d = Integer.compare(a[k], b[k]);
        if (d != 0) {
          return d;
        }
      }
      return 0;
    }
  }

  private static final MyComparator COMPARATOR = new MyComparator();

  private int mN = 0;
  private final List<List<int[]>> mLattice = new ArrayList<>();
  private final List<List<List<Integer>>> mRefinementOf = new ArrayList<>();
  private final List<List<Z>> mCount = new ArrayList<>();

  private List<int[]> partitionsSortedByParts(final int n) {
    final ArrayList<int[]> res = new ArrayList<>();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      res.add(p);
    }
    res.sort(COMPARATOR);
    return res;
  }

  // Is p a refinement of q
  private boolean isRefinement(final int[] p, final int[] q) {
    //System.out.print(java.util.Arrays.toString(p) + " cf. " + java.util.Arrays.toString(q) + " ");
    if (p.length != q.length + 1) {
      return false;
    }
    final boolean[] used = new boolean[q.length];
    int pa = 0;
    int pb = 0;
    for (final int vp : p) {
      boolean ok = false;
      for (int k = 0; k < q.length; ++k) {
        if (q[k] < vp) {
          // Efficiency, partitions are sorted
          break;
        }
        if (!used[k] && vp == q[k]) {
          used[k] = true;
          ok = true;
          break;
        }
      }
      if (ok) {
        continue;
      }
      if (pb != 0) {
        return false;
      }
      if (pa == 0) {
        pa = vp;
      } else {
        pb = vp;
      }
    }
    // Find unused value in q, there can only be 1
    for (int k = 0; k < q.length; ++k) {
      if (!used[k]) {
        return pa + pb == q[k];
      }
    }
    throw new RuntimeException();
  }

  private void buildLattice(final int n) {
    mLattice.clear();
    mLattice.add(null); // 0th element
    mRefinementOf.clear();
    mRefinementOf.add(null); // 0th element
    mCount.clear();
    mCount.add(null);
    for (final int[] partition : partitionsSortedByParts(n)) {
      final int parts = partition.length;
      if (parts == 1) {
        mLattice.add(Collections.singletonList(partition));
        mRefinementOf.add(Collections.singletonList(Collections.emptyList()));
        mCount.add(Collections.singletonList(Z.ONE));
      } else {
        if (parts == mLattice.size()) {
          mLattice.add(new ArrayList<>());
          mRefinementOf.add(new ArrayList<>());
          mCount.add(new ArrayList<>());
        }
        mLattice.get(parts).add(partition);
        final ArrayList<Integer> refinements = new ArrayList<>();
        mRefinementOf.get(parts).add(refinements);
        final List<int[]> parents = mLattice.get(parts - 1);
        final List<Z> counts = mCount.get(parts - 1);
        Z count = Z.ZERO;
        for (int k = 0; k < parents.size(); ++k) {
          if (isRefinement(partition, parents.get(k))) {
            refinements.add(k);
            count = count.add(counts.get(k));
          }
        }
        mCount.get(parts).add(count);
      }
    }
  }

  @Override
  public Z next() {
    buildLattice(++mN);
    return mCount.get(mCount.size() - 1).get(0);
  }

}

