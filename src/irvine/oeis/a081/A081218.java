package irvine.oeis.a081;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A081210.
 * @author Sean A. Irvine
 */
public class A081218 extends A025475 {

  @Override
  public Z next() {
    Z t = super.next();
    while (!Predicates.SQUARE_FREE.is(t)) {
      t = t.subtract(1);
    }
    return t;
  }
}
