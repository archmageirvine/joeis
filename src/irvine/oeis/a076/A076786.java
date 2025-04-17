package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A076786 Squarefree numbers such that in decimal representation all their prefixes are also squarefree.
 * @author Sean A. Irvine
 */
public class A076786 extends A005117 {

  private boolean is(final Z n) {
    Z m = n.divide(10);
    while (!m.isZero()) {
      if (!Predicates.SQUARE_FREE.is(m)) {
        return false;
      }
      m = m.divide(10);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      if (is(s)) {
        return s;
      }
    }
  }
}
