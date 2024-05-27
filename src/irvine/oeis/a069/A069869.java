package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A069869 Largest prime that is a concatenation of the parts of a partition of n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A069869 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || (mN > 3 && mN % 3 == 0)) {
      return Z.ZERO;
    }
    // Rather than generate all partitions, we generate by decreasing length
    final TreeSet<Z> s = new TreeSet<>();
    for (int len = mN; true; --len) {
      final FixedLengthPartition part = new FixedLengthPartition(mN, len, 1, mN);
      int[] p;
      while ((p = part.next()) != null) {
        final Permutation perm = new Permutation(p);
        int[] q;
        while ((q = perm.next()) != null) {
          final Z t = Permutation.permToZ(q);
          if (t.isProbablePrime()) {
            s.add(t);
          }
        }
      }
      if (!s.isEmpty()) {
        return s.pollLast();
      }
    }
  }
}

