package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A077376 Squarefree numbers whose internal digits form a squarefree number.
 * @author Sean A. Irvine
 */
public class A077376 extends Sequence1 {

  private final Sequence mS = new A005117().skip(75);

  @Override
  public Z next() {
    while (true) {
      final Z s = mS.next();
      final String t = s.toString();
      final Z inner = new Z(t.substring(1, t.length() - 1));
      if (!inner.isOne() && Predicates.SQUARE_FREE.is(inner)) {
        return s;
      }
    }
  }
}
