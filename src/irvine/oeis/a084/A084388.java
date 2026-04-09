package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a080.A080761;

/**
 * A084388 a(n) = least positive k such that k^2 - A080761(n) is a cube.
 * @author Sean A. Irvine
 */
public class A084388 extends A080761 {

  @Override
  public Z next() {
    final Z t = super.next();
    Z k = t.sqrt();
    while (true) {
      k = k.add(1);
      if (Predicates.CUBE.is(k.square().subtract(t))) {
        return k;
      }
    }
  }
}
