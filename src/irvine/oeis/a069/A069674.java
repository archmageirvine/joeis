package irvine.oeis.a069;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;
import irvine.util.Permutation;

/**
 * A069674 Triangular numbers whose digit permutations yield at least two further triangular numbers.
 * @author Sean A. Irvine
 */
public class A069674 extends Sequence1 {

  private final Sequence mT = new A000217();

  @Override
  public Z next() {
    while (true) {
      final Z t = mT.next();
      final Permutation perm = Permutation.permuter(t);
      int[] p;
      int cnt = 0;
      while ((p = perm.next()) != null) {
        if (Predicates.TRIANGULAR.is(Permutation.permToZ(p)) && ++cnt >= 3) {
          return t;
        }
      }
    }
  }
}
