package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A069800 Triangular array in which n-th row consists of numbers with digit sum n arranged in increasing numerical order.
 * @author Sean A. Irvine
 */
public class A069800 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      for (int parts = 1; parts <= mN; ++parts) {
        final FixedLengthPartition part = new FixedLengthPartition(mN, parts, 1, 9);
        int[] p;
        while ((p = part.next()) != null) {
          final Permutation perm = new Permutation(p);
          int[] q;
          while ((q = perm.next()) != null) {
            mA.add(Permutation.permToZ(q));
          }
        }
      }
    }
    return mA.pollFirst();
  }
}

