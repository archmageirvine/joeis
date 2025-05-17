package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A077367 Triangular numbers whose external digits form a triangular number. Or triangular number whose MSD and LSD form a triangular number.
 * @author Sean A. Irvine
 */
public class A077367 extends Sequence1 {

  private final Sequence mTriangular = new A000217();

  @Override
  public Z next() {
    while (true) {
      final Z s = mTriangular.next();
      final String t = s.toString();
      if (t.length() < 3 || Predicates.TRIANGULAR.is((t.charAt(0) - '0') * 10 + t.charAt(t.length() - 1) - '0')) {
        return s;
      }
    }
  }
}
