package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077279 Last prime of n-th group of successive primes in A073684.
 * @author Sean A. Irvine
 */
public class A077279 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    Z sum = p;
    do {
      p = super.next();
      sum = sum.add(p);
    } while (!sum.isProbablePrime());
    return p;
  }
}
