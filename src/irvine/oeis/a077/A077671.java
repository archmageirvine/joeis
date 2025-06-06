package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;
import irvine.util.Permutation;

/**
 * A077671 Triangular numbers whose digit permutations yield at least one further triangular number.
 * @author Sean A. Irvine
 */
public class A077671 extends Sequence1 {

  private final Sequence mTriangular = new A000217();

  private boolean is(final Z t) {
    if (t.compareTo(Z.TEN) < 0) {
      return false;
    }
    final Permutation perm = Permutation.permuter(t);
    int[] p;
    while ((p = perm.next()) != null) {
      final Z u = Permutation.permToZ(p);
      if (!u.equals(t) && Predicates.TRIANGULAR.is(u)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mTriangular.next();
      if (is(t)) {
        return t;
      }
    }
  }
}
