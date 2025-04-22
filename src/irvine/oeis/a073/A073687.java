package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073687 Group the composite numbers so that the sum of each group is a prime; sequence gives first term in each group.
 * @author Sean A. Irvine
 */
public class A073687 extends A002808 {

  @Override
  public Z next() {
    final Z c = super.next();
    Z sum = c;
    do {
      sum = sum.add(super.next());
    } while (!sum.isProbablePrime());
    return c;
  }
}
