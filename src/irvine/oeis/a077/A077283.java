package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077283 Last prime in n-th group in A077280.
 * @author Sean A. Irvine
 */
public class A077283 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    Z sum = p;
    do {
      p = super.next();
      sum = sum.add(p);
    } while (!Predicates.SQUARE.is(sum));
    return p;
  }
}
