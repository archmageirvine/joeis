package irvine.oeis.a069;

import irvine.math.IntegerUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A069672 Largest n-digit triangular number with minimum digit sum.
 * @author Sean A. Irvine
 */
public class A069672 extends Sequence1 {

  // After Robert Israel

  private static final int[] S = {1, 3, 6, 9};
  private int mD = 0;

  @Override
  public Z next() {
    ++mD;
    final Bumper bumper = BumperFactory.increasing(mD);
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
          } while (bumper.bump(pos));
        }
      }
      if (!best.isZero()) {
        return best;
      }
    }
    throw new UnsupportedOperationException();
  }
}
