package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073684.
 * @author Sean A. Irvine
 */
public class A077282 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z sum = p;
    do {
      sum = sum.add(super.next());
    } while (!Predicates.SQUARE.is(sum));
    return p;
  }
}
