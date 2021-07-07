package irvine.oeis.a048;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.partitions.DistinctOddPartsPartitions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048141 Number of symmetrical planar partitions of n: planar partitions (A000219) that when regarded as 3-D objects have a threefold axis of symmetry that is the intersection of 3 mirror planes, i.e., C3v symmetry.
 * @author Sean A. Irvine
 */
public class A048141 implements Sequence {

  private int mN = 0;
  private final List<Map<int[], Long>> mCache = new ArrayList<>();
  private final List<List<int[]>> mPerfectlyBalanced = new ArrayList<>();
  {
    mPerfectlyBalanced.add(Collections.emptyList()); // 0
  }

  private static final Comparator<int[]> ARRAY_COMPARATOR = (o1, o2) -> {
    final int c = Integer.compare(o1.length, o2.length);
    if (c != 0) {
      return c;
    }
    for (int k = 0; k < o1.length; ++k) {
      final int d = Integer.compare(o1[k], o2[k]);
      if (d != 0) {
        return d;
      }
    }
    return 0;
  };

  private boolean isOverMajored(final int[] outer, final int[] inner) {
    if (inner.length > outer.length) {
      return false;
    }
    for (int k = 0; k < inner.length; ++k) {
      if (inner[k] >= outer[k]) {
        return false;
      }
    }
    return true;
  }

//  private boolean isSelfConjugate(final int[] p) {
//    for (int k = 0; k < p.length; ++k) {
//      if (p[k] > p.length || p[p[k] - 1] <= k) {
//        return false;
//      }
//    }
//    return true;
//  }

  private List<int[]> getSelfConjugate(final int n) {
    while (n >= mPerfectlyBalanced.size()) {
      final int arm = mPerfectlyBalanced.size();
      // There is a 1-1 correspondence between partitions into distinct odd parts and self-conjugate partitions
      final List<int[]> distinct = DistinctOddPartsPartitions.partitions(arm);
      final ArrayList<int[]> balanced = new ArrayList<>(distinct.size());
      mPerfectlyBalanced.add(balanced);
      // bend them
      for (final int[] d : distinct) {
        final int[] b = new int[(d[0] + 1) / 2];
        for (int k = 0; k < d.length; ++k) {
          final int t = (d[k] - 1) / 2;
          b[k] += t;
          for (int j = 0; j <= t; ++j) {
            ++b[k + j];
          }
        }
        balanced.add(b);
      }
    }
    return mPerfectlyBalanced.get(n);
  }

  private long count(final int n, final int[] majors) {
    long c = 0;
    if (majors.length != 0) {
      for (Map.Entry<int[], Long> e : mCache.get(n).entrySet()) {
        if (isOverMajored(majors, e.getKey())) {
          c += e.getValue();
        }
      }
    }
    return c;
  }

//  private void printCache(final int n) {
//    System.out.print("n=" + n + ": ");
//    for (Map.Entry<int[], Long> e : mCache.get(n).entrySet()) {
//      System.out.print(Arrays.toString(e.getKey()) + " -> " + e.getValue() + ", ");
//    }
//    System.out.println();
//  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mCache.add(Collections.singletonMap(new int[] {}, 1L)); // n = 0
      mCache.add(Collections.singletonMap(new int[] {1}, 1L));
      return Z.ONE;
    }
    long count = 0;
    final TreeMap<int[], Long> map = new TreeMap<>(ARRAY_COMPARATOR);
    mCache.add(map);
    for (int arm = mN; arm > 0; --arm) {
      long c = 0;
      for (final int[] p : getSelfConjugate(arm)) {
        final int residue = mN - 3 * (arm - p[0]) - 1;
        if (residue < 0) {
          continue;
        }
        final long pc = count(residue, Arrays.copyOfRange(p, 1, p.length));
        if (pc != 0) {
          map.put(p, pc);
        }
        c += pc;
      }
      count += c;
    }
    //printCache(mN);
    return Z.valueOf(count);
  }
}
