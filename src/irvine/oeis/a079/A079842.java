package irvine.oeis.a079;

import java.util.Collection;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.partition.IntegerPartition;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A079842 Largest square which is a concatenation of partitions of n; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A079842 extends Sequence1 {

  private int mN = 0;

  private int getDigitLength(final int[] p) {
    final StringBuilder sb = new StringBuilder();
    for (final int v : p) {
      sb.append(v);
    }
    return sb.length();
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

  @Override
  public Z next() {
    Z max = Z.ZERO;
    int len = 1;
    for (final int[] p : partitions(++mN)) {
      // There is no point in checking a partition with a total digit length
      // smaller than the length of the current best solution
      final int plen = getDigitLength(p);
      if (getDigitLength(p) >= len) {
        final Permutation perm = new Permutation(p);
        int[] q;
        while ((q = perm.next()) != null) {
          final Z t = Permutation.permToZ(q);
          if (t.compareTo(max) > 0 && Predicates.SQUARE.is(t)) {
            max = t;
            len = plen;
          }
        }
      }
    }
    return max;
  }

}

