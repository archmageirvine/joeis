package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073688 Group the natural numbers so that the product of the terms in each group + 1 is a prime: (1), (2), (3, 4), (5, 6), (7, 8, 9, 10, 11), (12), (13, 14, 15), (16), ... This is the sequence of such primes.
 * @author Sean A. Irvine
 */
public class A073688 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    do {
      prod = prod.multiply(++mN);
    } while (!prod.add(1).isProbablePrime());
    return prod.add(1);
  }
}
