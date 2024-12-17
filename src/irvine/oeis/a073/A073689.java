package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073689 Group the natural numbers so that the product of the terms in each group + 1 is a prime: (1), (2), (3, 4), (5, 6), (7, 8, 9, 10, 11), (12), (13, 14, 15), (16), ... Sequence gives first term in each group.
 * @author Sean A. Irvine
 */
public class A073689 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    final long t = ++mN;
    Z prod = Z.valueOf(t);
    while (!prod.add(1).isProbablePrime()) {
      prod = prod.multiply(++mN);
    }
    return Z.valueOf(t);
  }
}
