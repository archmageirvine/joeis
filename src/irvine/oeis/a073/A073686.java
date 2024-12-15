package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073686 Group the composite numbers so that the sum of each group is a prime: (4, 6, 8, 9, 10), (12, 14, 15), (16, 18, 20, 21, 22), (24, 25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50, 51, 52, 54, 55), ...; sequence gives sum of terms in each group.
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
