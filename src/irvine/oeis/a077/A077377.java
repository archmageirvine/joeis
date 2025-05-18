package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A077377 Squarefree numbers whose external digits form a squarefree number.
 * @author Sean A. Irvine
 */
public class A077377 extends Sequence1 {

  private final Sequence mS = new A005117();

  @Override
  public Z next() {
    while (true) {
      final Z s = mS.next();
      final String t = s.toString();
      if (t.length() < 3 || Predicates.SQUARE_FREE.is((t.charAt(0) - '0') * 10 + t.charAt(t.length() - 1) - '0')) {
        return s;
      }
    }
  }
}
