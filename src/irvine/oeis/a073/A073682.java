package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073682 Prime sum of n-th group of successive primes in A073684.
 * @author Sean A. Irvine
 */
public class A073682 extends A000040 {

  @Override
  public Z next() {
    Z sum = super.next();
    do {
      sum = sum.add(super.next());
    } while (!sum.isProbablePrime());
    return sum;
  }
}
