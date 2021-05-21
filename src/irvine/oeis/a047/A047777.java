package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A047777 Primes seen in decimal expansion of Pi (disregarding the decimal period) contiguous, smallest and distinct.
 * @author Sean A. Irvine
 */
public class A047777 extends A000796 {

  @Override
  public Z next() {
    Z t = Z.ZERO;
    do {
      t = t.multiply(10).add(super.next());
    } while (!t.isProbablePrime());
    return t;
  }
}
