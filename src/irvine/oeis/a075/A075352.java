package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A075352 Group the natural numbers so that the product of the terms of the n-th group is just &gt;= n!: (1), (2), (3, 4), (5, 6), (7, 8, 9), (10, 11, 12), (13, 14, 15, 16), (17, 18, 19, 20), (21, 22, 23, 24, 25), (26, 27, 28, 29, 30), ... Sequence gives product of numbers in each group.
 * @author Sean A. Irvine
 */
public class A075352 extends Sequence1 {

  private final Sequence mFactorials = new A000142().skip();
  private long mN = 1;

  @Override
  public Z next() {
    final Z f = mFactorials.next();
    Z prod = Z.ONE;
    while (prod.compareTo(f) < 0) {
      prod = prod.multiply(++mN);
    }
    return prod;
  }
}
