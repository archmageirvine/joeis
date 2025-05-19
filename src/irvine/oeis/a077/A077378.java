package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A077378 Squarefree numbers whose external as well as internal digits form a squarefree number.
 * @author Sean A. Irvine
 */
public class A077378 extends Sequence1 {

  private final Sequence mS = new A005117().skip(75);

  private boolean is(final Z n) {
    return !n.isOne() && Predicates.SQUARE_FREE.is(n);
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = mS.next();
      final String t = s.toString();
      if (Predicates.SQUARE_FREE.is((t.charAt(0) - '0') * 10 + t.charAt(t.length() - 1) - '0') && is(new Z(t.substring(1, t.length() - 1)))) {
        return s;
      }
    }
  }
}
