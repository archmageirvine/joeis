package irvine.oeis.a048;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048141.
 * @author Sean A. Irvine
 */
public class A048141 implements Sequence {

  private int mN = 0;
  private final List<Map<int[], Long>> mCache = new ArrayList<>();

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

  private boolean isPerfectlyBalanced(final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      if (p[k] > p.length || p[p[k] - 1] <= k) {
        return false;
      }
    }
    return true;
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
    //System.out.println("Trying for " + mN);
    long count = 0;
    final TreeMap<int[], Long> map = new TreeMap<>(ARRAY_COMPARATOR);
    mCache.add(map);
    for (int arm = mN; arm > 0; --arm) {
      long c = 0;
      final IntegerPartition part = new IntegerPartition(arm);
      int[] p;
      while ((p = part.next()) != null) {
        //System.out.println("  Partition: " + Arrays.toString(p));
        if (!isPerfectlyBalanced(p)) {
          continue;
        }
        final int residue = mN - 3 * (arm - p[0]) - 1;
        if (residue < 0) {
          continue;
        }
        //System.out.println("  Balanced: n=" + arm + " " + Arrays.toString(p) + " leaves " + residue);
        final long pc = count(residue, Arrays.copyOfRange(p, 1, p.length));
        //System.out.println("  " + Arrays.toString(p) + " contributes " + pc);
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
