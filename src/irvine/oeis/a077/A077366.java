package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A077366 Triangular numbers whose internal digits form a triangular number. Or triangular number such that deleting the MSD and LSD leaves a triangular number.
 * @author Sean A. Irvine
 */
public class A077366 extends Sequence1 {

  private final Sequence mTriangular = new A000217();

  @Override
  public Z next() {
    while (true) {
      final Z s = mTriangular.next();
      final String t = s.toString();
      if (t.length() < 3 || Predicates.TRIANGULAR.is(new Z(t.substring(1, t.length() - 1)))) {
        return s;
      }
    }
  }
}
