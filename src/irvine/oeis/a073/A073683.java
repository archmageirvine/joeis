package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073683 Group the primes such that the sum of each group is a prime. Each group from the second onwards should contain at least 3 primes: (2, 3), (5, 7, 11), (13, 17, 19, 23, 29), (31, 37, 41), (43, 47, 53, 59, 61), ... This is the sequence of the leading element in each group.
 * @author Sean A. Irvine
 */
public class A073683 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z sum = p;
    do {
      sum = sum.add(super.next());
    } while (!sum.isProbablePrime());
    return p;
  }
}
