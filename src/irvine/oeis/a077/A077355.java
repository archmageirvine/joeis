package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A077355 Squares whose internal digits form a square.
 * @author Sean A. Irvine
 */
public class A077355 extends Sequence1 {

  private final Sequence mSquares = new A000290();

  @Override
  public Z next() {
    while (true) {
      final Z s = mSquares.next();
      final String t = s.toString();
      if (t.length() < 3 || Predicates.SQUARE.is(new Z(t.substring(1, t.length() - 1)))) {
        return s;
      }
    }
  }
}
