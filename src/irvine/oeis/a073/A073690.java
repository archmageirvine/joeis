package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073690 Group the natural numbers so that the product of the terms in each group + 1 is a prime: (1), (2), (3, 4), (5, 6), (7, 8, 9, 10, 11), (12), (13, 14, 15), (16), ... This is the sequence of the number of terms in each group.
 * @author Sean A. Irvine
 */
public class A073690 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 1;
    Z prod = Z.valueOf(++mN);
    while (!prod.add(1).isProbablePrime()) {
      prod = prod.multiply(++mN);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
