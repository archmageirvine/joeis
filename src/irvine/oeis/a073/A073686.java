package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073686 Group the composite numbers so that the sum of each group is a prime; sequence gives sum of terms in each group.
 * @author Sean A. Irvine
 */
public class A073686 extends A002808 {

  @Override
  public Z next() {
    Z sum = super.next();
    do {
      sum = sum.add(super.next());
    } while (!sum.isProbablePrime());
    return sum;
  }
}
