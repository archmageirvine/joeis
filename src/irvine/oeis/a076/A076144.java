package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A076082.
 * @author Sean A. Irvine
 */
public class A076144 extends A005117 {

  @Override
  public Z next() {
    final Z s = super.next();
    if (Z.ONE.equals(s)) {
      return Z.ONE;
    }
    Z t = s;
    while (true) {
      t = t.subtract(1);
      if (Predicates.SQUARE_FREE.is(s.multiply(t))) {
        return t;
      }
    }
  }
}
