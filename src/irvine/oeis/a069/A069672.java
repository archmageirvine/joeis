package irvine.oeis.a069;

import irvine.math.IntegerUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A069055.
 * @author Sean A. Irvine
 */
public class A069672 extends Sequence1 {

  // After Robert Israel

  private static final int[] S = {1, 3, 6, 9};
  private int mD = 0;

  private boolean bump(final int[] a, final int max) {
    for (int k = a.length - 1, i = 0; k >= 0; --k, ++i) {
      if (++a[k] + i < max) {
        for (int j = k + 1; j < a.length; ++j) {
          a[j] = a[j - 1] + 1;
        }
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mD;
    for (final int s : S) {
      final IntegerPartition part = new IntegerPartition(s);
      int[] q;
      Z best = Z.ZERO;
      while ((q = part.next()) != null) {
        final Permutation perm = new Permutation(q);
        int[] p;
        while ((p = perm.next()) != null) {
          final int[] pos = IntegerUtils.identity(new int[p.length]);
          do {
            if (pos[pos.length - 1] == mD - 1) {
              Z x = Z.ZERO;
              for (int k = 0; k < pos.length; ++k) {
                x = x.add(Z.TEN.pow(pos[k]).multiply(p[k]));
              }
              if (x.compareTo(best) > 0 && Predicates.TRIANGULAR.is(x)) {
                best = x;
              }
            }
          } while (bump(pos, mD));
        }
      }
      if (!best.isZero()) {
        return best;
      }
    }
    throw new UnsupportedOperationException();
  }
}
