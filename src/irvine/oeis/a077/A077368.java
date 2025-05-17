package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A077368 Triangular numbers whose external digits as well as internal digits form triangular numbers.
 * @author Sean A. Irvine
 */
public class A077368 extends Sequence1 {

  private final Sequence mTriangular = new A000217();

  @Override
  public Z next() {
    while (true) {
      final Z s = mTriangular.next();
      final String t = s.toString();
      if (t.length() < 3 || (Predicates.TRIANGULAR.is((t.charAt(0) - '0') * 10 + t.charAt(t.length() - 1) - '0') && Predicates.TRIANGULAR.is(new Z(t.substring(1, t.length() - 1))))) {
        return s;
      }
    }
  }
}
