package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A077395 Lesser of two successive squarefree numbers whose product is not squarefree.
 * @author Sean A. Irvine
 */
public class A077395 extends Sequence1 {

  private final Sequence mSquareFree = new A005117();
  private Z mA = mSquareFree.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mSquareFree.next();
      if (!Predicates.SQUARE_FREE.is(t.multiply(mA))) {
        return t;
      }
    }
  }
}
