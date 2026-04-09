package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a080.A080761;

/**
 * A084389 a(n) = least positive k such that k^3 + A080761(n) is a square.
 * @author Sean A. Irvine
 */
public class A084389 extends A080761 {

  @Override
  public Z next() {
    final Z t = super.next();
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (Predicates.SQUARE.is(k.pow(3).add(t))) {
        return k;
      }
    }
  }
}
