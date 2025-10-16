package irvine.oeis.a081;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A081217 Greatest squarefree number not exceeding n-th prime power.
 * @author Sean A. Irvine
 */
public class A081217 extends A000961 {

  @Override
  public Z next() {
    Z t = super.next();
    while (!Predicates.SQUARE_FREE.is(t)) {
      t = t.subtract(1);
    }
    return t;
  }
}
