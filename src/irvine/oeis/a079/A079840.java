package irvine.oeis.a079;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A079840 Largest multiple of n as a concatenation of its partitions.
 * @author Sean A. Irvine
 */
public class A079840 extends Sequence1 {

  // After Chai Wah Wu

  private int mN = 0;

  private int getDigitLength(final int[] p) {
    final StringBuilder sb = new StringBuilder();
    for (final int v : p) {
      sb.append(v);
    }
    return sb.length();
  }

  private boolean hasPartEndingIn0(final int[] p) {
    for (final int v : p) {
      if (v % 10 == 0) {
        return true;
      }
    }
    return false;
  }

  private Collection<int[]> partitions(final int n) {
     final TreeSet<int[]> res = new TreeSet<>(Comparators.DECREASING_LENGTH_DECREASING_VALUE);
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      res.add(p);
    }
    return res;
  }

  private boolean is125PowerTen(long n) {
    while (n % 10 == 0) {
      n /= 10;
    }
    return n == 1 || n == 2 || n == 5;
  }

  @Override
  public Z next() {
    if (is125PowerTen(++mN)) {
      return Z.valueOf(mN);
    }
    Z max = Z.ZERO;
    int len = 1;
    for (final int[] p : partitions(mN)) {
      // There is no point in checking a partition with a total digit length
      // smaller than the length of the current best solution
      final int plen = getDigitLength(p);
      if (getDigitLength(p) >= len && (mN % 10 != 0 || hasPartEndingIn0(p))) {
        final Permutation perm = new Permutation(p);
        int[] q;
        while ((q = perm.next()) != null) {
          final Z t = Permutation.permToZ(q);
          if (t.compareTo(max) > 0 && t.mod(mN) == 0) {
            max = t;
            len = plen;
          }
        }
      }
    }
    return max;
  }

}

